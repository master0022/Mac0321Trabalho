package Trabalho;

abstract public class Controlador {
	
	static public boolean Executa(Treinador primeiro, Treinador segundo, Evento acao1, Evento acao2) {
		acao1.Executar();
		
		if ( primeiro.Fugiu() )return true;
		if ( segundo.Capiturado()==true )return true;
		
		if ( segundo.GetPokemon_Ativo().VerificaMorto()==true ) {
			if ( segundo.Todos_Os_Pokemons_Mortos()==true )return true;
			
			Evento a = new Evento_TrocarPokemon(segundo,primeiro);
			a.Executar();
		}
		
		else {
			acao2.Executar();
			if ( primeiro.Capiturado()==true )return true;
			
			if ( primeiro.GetPokemon_Ativo().VerificaMorto()==true ) {
				if ( primeiro.Todos_Os_Pokemons_Mortos()==true )return true;
				
				Evento a = new Evento_TrocarPokemon(primeiro,segundo);
				a.Executar();
			}
			
		}
		
		return false;
		
	}
}
