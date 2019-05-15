package Trabalho;

public class Pokemon {
	private int HP_Atual;
	private int HP_Max;
	private String Nome;
	private Ataque[] Ataques;
	private boolean morto;
	
	private Pokemon() {
		HP_Max = (int)( (Math.random()*40+200) * (Math.random()*40+300)* (Math.random()*15+100) * (Math.random()*25+200)/54000000 + Math.random()*200 ); // Esses pokemons tem mais vida que meu Winter Orber no Path of Exile KKKKK.
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
		System.out.println(Nome+ " tem " + HP_Atual+ " de HP ");
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
