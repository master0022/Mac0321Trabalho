package Trabalho;

public abstract class Evento {
	protected Treinador ativo;
	protected Treinador alvo;
	protected int prioridade;
	
	public Evento(Treinador ativo, Treinador alvo, int prioridade) {
		this.ativo=ativo;
		this.alvo=alvo;
		this.prioridade=prioridade;
	}
	
	public void Executar() {}
	public int GetPrioridade() {return prioridade;}
}
