package Trabalho;

public class Ataque {
	private String Nome;
	private int Poder;
	private int Prioridade;
	
	public Ataque() {
		Nome = GeraNomes.NomeAtaque();
		Poder = (int)(Math.random()*4+1)*(int)(Math.random()*6+1)*(int)(Math.random()*3+1);
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
