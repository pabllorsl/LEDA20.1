package produto;

import java.util.GregorianCalendar;

public class ProdutoPerecivel extends Produto {

	private GregorianCalendar dataValidade;

	public ProdutoPerecivel(int codigo, String nome, double preco, String descricao, GregorianCalendar dataValidade) {
		super(codigo, nome, preco, descricao);
		this.dataValidade = dataValidade;
	}

	public GregorianCalendar getDataValidade() {
		return dataValidade;
	}

	public void setDataValidade(GregorianCalendar dataValidade) {
		this.dataValidade = dataValidade;
	}

}
