package banco;
public class ContaBonificada extends Conta {

	private double bonus;
	private static final double TAXA_DE_BONUS = 0.01;

	public ContaBonificada(String numero, double saldo, Cliente cliente) {
		super(numero, saldo, cliente);
	}

	/**
	 * Método redefinido para se adequar a classe decontas bonificadas
	 * 
	 * @param valor o valor a ser creditado.
	 */
	@Override
	public void creditar(double valor) {
		bonus = bonus + valor * TAXA_DE_BONUS;
		super.creditar(valor);
	}

	public void renderBonus() {
		super.creditar(this.bonus);
		bonus = 0;
	}
}