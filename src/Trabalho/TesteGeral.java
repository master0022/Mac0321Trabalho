package Trabalho;

import java.util.Scanner;

public class TesteGeral {

	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);
		int n = 5;
		Treinador eu = new Treinador(4,"Thales",false);
		Mapa a = Mapa.CriaMapa();

		eu.SetPlayer();
		while (true)a.update(eu,Input.next());
		
		
		
		
		
		
	}

}
