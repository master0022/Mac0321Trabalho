package Trabalho;

public class Ataque {
	private String Nome;
	private int Poder;
	private int Prioridade;
	
	public Ataque() {
		Nome = GeraNomes.NomeAtaque();
		double a = (Math.random()*400+100);
		double b = (Math.random()*40+15);
		double c = (Math.random()*10+10);
		double d = (Math.random()*5+2);
		Poder = (int)( a*b*c*d/20000 );
		Prioridade = (int)(Math.random()*1000);
	}
	public int GetPrioridade() {
		return Prioridade;
	}
	public int GetPoder() {
		return Poder;
	}
	
	public String getNome() {
		return Nome;
	}
}
