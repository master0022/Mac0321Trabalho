package Trabalho;

public class Pokemon {
	private int HP_Atual;
	private int HP_Max;
	private String Nome;
	private Ataque[] Ataques;
	private boolean morto;
	
	private Pokemon() {
		HP_Max = (int)(Math.random()*5) * (int)(Math.random()*6)*(int)(Math.random()*7);
		HP_Atual=HP_Max;
		morto=false;
		Nome= GeraNomes.NomePokemon();
		Ataques = new Ataque[4];
		Ataques[0]= new Ataque();
		Ataques[1]= new Ataque();
		Ataques[2]= new Ataque();
		Ataques[3]= new Ataque();
	}
	
	public static Pokemon CriaPokemon() {
		Pokemon temp = new Pokemon();
		return temp;
	}
	
	public int GetHP_Atual() {
		return HP_Atual;
	}
	
	public int GetHP_Max() {
		return HP_Max;
	}
	
	public String GetNome() {
		return Nome;
	}
	public Ataque GetAtaque(int index) {
		return Ataques[index];
	}
	
	public void SofreAtaque(Ataque ataque) {
		this.HP_Atual-=ataque.GetPoder();
		if (this.HP_Atual<=0) {
			this.HP_Atual=0;
			this.morto=true;
		}
		System.out.println(Nome+ " sofreu " + ataque.GetPoder()+ " de dano !");
		if(morto==true) System.out.println(Nome+ " fainted ");
	}
	
	public void UsaPocao(Pocao pocao) {
		this.HP_Atual+=pocao.GetPoder();
		if ( this.HP_Atual>this.HP_Max)this.HP_Atual=this.HP_Max;
	}
	
	public boolean VerificaMorto() {
		return morto;
	}
}
