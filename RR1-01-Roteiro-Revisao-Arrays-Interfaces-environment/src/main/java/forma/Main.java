package forma;

public class Main {

	public static void main(String[] args) {
		Forma circulo = new Circulo(2.0); // 12.5664...
		Forma quadrado = new Quadrado(3.0); // 9.0
		Forma retangulo = new Retangulo(4.0, 5.0); // 20.0
		Forma triangulo = new Triangulo(6.0, 7.0); // 21;0

		circulo.calcularArea();
		quadrado.calcularArea();
		retangulo.calcularArea();
		triangulo.calcularArea();

		System.out.println(circulo);
		System.out.println(quadrado);
		System.out.println(retangulo);
		System.out.println(triangulo);
	}

}
