package Trabalho;

public class Evento_Fugir extends Evento {

	public Evento_Fugir(Treinador Ativo, Treinador Alvo) {
		super(Ativo, Alvo, 1000000);
		
	}
	
	public void Executar() {
		this.ativo.Fugir();
		if (ativo.getSelvagem())System.out.println("O treinador "+ ativo.getNome()+ " fugiu da batalha !");
		else System.out.println("O "+ ativo.GetPokemon_Ativo().GetNome()+ " selvagem fugiu da batalha !");
	}
}
