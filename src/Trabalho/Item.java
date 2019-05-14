package Trabalho;

abstract public class Item {
	private String Nome;
	private int Quantidade;
	
	public Item(String Nome, int Quantidade) {
		this.Nome=Nome;
		this.Quantidade=Quantidade;
	}
	
	public int GetQuantidade() {
		return Quantidade;
	}
	
	public void UsaUm() {
		this.Quantidade--;
	}
}
