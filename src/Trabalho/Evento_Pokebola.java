package Trabalho;

public class Evento_Pokebola extends Evento {
	Pokebola pokebola;
	public Evento_Pokebola(Treinador ativo, Treinador alvo, Pokebola pokebola) {
		super(ativo, alvo, 3000);
		this.pokebola=pokebola;
	}

	
	public void Executar() {
		System.out.println(" Voce atira uma pokebola no "+ alvo.GetPokemon_Ativo().GetNome());
		// roda a chance de capturar, se der bom deu bom, de der ruim:
		
		System.out.println("Nao deu meu amigo");
	}
}
