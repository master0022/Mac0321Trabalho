package Trabalho;

import java.util.Scanner;

public class TesteGeral {

	public static void main(String[] args) {
		
		Scanner Input = new Scanner(System.in);
		Treinador eu = new Treinador(3,"Monitor muito legal",false);//( Numero de pokemons, Nome, Se é um " Treinador Selvagem " )
		
		Mapa a = Mapa.CriaMapa();

		eu.SetPlayer();// Se nao tiver isso, as batalhas ocorrerao automaticamente.
		
		//Para simular uma batalha entre dois treinadores, basta fazer Batalha.Acontece( Treinador1,Treinador2 )
		
		System.out.println("\n\n Voce esta no canto superior esquerdo do mapa, representado por um P. Para se mover, use as teclas wasd. Para sair do jogo, mande 'e' ");
		
		while ( ! a.update(eu,Input.next())) {};
		//a.update() retorna um booleano que diz se o jogo ja acabou.
		
		
		
		
		
	}

}
