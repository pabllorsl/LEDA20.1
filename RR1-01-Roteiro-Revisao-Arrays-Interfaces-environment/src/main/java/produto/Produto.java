package produto;

public class Produto {

	private int codigo;
	private String nome;
	private double preco;
	private String descricao;

	public Produto(int codigo, String nome, double preco, String descricao) {
		this.codigo = codigo;
		this.nome = nome;
		this.preco = preco;
		this.descricao = descricao;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	/**
	 * A redefini��o � necessaria para permitir que objetos sejam comparados quando
	 * usados em cole��es.
	 */
	@Override
	public boolean equals(Object obj) {
		boolean result = false;

		if (obj instanceof Produto) {
			result = this.getCodigo() == ((Produto) obj).getCodigo();
		}

		return result;
	}

}
