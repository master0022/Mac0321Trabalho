package Trabalho;
import java.util.Scanner;

abstract public class Input {
	
	static public Evento InputBatalha(Treinador treinador, Treinador oponente) {
		
		Scanner Input = new Scanner(System.in);
		String acao = "";

		while (true) 
		{
			System.out.println(" voce pode fazer ataque[1] item[2] fuga[3] ou trocar pokemon[4]. O que voce faz ? ");
			acao = Input.next();
			
			if ( acao.equals("1")) 
			{
				Pokemon a = treinador.GetPokemon_Ativo();
				System.out.println(" Voce decidiu atacar ");
				System.out.println(" 1- "	+ a.GetAtaque(0).getNome()+ " " + a.GetAtaque(0).GetPoder()+ 
									"\n 2- " + a.GetAtaque(1).getNome()+ " " + a.GetAtaque(1).GetPoder()+ 
									"\n 3- " +a.GetAtaque(2).getNome()+ " " + a.GetAtaque(2).GetPoder()+ 
									"\n 4- " +a.GetAtaque(3).getNome()+ " " + a.GetAtaque(0).GetPoder() );
				acao = Input.next();
				if(acao.equals("1"))return new Evento_Atacar(treinador, oponente, a.GetAtaque(0));
				if(acao.equals("2"))return new Evento_Atacar(treinador, oponente, a.GetAtaque(1));
				if(acao.equals("3"))return new Evento_Atacar(treinador, oponente, a.GetAtaque(2));
				if(acao.equals("4"))return new Evento_Atacar(treinador, oponente, a.GetAtaque(3));
			}
			
			if ( acao.equals("2")) 
			{
				System.out.println(" Voce decidiu usar item ");
				System.out.println(" 1- Pokebola \n 2- Poção 30 HP "); 
				acao = Input.next();
				
				if(acao.equals("1"))return new Evento_Pokebola(treinador,oponente, (Pokebola) treinador.GetItems()[0]);//nada
				if(acao.equals("2"))return new Evento_Pocao(treinador,oponente, treinador.GetItems()[1]);
					
			}
			
			if ( acao.equals("3")) {
				System.out.println(" Voce decidiu fugir ");
				return new Evento_Fugir(treinador, oponente);
			}
			
			if ( acao.equals("4")) {
				System.out.println(" Voce decidiu trocar de pokemon, escolha um pokemon a seguir: ");
				//fazer varios prints com nome + HP_ATUAl do pokemon, e varios ifs que dao eventos diferentes.
				int indice=0;
				return new Evento_TrocarPokemon(treinador, oponente,indice);
			}
			
		}
	}
	
	
	
}
