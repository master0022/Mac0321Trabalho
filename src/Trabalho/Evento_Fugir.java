package Trabalho;

public class Evento_Fugir extends Evento {

	public Evento_Fugir(Treinador Ativo, Treinador Alvo) {
		super(Ativo, Alvo, 50000);
		
	}
	
	public void Executar() {
		this.ativo.Fugir();
	}
}
