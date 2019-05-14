package Trabalho;

public class Pocao extends Item {
	
	public Pocao(int Quantidade) {
		super("Pocao Simples ( 30HP )", Quantidade);
	}
	
	public int GetPrioridade() {
		return (int) ( Math.random()*1000+1000);
	}
	public int GetPoder() {
		return 30;
	}
}
