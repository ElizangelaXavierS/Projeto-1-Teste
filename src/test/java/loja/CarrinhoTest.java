package loja;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarrinhoTest {
    private Carrinho carrinho;
    private Produto mouse;
    private Produto teclado;

    @BeforeEach
    public void setUp() {
        carrinho = new Carrinho();
        mouse = new Produto(1, "mouse", 50D);
        teclado = new Produto(2, "teclado", 70D);
    }

    @Test
    public void testeIsVazio() {
        assertTrue(carrinho.isVazio());
        carrinho.adicionar(mouse);
        assertFalse(carrinho.isVazio());
    }

    @Test
    public void testeAdicionar() {
        assertEquals(0, carrinho.getQtde());
        carrinho.adicionar(mouse);
        assertEquals(1, carrinho.getQtde());
        assertTrue(carrinho.contem(mouse));
        assertFalse(carrinho.isVazio());
    }

    @Test
    public void testeContem() {
        assertFalse(carrinho.contem(mouse));
        carrinho.adicionar(mouse);
        assertTrue(carrinho.contem(mouse));
        assertFalse(carrinho.contem(teclado));
    }

    @Test
    public void testeGetQtde() {
        assertEquals(0, carrinho.getQtde());
        carrinho.adicionar(mouse);
        assertEquals(1, carrinho.getQtde());
        carrinho.adicionar(teclado);
        assertEquals(2, carrinho.getQtde());
    }
}