package produto;

/**
 * Classe que representa um reposit�rio de produtos usando arrays como estrutura
 * sobrejacente. Alguns m�todos (atualizar, remover e procurar) ou executam com
 * sucesso ou retornam um erro. Para o caso desde exerc�cio, o erro ser�
 * representado por uma RuntimeException que n�o precisa ser declarada na
 * clausula "throws" do mos metodos.
 * 
 * Obs: Note que voc� deve utilizar a estrutura de dados array e n�o
 * implementa��es de array prontas da API Collections de Java (como ArrayList,
 * por exemplo).
 * 
 * @author Adalberto
 *
 */
public class RepositorioProdutoPerecivelArray {

	/**
	 * A estrutura (array) onde os produtos sao mantidos.
	 */
	private ProdutoPerecivel[] produtos;

	/**
	 * A posicao do ultimo elemento inserido no array de produtos. o valor inicial �
	 * -1 para indicar que nenhum produto foi ainda guardado no array.
	 */
	private int index = -1;

	public RepositorioProdutoPerecivelArray(int size) {
		this.produtos = new ProdutoPerecivel[size];
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
		int i = 0;
		int result = -1;
		boolean achou = false;

		while ((i < index) && !achou) { // i <= index
			if (produtos[i].getCodigo() == codigo) {
				result = i;
				achou = true;
			}

			i++;
		}

		return result;
	}

	/**
	 * Recebe o codigo e diz se tem produto com esse codigo armazenado
	 * 
	 * @param codigo
	 * @return
	 */
	public boolean existe(int codigo) {
		boolean result = false;

		int i = this.procurarIndice(codigo);

		if (i != -1) {
			result = true;
		}

		return result;
	}

	/**
	 * Insere um novo produto (sem se preocupar com duplicatas)
	 */
	public void inserir(ProdutoPerecivel produto) {
		produtos[++index] = produto;
	}

	/**
	 * Atualiza um produto armazenado ou retorna um erro caso o produto nao esteja
	 * no array. Note que, para localizacao, o c�digo do produto ser� utilizado.
	 */
	public void atualizar(ProdutoPerecivel produto) {
		int i = this.procurarIndice(produto.getCodigo());

		if (i != -1) {
			produtos[i] = produto;
		} else {
			throw new RuntimeException("Produto nao encontrado!");
		}
	}

	/**
	 * Remove produto com determinado codigo, se existir, ou entao retorna um erro,
	 * caso contr�rio. Note que a remo��o N�O pode deixar "buracos" no array.
	 * 
	 * @param codigo
	 */
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

	/**
	 * Retorna um produto com determinado codigo ou entao um erro, caso o produto
	 * nao esteja armazenado
	 * 
	 * @param codigo
	 * @return
	 */
	public ProdutoPerecivel procurar(int codigo) {
		ProdutoPerecivel result = null;

		int i = this.procurarIndice(codigo);
		if (i != -1) {
			result = produtos[i];
		} else {
			throw new RuntimeException("Produto nao encontrado!");
		}

		return result;
	}
}
