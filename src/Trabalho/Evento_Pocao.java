package Trabalho;

public class Evento_Pocao extends Evento {
	Pocao pocao;
	public Evento_Pocao(Treinador Ativo, Treinador Alvo,  Pocao pocao) {
		super(Ativo, Alvo, pocao.GetPrioridade());
		this.pocao=pocao;
	}
	
	public void Executar() {
		this.ativo.UsaPocao(pocao);
		System.out.println("O treinador "+ ativo.getNome()+ " utilizou poção");
	}
}
