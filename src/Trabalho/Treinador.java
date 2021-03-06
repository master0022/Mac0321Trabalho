package Trabalho;

public class Treinador {
	private Pokemon[] pokemons;
	private int no_pokemons;
	private String nome;
	private Item[] items;
	private boolean selvagem,pokemon_ativo_morto,player;
	private int pokemon_ativo;
	private boolean todos_mortos;
	private boolean capiturado;
	private boolean FUGIU;
	
	public Treinador(int no_pokemons, String nome, boolean selvagem) {
		
		this.selvagem=selvagem;
		this.no_pokemons=no_pokemons;
		this.nome=nome;
		this.pokemon_ativo=0;
		
		this.pokemon_ativo_morto=false;
		this.todos_mortos=false;
		this.FUGIU=false;
		this.player=false;
		this.capiturado=false;
		this.pokemons=new Pokemon[6];
		for ( int i= 0;i<no_pokemons;i++) {
			this.pokemons[i]=Pokemon.CriaPokemon();
		}
		
		this.items = new Item[2];//todo treinador come�a com 10 pocoes e pokebolas.
		this.items[0] = new Pokebola(10);
		this.items[1] = new Pocao(10);
	}
	
	public Pokemon GetPokemon_Ativo() {
		return pokemons[pokemon_ativo];
	}
	
	public String getNome() {
		return nome;
	}
	
	public Evento Decidir_Acao(Treinador Oponente) {// precisa deixar generico, e fazer o usuario poder escolher a acao, ou ser aleatorio pra selvagem.
		boolean decidiu = false;
		
		if ( this.player==true)return Input.InputBatalha( this, Oponente );
		while (decidiu==false) {
			
			int caso = (int) Math.round( Math.random()*100);
			
			
			
				if (caso<=70) {// treinador decide atacar
					if(selvagem==false) System.out.println("O treinador "+ nome+ " decidiu atacar !");
					else System.out.println("O pokemon " +pokemons[0].GetNome()+ " decidiu atacar !");
					return new Evento_Atacar(this,Oponente,pokemons[pokemon_ativo].GetAtaque((int) Math.round( Math.random()*3) ));
				}
					
				if (caso <= 90) {//treinador decide usar pocao
					if (items[1].GetQuantidade() != 0 && selvagem==false) {
						System.out.println("O treinador "+ nome+ " decidiu usar po��o !");
						return new Evento_Pocao(this, Oponente, (Pocao) items[1]);
					}
				}
				
				if ( caso ==100 ) {//treinador decide fugir
					if(selvagem==false) System.out.println("O treinador "+ nome+ " decidiu fugir !");
					else System.out.println("O pokemon " +pokemons[0].GetNome()+ " decidiu fugir !");
					return new Evento_Fugir(this,Oponente);
				}
				
				if ( caso>90 && caso <100 && selvagem==false) {//treinador decide trocar para o proximo pokemon, E PODE trocar.
					for (int i=0; i<no_pokemons; i++) {
						if( pokemons[i].GetHP_Atual()>0 && i!=pokemon_ativo ) {
							System.out.println("O treinador "+ nome+ " decidiu trocar de pokemon !");
							return new Evento_TrocarPokemon(this,Oponente);
						}
					}
				}
			}
		
		return null;//nao deveria chegar aqui
	}
	
	public void SofreAtaque(Ataque ataque) {
		pokemons[pokemon_ativo].SofreAtaque(ataque);
		if ( pokemons[pokemon_ativo].VerificaMorto()==true )
			{
			
			this.todos_mortos=true;
			for (int i=0; i<no_pokemons; i++) {
				if( pokemons[i].VerificaMorto()==false  )this.todos_mortos=false;
			}
			
			
			}
		
	}
	
	public void UsaPocao(Pocao pocao) {
		pokemons[pokemon_ativo].UsaPocao(pocao);
		items[1].UsaUm();
	}
	
	public void UsaPokebola() {
		items[0].UsaUm();
	}
	
	public void UsaPokebola( Pokemon capturado) {
		items[0].UsaUm();
		pokemons[no_pokemons]=capturado;
		no_pokemons++;
	}
	
	public void Fugir() {
		this.FUGIU=true;
	}
	
	public void TrocarPokemonAtivo() {
		int indice = (int) Math.round( Math.random()*(no_pokemons-1) );
		
		while(pokemon_ativo!=indice && pokemons[indice].VerificaMorto()==true) indice = (int) Math.round( Math.random()*(no_pokemons-1));
		pokemon_ativo = indice;
		System.out.println("O treinador "+ nome+ " trocou de pokemon !");
	}
	
	public void TrocarPokemonAtivo(int indice) {
		
		pokemon_ativo = indice;
		System.out.println("O treinador "+ nome+ " trocou de pokemon !");
	}
	
	public boolean Fugiu() {
		return this.FUGIU;
	}
	
	public boolean Todos_Os_Pokemons_Mortos() {
		return this.todos_mortos;
	}
	
	public Item[] GetItems() {
		return items;
	}
	
	public void SetPlayer() {
		this.player=true;
	}
	
	public void PrintaPokemons() {
		for(int i=0; i<no_pokemons; i++) System.out.println(+(i+1)+"- " +pokemons[i].GetNome()+" HP "+ pokemons[i].GetHP_Atual() );
	}
	public Pokemon GetPokemon(int indice) {
		return pokemons[indice];
	}
	public int GetNo_Pokemons() {
		return no_pokemons;
	}
	public boolean getSelvagem() {
		return selvagem;
	}
	
	public void ForcaCapitura() {
		this.capiturado=true;
	}
	public boolean Capiturado() {
		return this.capiturado;
	}
}
