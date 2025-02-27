package banco;
public class TesteDeCast {
	public static void main(String[] args) {
		RepositorioContasArray repositorio = new RepositorioContasArray();
		Cliente cliente = new Cliente("111111111-11", "Jose");
		Conta c1 = new Conta("c1", 50.0, cliente);
		Conta c2 = new Conta("c2", 150.0, cliente);
		Conta c3 = new Conta("c3", 250.0, cliente);
		Conta c4 = new Conta("c4", 350.0, cliente);
		repositorio.inserir(c1);
		repositorio.inserir(c2);
		repositorio.inserir(c3);
		repositorio.inserir(c4);

		Poupanca p1 = new Poupanca("p1", 100.0, cliente);
		ContaBonificada cb1 = new ContaBonificada("cb1", 120.0, cliente);

		// lidando com diversos tipos de conta
		Conta c = c1;
		c = p1;
		c = cb1;
		Poupanca p = p1;
		// p = c;
		// p = cb1;
		ContaBonificada cb = cb1;
		// cb = c3;
		// cb = p1;

		repositorio.inserir(p1);
		repositorio.inserir(cb1);

		ContaImposto ci1 = new ContaImposto("ci1", 180.0, cliente);
		// lidando com ContaImposto no repositorio
		// repositorio.inserir(ci1);

	}
}
