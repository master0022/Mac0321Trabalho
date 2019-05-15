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
				System.out.println(" voce decidiu ataca");
			}
			
			if ( acao.equals("2")) 
			{
				System.out.println(" voce decidiu usa item");
			}
			
		}
		return null;
	}
	
	
	
}
