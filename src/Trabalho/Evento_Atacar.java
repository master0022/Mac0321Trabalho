package Trabalho;

public class Evento_Atacar extends Evento {
	Ataque ataque;
	public Evento_Atacar(Treinador Ativo, Treinador Alvo,  Ataque ataque) {
		super(Ativo, Alvo, ataque.GetPrioridade());
		this.ataque=ataque;
	}
	
	public void Executar() {
		Pokemon A= ativo.GetPokemon_Ativo();
		Pokemon B= alvo.GetPokemon_Ativo();
		System.out.println("O treinador "+ ativo.getNome()+ " atacou");
		System.out.println( A.GetNome()+" atacou "+ B.GetNome()+ " com "+ ataque.getNome() );
		alvo.SofreAtaque(ataque);
	}
}
