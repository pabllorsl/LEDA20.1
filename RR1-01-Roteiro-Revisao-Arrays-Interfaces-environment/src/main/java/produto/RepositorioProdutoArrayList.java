package produto;

import java.util.ArrayList;

/**
 * Classe que representa um reposit�rio de produtos usando ArrayList como
 * estrutura sobrejacente. Alguns m�todos (atualizar, remover e procurar) ou
 * executam com sucesso ou retornam um erro. Para o caso desde exerc�cio, o erro
 * ser� representado por uma RuntimeException que n�o precisa ser declarada na
 * clausula "throws" do mos metodos.
 *
 * @author Adalberto
 */
public class RepositorioProdutoArrayList implements RepositorioProduto {

	/**
	 * A estrutura onde os produtos sao mantidos. Voce nao precisa se preocupar por
	 * enquanto com o uso de generics em ArrayList.
	 */
	private ArrayList<Produto> produtos;

	public RepositorioProdutoArrayList(int size) {
		this.produtos = new ArrayList<Produto>();
	}

	/**
	 * Recebe o codigo do produto e devolve o indice desse produto no array ou -1
	 * caso ele nao se encontre no array. Esse m�todo � util apenas na implementacao
	 * com arrays por questoes de localizacao. Outras classes que utilizam outras
	 * estruturas internas podem nao precisar desse m�todo.
	 * 
	 * @param codigo
	 * @return
	 */
	private int procurarIndice(int codigo) {
		return produtos.indexOf(new Produto(codigo, null, 0, null));
	}

	/**
	 * Recebe o codigo e diz se tem produto com esse codigo armazenado
	 * 
	 * @param codigo
	 * @return
	 */
	public boolean existe(int codigo) {
		int i = this.procurarIndice(codigo);
		boolean result = false;

		if (i != -1) {
			result = true;
		}

		return result;
	}

	/**
	 * Insere um novo produto (sem se preocupar com duplicatas)
	 */
	public void inserir(Produto produto) {
		produtos.add(produto);
	}

	/**
	 * Atualiza um produto armazenado ou retorna um erro caso o produto nao esteja
	 * no array. Note que, para localizacao, o c�digo do produto ser� utilizado.
	 */
	public void atualizar(Produto produto) {
		if (!produtos.contains(produto)) {
			throw new RuntimeException("Produto nao encontrado!");
		} else {
			produtos.remove(produto);
			produtos.add(produto);
		}
	}

	/**
	 * Remove produto com determinado codigo, se existir, ou entao retorna um erro,
	 * caso contr�rio. Note que a remo��o N�O pode deixar "buracos" no array.
	 * 
	 * @param codigo
	 */
	public void remover(int codigo) {
		if (!this.existe(codigo)) {
			throw new RuntimeException("Produto nao encontrado!");
		} else {
			produtos.remove(new Produto(codigo, null, 0, null));
		}
	}

	/**
	 * Retorna um produto com determinado codigo ou entao um erro, caso o produto
	 * nao esteja armazenado
	 * 
	 * @param codigo
	 * @return
	 */
	public Produto procurar(int codigo) {
		int i = this.procurarIndice(codigo);
		Produto result = null;

		if (i != -1) {
			result = produtos.get(i);
		}

		return result;
	}
}
