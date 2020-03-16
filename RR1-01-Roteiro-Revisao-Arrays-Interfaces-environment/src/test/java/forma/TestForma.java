package forma;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestForma {

	private Forma circulo;
	private Forma quadrado;
	private Forma retangulo;
	private Forma triangulo;
	private double delta;

	@Before
	public void setUp() {
		this.circulo = new Circulo(2.0); // 12.5664...
		this.quadrado = new Quadrado(3.0); // 9.0
		this.retangulo = new Retangulo(4.0, 5.0); // 20.0
		this.triangulo = new Triangulo(6.0, 7.0); // 21.0
		this.delta = 0.0001;
	}

	@Test
	public void testCalcularAreaCirculo() {
		assertEquals(12.5664, circulo.calcularArea(), delta);
	}

	@Test
	public void testCalcularAreaQuadrado() {
		assertEquals(9.0, quadrado.calcularArea(), delta);
	}

	@Test
	public void testCalcularAreaRetangulo() {
		assertEquals(20.0, retangulo.calcularArea(), delta);
	}

	@Test
	public void testCalcularAreaTriangulo() {
		assertEquals(21.0, triangulo.calcularArea(), delta);
	}

}
