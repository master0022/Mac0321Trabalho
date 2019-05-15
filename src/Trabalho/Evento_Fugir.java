package Trabalho;

public class Evento_Fugir extends Evento {

	public Evento_Fugir(Treinador Ativo, Treinador Alvo) {
		super(Ativo, Alvo, 1000000);
		
	}
	
	public void Executar() {
		this.ativo.Fugir();
		System.out.println("O treinador "+ ativo.getNome()+ " fugiu da batalha !");
	}
}
