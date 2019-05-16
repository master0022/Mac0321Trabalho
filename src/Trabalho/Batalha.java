package Trabalho;

abstract public class Batalha {
	
	static public boolean Acontece(Treinador treinador1, Treinador treinador2){
		boolean acabou=false;
		int i=1;
		Evento acao1;
		Evento acao2;
		while (!acabou) {
			System.out.println("");
			System.out.println("Turno "+ i);
			i++;
			
			System.out.println("O HP de " +treinador1.GetPokemon_Ativo().GetNome()+ " de "+ treinador1.getNome()+ " e : " +treinador1.GetPokemon_Ativo().GetHP_Atual()+ "/"+treinador1.GetPokemon_Ativo().GetHP_Max() );
			if(treinador2.getSelvagem()==true) System.out.println("O HP do " +treinador2.GetPokemon_Ativo().GetNome()+ " selvagem e : " + treinador2.GetPokemon_Ativo().GetHP_Atual()+"/"+treinador2.GetPokemon_Ativo().GetHP_Max() );
			else System.out.println("O HP de " +treinador2.GetPokemon_Ativo().GetNome()+ " de "+ treinador2.getNome()+ " e :"+ treinador2.GetPokemon_Ativo().GetHP_Atual()+"/"+treinador2.GetPokemon_Ativo().GetHP_Max() );
			
			acao1 = treinador1.Decidir_Acao(treinador2);
			acao2 = treinador2.Decidir_Acao(treinador1);
			
			if( acao1.GetPrioridade()>=acao2.GetPrioridade() )acabou = Controlador.Executa(treinador1, treinador2, acao1, acao2);
			else acabou = Controlador.Executa(treinador2, treinador1, acao2, acao1);
			
		}
		if(( treinador1.Todos_Os_Pokemons_Mortos()==true || treinador1.Fugiu()==true ) && treinador2.getSelvagem()==false)
			System.out.println("A batalha acabou! O vencedor e : "+ treinador2.getNome());
		if(( treinador2.Todos_Os_Pokemons_Mortos()==true || treinador2.Fugiu()==true ) && treinador1.getSelvagem()==false)
			System.out.println("A batalha acabou! O vencedor e : "+ treinador1.getNome());

		return true;
	}
	
}
