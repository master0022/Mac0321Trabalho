package Trabalho;

public class Treinador {
	private Pokemon[] pokemons;
	private int no_pokemons;
	private String nome;
	private Item[] items;
	private boolean selvagem,pokemon_ativo_morto;
	private int pokemon_ativo;
	
	
	private Treinador(int no_pokemons, String nome, int no_pokebolas, int no_pocoes, boolean selvagem) {
		
		this.selvagem=selvagem;
		this.no_pokemons=no_pokemons;
		this.nome=nome;
		this.pokemon_ativo=0;
		this.pokemon_ativo_morto=false;
		for ( int i= no_pokemons;i>0;i--) {
			this.pokemons[i-1]=Pokemon.CriaPokemon();
		}
		
		this.items[0]= new Pokebola(no_pokebolas);
		this.items[1]= new Pocao(no_pocoes);
		
	}
	
	public Pokemon GetPokemon_Ativo() {
		return pokemons[pokemon_ativo];
	}
	
	public Evento Decidir_Acao(Treinador Oponente) {// precisa deixar generico, e fazer o usuario poder escolher a acao, ou ser aleatorio pra selvagem.
		Evento_Atacar a = new Evento_Atacar(this,Oponente,pokemons[pokemon_ativo].GetAtaque(0));
		return a;
	}
	
	public void SofreAtaque(Ataque ataque) {
		pokemons[pokemon_ativo].SofreAtaque(ataque);
		if ( pokemons[pokemon_ativo].GetHP_Atual() <= 0 )pokemon_ativo_morto=true;
	}
	
}
