package forma;

public class Circulo implements Forma {

	private double raio;

	public Circulo(double raio) {
		this.raio = raio;
	}

	@Override
	public double calcularArea() {
		return Math.PI * this.getRaio() * this.getRaio();
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	@Override
	public String toString() {
		return "Circulo [raio=" + raio + ", area=" + calcularArea() + "]";
	}

}
