package Trabalho;

public class Pokemon {
	private int HP;
	private String Nome;
	private Ataque[] Ataques;
	
	private Pokemon() {
		
	}
	
	public static Pokemon CriaPokemon() {
		Pokemon temp = new Pokemon();
		return temp;
	}
	
	public int GetHP() {
		return HP;
	}
	
	public String GetNome() {
		return Nome;
	}
	private Ataque[] getAtaques() {
		return Ataques;
	}
	
}
