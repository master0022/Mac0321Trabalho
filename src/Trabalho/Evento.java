package Trabalho;

public abstract class Evento {
	private Treinador ativo;
	private Treinador alvo;
	private int prioridade;
	
	public Evento(Treinador ativo, Treinador alvo, int prioridade) {
		this.ativo=ativo;
		this.alvo=alvo;
		this.prioridade=prioridade;
	}
	
	public void Executar() {}
	public int GetPrioridade() {return prioridade;}
}
