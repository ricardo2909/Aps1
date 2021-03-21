package br.edu.insper.desagil.Aps1;

import java.util.HashMap;
import java.util.Map;

public class Caixa {
	private Map <Integer, Integer> descontos;

	public Caixa() {
		super();
		this.descontos = new HashMap<>();
	}
	
	public void CriaDesconto(Produto produto, int porcentagemDesconto) {
		if (porcentagemDesconto > 0 && porcentagemDesconto <= 99) {
			this.descontos.put(produto.getCodigo(), porcentagemDesconto);
			return ;
		}
	}
	
	public double soma(Carrinho carrinho) {
		double porcentagemDesconto = 0;
		float totalPreco = 0;
		for (Pedido pedido: carrinho.getPedidos() ) {
			int codigo;
			codigo = pedido.getProduto().getCodigo();
			if (this.descontos.containsKey(codigo)) {
				porcentagemDesconto = this.descontos.get(codigo);
				totalPreco += pedido.Multiplica() * (1 - (porcentagemDesconto / 100));
			}
			else {
				totalPreco += pedido.Multiplica();
			}
		}
		return totalPreco;
	}

}
