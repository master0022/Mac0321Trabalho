package Trabalho;

public class TesteGeral {

	public static void main(String[] args) {
		int n = 2;
		while (n>1) {
		Treinador eu = new Treinador(2,"Ash",false);
		Treinador oponente = new Treinador(1,"Nao o Ash",true);
		
		Batalha.Acontece(eu, oponente);
		eu=null;
		oponente=null;
		n--;
		}
	}

}
