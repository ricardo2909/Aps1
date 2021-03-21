package br.edu.insper.desagil.Aps1;

public class Testador {
	
	private Caixa teste1 = new Caixa();
	private Carrinho teste2 = new Carrinho();
	private Produto TV = new Produto(1, "TV", 2000);
	private Produto PS5 = new Produto(2, "PS5", 5000);
	
	public boolean testeA() {
		double preco;
		preco = teste1.soma(teste2);
		if (preco == 0) {
			return true;
		}
	    return false;
	}

	public boolean testeB() {
		double preco;
		teste2.aumentaQuant(PS5);
		preco = teste1.soma(teste2);
		if (preco == 5000) {
			return true;
		}
	    return false;
	}

	public boolean testeC() {
		double preco;
		teste2.aumentaQuant(PS5);
		teste1.produtocomDesconto(PS5, 5);
		preco = teste1.soma(teste2);
		if (preco == 4750) {
			return true;
		}
	    return false;
	}

	public boolean testeD() {
		double preco;
		teste2.aumentaQuant(PS5);
		teste2.aumentaQuant(TV);
		teste2.aumentaQuant(TV);
		teste1.produtocomDesconto(PS5, 10);
		preco = teste1.soma(teste2);
		if (preco == 8500) {
			return true;
		}
	    return false;
	}

	public boolean testeE() {
		double preco;
		teste2.aumentaQuant(PS5);
		teste2.aumentaQuant(PS5);
		teste2.aumentaQuant(TV);
		teste1.produtocomDesconto(PS5, 15);
		preco = teste1.soma(teste2);
		if (preco == 10500) {
			return true;
		}
	    return false;
	}

}
