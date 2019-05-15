package Trabalho;

public class Evento_TrocarPokemon extends Evento {
	int indice;
	public Evento_TrocarPokemon(Treinador Ativo, Treinador Alvo, int indice) {
		super(Ativo, Alvo, 5000);
		this.indice=indice;

	}
	public Evento_TrocarPokemon(Treinador Ativo, Treinador Alvo) {
		super(Ativo, Alvo, 5000);
		this.indice=-1;
	}
	
	public void Executar() {
		if (indice>=0)this.ativo.TrocarPokemonAtivo(indice);
		else this.ativo.TrocarPokemonAtivo();
		Pokemon p= ativo.GetPokemon_Ativo();
		System.out.println("Vai, "+ p.GetNome()+ " !");
	}
}
