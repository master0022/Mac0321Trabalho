package Trabalho;

public class Treinador {
	private Pokemon[] pokemons;
	private int no_pokemons;
	private String nome;
	private Pocao pocao;
	private boolean selvagem,pokemon_ativo_morto;
	private int pokemon_ativo;
	private boolean todos_mortos;
	
	private boolean FUGIU;
	
	public Treinador(int no_pokemons, String nome, boolean selvagem) {
		
		this.selvagem=selvagem;
		this.no_pokemons=no_pokemons;
		this.nome=nome;
		this.pokemon_ativo=0;
		this.pokemon_ativo_morto=false;
		this.todos_mortos=false;
		this.FUGIU=false;
		this.pokemons=new Pokemon[6];
		for ( int i= 0;i<no_pokemons;i++) {
			this.pokemons[i]=Pokemon.CriaPokemon();
		}
		
		this.pocao = new Pocao(10);//todo treinador começa com 10 pocoes.
		
	}
	
	public Pokemon GetPokemon_Ativo() {
		return pokemons[pokemon_ativo];
	}
	
	public String getNome() {
		return nome;
	}
	
	public Evento Decidir_Acao(Treinador Oponente) {// precisa deixar generico, e fazer o usuario poder escolher a acao, ou ser aleatorio pra selvagem.
		boolean decidiu = false;
		while (decidiu==false) {
			
			int caso = (int) Math.round( Math.random()*3);
			
			switch (caso) {
			
				case 0:// treinador decide atacar
					return new Evento_Atacar(this,Oponente,pokemons[pokemon_ativo].GetAtaque((int) Math.round( Math.random()*3) ));
					
					
				case 1://treinador decide usar pocao
					if (pocao.GetQuantidade() != 0) {
						return new Evento_Pocao(this, Oponente, pocao);
					}
					break;
				
				case 2://treinador decide fugir
					return new Evento_Fugir(this,Oponente);
					
				case 3://treinador decide trocar para o proximo pokemon, E PODE trocar.
					for (int i=0; i<no_pokemons; i++) {
						if( pokemons[i].GetHP_Atual()>0 && i!=pokemon_ativo )return new Evento_TrocarPokemon(this,Oponente);
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
	}
	
	public void Fugir() {
		this.FUGIU=true;
		System.out.println("O treinador "+ nome+ " fugiu da batalha !");
	}
	
	public void TrocarPokemonAtivo() {
		int indice = (int) Math.round( Math.random()*(no_pokemons-1) );
		while(pokemon_ativo!=indice && pokemons[indice].VerificaMorto()==false) indice = (int) Math.round( Math.random()*no_pokemons);
		pokemon_ativo = indice;
		System.out.println("O treinador "+ nome+ "trocou de pokemon !");	
	}
	
	public boolean Fugiu() {
		return this.FUGIU;
	}
	
	public boolean Todos_Os_Pokemons_Mortos() {
		return this.todos_mortos;
	}
}
