package Trabalho;

public class TesteGeral {

	public static void main(String[] args) {
		Treinador eu = new Treinador(5,"Ash",false);
		Treinador oponente = new Treinador(5,"Nao o Ash",true);
		
		Batalha.Acontece(eu, oponente);
	}

}
