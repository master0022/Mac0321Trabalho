package Trabalho;

public class Evento_TrocarPokemon extends Evento {

	public Evento_TrocarPokemon(Treinador Ativo, Treinador Alvo) {
		super(Ativo, Alvo, 5000);

	}
	
	public void Executar() {
		this.ativo.TrocaPokemonAtivo();
	}
}
