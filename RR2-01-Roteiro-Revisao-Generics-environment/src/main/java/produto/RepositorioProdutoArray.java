package produto;

public class RepositorioProdutoArray implements RepositorioProduto {

	private Produto[] produtos;
	private int index = -1;

	public RepositorioProdutoArray(int size) {
		this.produtos = new Produto[size];
	}

	private int procurarIndice(int codigo) {
		int i = 0;
		int result = -1;
		boolean achou = false;

		while ((i <= index) && !achou) {
			if (produtos[i].getCodigo() == codigo) {
				achou = true;
				result = i;
			}

			i++;
		}

		return result;
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
		produtos[++index] = produto;
	}

	public void atualizar(Produto produto) {
		int i = this.procurarIndice(produto.getCodigo());

		if (i != -1) {
			produtos[i] = produto;
		} else {
			throw new RuntimeException("Produto nao encontrado!");
		}
	}

	public void remover(int codigo) {
		int i = this.procurarIndice(codigo);

		if (i != -1) {
			produtos[i] = produtos[index];
			produtos[index] = null;
			index--;
		} else {
			throw new RuntimeException("Produto nao encontrado!");
		}

	}

	public Produto procurar(int codigo) {
		int i = this.procurarIndice(codigo);
		Produto result = null;

		if (i != -1) {
			result = produtos[i];
		} else {
			throw new RuntimeException("Produto nao encontrado!");
		}

		return result;
	}

}
