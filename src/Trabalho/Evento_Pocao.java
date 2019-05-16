package Trabalho;

public class Evento_Pocao extends Evento {
	Pocao pocao;
	public Evento_Pocao(Treinador Ativo, Treinador Alvo,  Item pocao) {
		super(Ativo, Alvo, pocao.GetPrioridade());
		this.pocao=(Pocao) pocao;
	}
	
	public void Executar() {
		this.ativo.UsaPocao(pocao);
		System.out.println(ativo.getNome()+ " usou uma pocao em " +ativo.GetPokemon_Ativo().GetNome()+", seu HP:"+ ativo.GetPokemon_Ativo().GetHP_Atual()+"/"+ativo.GetPokemon_Ativo().GetHP_Max());
	}
}
