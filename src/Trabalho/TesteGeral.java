package Trabalho;

public class TesteGeral {

	public static void main(String[] args) {
		int n = 2;
		Treinador eu = new Treinador(2,"Ash",false);
		Treinador oponente = new Treinador(3,"Nao o Ash",true);
		while (n>1) 
		{
		eu = new Treinador(2,"Ash",false);
		oponente = new Treinador(1,"Nao o Ash",true);
		eu.SetPlayer();
		Batalha.Acontece(eu, oponente);
		eu=null;
		oponente=null;
		n--;
		}
		
		
		
		
		
	}

}
