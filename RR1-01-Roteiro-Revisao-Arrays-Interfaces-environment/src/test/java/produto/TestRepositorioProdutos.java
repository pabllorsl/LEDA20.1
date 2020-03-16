package produto;

import static org.junit.Assert.*;

import java.util.GregorianCalendar;

import org.junit.Before;
import org.junit.Test;

public class TestRepositorioProdutos {

	private RepositorioProdutoArrayList repositorio;

	@Before
	public void setUp() {
		this.repositorio = new RepositorioProdutoArrayList(10);
	}

	@Test
	public void testExiste() {
		assertFalse(repositorio.existe(1));
		assertFalse(repositorio.existe(5));
		assertFalse(repositorio.existe(6));
		assertFalse(repositorio.existe(7));
		assertFalse(repositorio.existe(10));
	}

	@Test
	public void testInserirProduto() {
		repositorio.inserir(new Produto(5, "Feijao", 10.0, "Feijão carioca"));
		assertTrue(repositorio.existe(5));
	}

	@Test
	public void testInserirProdutoPerecivel() {
		repositorio.inserir(new ProdutoPerecivel(6, "Leite", 4.0, "Leite Integral", new GregorianCalendar()));
		assertTrue(repositorio.existe(6));
	}

	@Test
	public void testInserirProdutoNaoPerecivel() {
		repositorio.inserir(new ProdutoNaoPerecivel(7, "Macarrao", 3.0, "Macarrao Talharim", "Plastico"));
		assertTrue(repositorio.existe(7));
	}

	@Test
	public void testAtualizarProduto() {
		repositorio.inserir(new Produto(5, "Feijao", 10.0, "Feijão carioca"));
		repositorio.atualizar(new Produto(5, "Feijao", 10.0, "Feijão macassar"));
		assertEquals("Feijão macassar", repositorio.procurar(5).getDescricao());
	}

	@Test
	public void testAtualizarProdutoPerecivel() {
		repositorio.inserir(new ProdutoPerecivel(6, "Leite", 4.0, "Leite Integral", new GregorianCalendar()));
		repositorio.atualizar(new ProdutoPerecivel(6, "Leite", 4.0, "Leite Desnatado", new GregorianCalendar()));
		assertEquals("Leite Desnatado", repositorio.procurar(6).getDescricao());
	}

	@Test
	public void testAtualizarProdutoNaoPerecivel() {
		repositorio.inserir(new ProdutoNaoPerecivel(7, "Macarrao", 3.0, "Macarrao Talharim", "Plastico"));
		repositorio.atualizar(new ProdutoNaoPerecivel(7, "Macarrao", 3.0, "Macarrao Ravióli", "Plastico"));
		assertEquals("Macarrao Ravióli", repositorio.procurar(7).getDescricao());
	}

	@Test
	public void testRemoverProduto() {
		repositorio.inserir(new Produto(5, "Feijao", 10.0, "Feijão carioca"));
		repositorio.remover(5);
		assertFalse(repositorio.existe(5));
	}

	@Test
	public void testRemoverProdutoPerecivel() {
		repositorio.inserir(new ProdutoPerecivel(6, "Leite", 4.0, "Leite Integral", new GregorianCalendar()));
		repositorio.remover(6);
		assertFalse(repositorio.existe(6));
	}

	@Test
	public void testRemoverProdutoNaoPerecivel() {
		repositorio.inserir(new ProdutoNaoPerecivel(7, "Macarrao", 3.0, "Macarrao Talharim", "Plastico"));
		repositorio.remover(7);
		assertFalse(repositorio.existe(7));
	}

	@Test
	public void testProcurarProduto() {
		assertNull(repositorio.procurar(5));
		repositorio.inserir(new Produto(5, "Feijao", 10.0, "Feijão carioca"));
		assertNotNull(repositorio.procurar(5));
	}

	@Test
	public void testProcurarProdutoPerecivel() {
		assertNull(repositorio.procurar(6));
		repositorio.inserir(new ProdutoPerecivel(6, "Leite", 4.0, "Leite Integral", new GregorianCalendar()));
		assertNotNull(repositorio.procurar(6));
	}

	@Test
	public void testProcurarProdutoNaoPerecivel() {
		assertNull(repositorio.procurar(7));
		repositorio.inserir(new ProdutoNaoPerecivel(7, "Macarrao", 3.0, "Macarrao Talharim", "Plastico"));
		assertNotNull(repositorio.procurar(7));
	}

}