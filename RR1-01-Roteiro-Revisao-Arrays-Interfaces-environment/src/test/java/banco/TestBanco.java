package banco;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestBanco {

	private AuditorGenerico a;
	private QualquerBanco bi;
	private QualquerBanco bs;

	@Before
	public void setUp() {
		this.a = new AuditorGenerico();
		this.bi = new BancoInvestimentos();
		this.bs = new BancoSeguros();
	}

	// bi saldoTotal = 10000
	// bi numContas = 12
	// 833,33 ...
	@Test
	public void testInvestigaBancoInvestimentos() {
		assertTrue(a.investigaBanco(bi));
	}

	// bs saldoTotal = 1000
	// bs numContas = 7
	// 142,857142857
	@Test
	public void testInvestigaBancoSeguros() {
		assertFalse(a.investigaBanco(bs));
	}

}
