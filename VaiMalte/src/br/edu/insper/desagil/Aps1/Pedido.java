package br.edu.insper.desagil.Aps1;

public class Pedido {
	private Produto produto;
	private int quantidade;
	
	public Pedido(Produto produto) {
		super();
		this.produto = produto;
		this.quantidade = 1;
	}

	public Produto getProduto() {
		return produto;
	}

	public int getQuantidade() {
		return quantidade;
	}
	
	public void aumenta() {
		this.quantidade ++;
		return;
	}
	
	public double multi() {
		double total;
		double preco=this.produto.getPreco();
		total = this.quantidade * preco;
		return total;
		
	}

	
}