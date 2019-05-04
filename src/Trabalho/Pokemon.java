package Trabalho;

public class Pokemon {
	private int HP_Atual;
	private int HP_Max;
	private String Nome;
	private Ataque[] Ataques;
	
	private Pokemon() {
		HP_Max = (int)(Math.random()*5) * (int)(Math.random()*6)*(int)(Math.random()*7);
		HP_Atual=HP_Max;
		Nome= GeraNomes.NomePokemon();
		Ataques = new Ataque[4];
		Ataques[1]= new Ataque();
		Ataques[2]= new Ataque();
		Ataques[3]= new Ataque();
		Ataques[4]= new Ataque();
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
	private Ataque[] GetAtaques() {
		return Ataques;
	}
	
}
