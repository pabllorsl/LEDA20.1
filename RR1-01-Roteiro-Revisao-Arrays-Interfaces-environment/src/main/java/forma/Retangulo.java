package forma;

public class Retangulo implements Forma {

	private double base;
	private double altura;

	public Retangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}

	@Override
	public double calcularArea() {
		return this.getBase() * this.getAltura();
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	@Override
	public String toString() {
		return "Retangulo [base=" + base + ", altura=" + altura + ", area=" + calcularArea() + "]";
	}

}
