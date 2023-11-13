package loja;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LojaVirtualTest {
    private LojaVirtual lojaVirtual;

    @BeforeEach
    public void setUp() {
        lojaVirtual = new LojaVirtual();
    }

    @Test
    public void testeCriarProduto() {
        Produto produto = lojaVirtual.criarProduto();

        assertNotNull(produto);
        assertEquals(1, produto.getCod());
        assertEquals("mouse", produto.getNome());
        assertEquals(50D, produto.getPreco(), 0.01);
    }

    @Test
    public void testeCriarCarrinho() {
        Carrinho carrinho = lojaVirtual.criarCarrinho();

        assertNotNull(carrinho);
        assertEquals(0, carrinho.getQtde());
        assertTrue(carrinho.isVazio());
    }

    @Test
    public void testeAdicionarAoCarrinho() {
        Produto produto = new Produto(2, "teclado", 70D);
        Carrinho carrinho = lojaVirtual.criarCarrinho();

        lojaVirtual.adicionarAoCarrinho(produto);

        assertEquals(1, carrinho.getQtde());
    }
}