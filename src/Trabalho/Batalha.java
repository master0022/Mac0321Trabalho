package Trabalho;

abstract public class Batalha {
	
	static public boolean Acontece(Treinador treinador1, Treinador treinador2){
		boolean acabou=false;
		Evento acao1;
		Evento acao2;
		while (!acabou) {
			acao1 = treinador1.Decidir_Acao(treinador2);
			acao2 = treinador2.Decidir_Acao(treinador1);
			
			if( acao1.GetPrioridade()>=acao2.GetPrioridade() )acabou = Controlador.Executa(treinador1, treinador2, acao1, acao2);
			else acabou = Controlador.Executa(treinador2, treinador1, acao2, acao1);
			
		}
		
		System.out.println("A batalha acabou! O vencedor e : ");
		
		return true;
	}
	
}
