package Trabalho;
import java.util.Scanner;

abstract public class Input {
	
	static public Evento InputBatalha(Treinador treinador) {
		
		Scanner Input = new Scanner(System.in);
		String acao = "";
		int n = 10;
		while (n-- > 0) 
		{
			System.out.println(" voce pode fazer ataque[1] item[2] fuga[3] ou trocar pokemon[4]. O que voce faz ? ");
			acao = Input.next();
			
			if ( acao.equals("1")) 
			{
				Pokemon a = treinador.GetPokemon_Ativo();
				System.out.println(" Voce decidiu atacar ");
				System.out.println(" 1- "+ a.GetAtaque(0).getNome()+ " "+a.GetAtaque(0).GetPoder()+ "\n 2- "
+ a.GetAtaque(1).getNome()+ " " +a.GetAtaque(1).GetPoder()+ "\n 3- " +a.GetAtaque(2).getNome()+ " " +a.GetAtaque(2).GetPoder()+ 
"\n 4- " +a.GetAtaque(3).getNome()+ " "+a.GetAtaque(0).GetPoder() );
				acao = Input.next();
				if(acao.equals("1")) 
				if(acao.equals("2"))
				if(acao.equals("3"))
				if(acao.equals("4"))
			}
			
			if ( acao.equals("2")) 
			{
				System.out.println(" Voce decidiu usar item ");
				System.out.println(" 1- Pokebola \n 2- Poção 30 HP "); 
				acao = Input.next();
				if(acao.equals("1"))
				if(acao.equals("2"))
			}
			
			
		}
		return null;
	}
	
	
	
}
