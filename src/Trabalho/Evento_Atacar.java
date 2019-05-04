package Trabalho;

public class Evento_Atacar extends Evento {
	Ataque ataque;
	public Evento_Atacar(Treinador Ativo, Treinador Alvo, int Prioridade, Ataque ataque) {
		super(Ativo, Alvo, Prioridade);
		this.ataque=ataque;
	}
	
	public void Executar() {
		
	}
}
