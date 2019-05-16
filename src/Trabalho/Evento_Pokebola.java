package Trabalho;

public class Evento_Pokebola extends Evento {
	Pokebola pokebola;
	public Evento_Pokebola(Treinador ativo, Treinador alvo, Pokebola pokebola) {
		super(ativo, alvo, 3000);
		this.pokebola=pokebola;
	}

	
	public void Executar() {
		System.out.println("Voce atira uma pokebola no "+ alvo.GetPokemon_Ativo().GetNome());
		if (alvo.getSelvagem()==false)System.out.println("Voce nao pode capturar pokemons de outros treinadores !");
		else {
			Pokemon alvejado = alvo.GetPokemon_Ativo();
			double f =( (double)alvejado.GetHP_Max() ) /( (double)alvejado.GetHP_Atual() );
			f = f*255*4/12; //formula retirada da bulbapedia
			
			if ( f>= Math.random()*255  && f> 2*alvejado.GetHP_Atual()) {
				//sucesso
				System.out.println(" PA PA PA, PANANANANANANANANA \n\n"+ alvejado.GetNome()+ " foi capturado !");//seu monstro
				if (ativo.GetNo_Pokemons()>=6)System.out.println(alvejado.GetNome()+ " foi armazenado na caixa 42.");
				else {
					ativo.UsaPokebola( alvejado );
				}
				alvo.ForcaCapitura();
				return;
			}
			//fracasso
			System.out.println(alvo.GetPokemon_Ativo().GetNome()+" conseguiu fugir da pokebola !");
			
		}

	}
}
