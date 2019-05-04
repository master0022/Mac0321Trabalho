package Trabalho;

public class Evento_Atacar extends Evento {
	Ataque ataque;
	public Evento_Atacar(Treinador Ativo, Treinador Alvo,  Ataque ataque) {
		super(Ativo, Alvo, ataque.GetPrioridade());
		this.ataque=ataque;
	}
	
	public void Executar() {
		
	}
}
