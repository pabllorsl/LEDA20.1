package produto;

import java.util.ArrayList;

public class RepositorioProdutoArrayList implements RepositorioProduto {

	private ArrayList<Produto> produtos;

	public RepositorioProdutoArrayList(int size) {
		this.produtos = new ArrayList<Produto>();
	}

	private int procurarIndice(int codigo) {
		return produtos.indexOf(new Produto(codigo, null, 0, null));
	}

	public boolean existe(int codigo) {
		int i = this.procurarIndice(codigo);
		boolean result = false;

		if (i != -1) {
			result = true;
		}

		return result;
	}

	public void inserir(Produto produto) {
		produtos.add(produto);
	}

	public void atualizar(Produto produto) {
		if (!produtos.contains(produto)) {
			throw new RuntimeException("Produto nao encontrado!");
		} else {
			produtos.remove(produto);
			produtos.add(produto);
		}
	}

	public void remover(int codigo) {
		if (!this.existe(codigo)) {
			throw new RuntimeException("Produto nao encontrado!");
		} else {
			produtos.remove(new Produto(codigo, null, 0, null));
		}
	}

	public Produto procurar(int codigo) {
		int i = this.procurarIndice(codigo);
		Produto result = null;

		if (i != -1) {
			result = produtos.get(i);
		}

		return result;
	}
}
