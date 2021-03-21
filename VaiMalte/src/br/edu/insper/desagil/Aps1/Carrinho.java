package br.edu.insper.desagil.Aps1;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {
	private List<Pedido> pedidos;

	public List<Pedido> getPedidos() {
		return pedidos;
	}

	public Carrinho() {
		super();
		this.pedidos = new ArrayList<>();
	}
	
	public void AumentaLista(Produto produto) {
		for (Pedido pedido:pedidos) {
			if (pedido.getProduto() == produto) {
				pedido.AumentaQuantidade();
				return;
			}
		}
		
		Pedido pedido = new Pedido(produto);
		pedidos.add(pedido);
	
	}

}
