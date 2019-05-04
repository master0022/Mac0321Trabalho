package Trabalho;

public class Treinador {
	private Pokemon[] pokemons;
	private int no_pokemons;
	private String nome;
	private Item[] items;
	private int no_items;
	
	private Treinador(int no_pokemons, String nome, int no_items) {
		
		this.no_items=no_items;
		this.no_pokemons=no_pokemons;
		this.nome=nome;
		
		for ( int i= no_pokemons;i>0;i--) {
			this.pokemons[i-1]=Pokemon.CriaPokemon();
		}
		
		for ( int i= no_items;i>0;i--) {
			this.pokemons[i-1]=Pokemon.CriaPokemon();
		}
	}
}
