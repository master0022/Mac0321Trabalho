package Trabalho;

abstract public class Item {
	private String Nome;
	private int Quantidade;
	private int Prioridade;
	
	public Item(String Nome, int Quantidade) {
		this.Nome=Nome;
		this.Quantidade=Quantidade;
		this.Prioridade=3000;
	}
	
	public int GetQuantidade() {
		return Quantidade;
	}
	public int GetPrioridade() {
		return Prioridade;
	}
	public void UsaUm() {
		this.Quantidade--;
	}
}
