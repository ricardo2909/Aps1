package br.edu.insper.desagil.Aps1;

import java.util.HashMap;
import java.util.Map;

public class Caixa {
	private Map <Integer, Integer> descontos;

	public Caixa() {
		super();
		this.descontos = new HashMap<>();
	}
	
	public void produtocomDesconto(Produto produto, int porcentagem) {
		if (porcentagem > 0 && porcentagem <= 99) {
			this.descontos.put(produto.getCodigo(), porcentagem);
			return ;
		}
	}
	
	public double soma(Carrinho carrinho) {
		double porcentagem = 0;
		float totalpreco = 0;
		for (Pedido pedido: carrinho.getPedidos() ) {
			int codigo;
			codigo = pedido.getProduto().getCodigo();
			if (this.descontos.containsKey(codigo)) {
				porcentagem = this.descontos.get(codigo);
				totalpreco += pedido.multi() * (1 - (porcentagem / 100));
			}
			else {
				totalpreco += pedido.multi();
			}
		}
		return totalpreco;
	}

}
