package loja;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class ProdutoTest {

    private Produto produto;
    private final int COD = 1;
    private final String NOME = "Bola";
    private final double PRECO = 1.2;

    @BeforeEach
    public void setUp(){
        produto = new Produto(COD, NOME, PRECO);
    }

    @Test
    public void testeGetProduto(){
        assertEquals(COD, produto.getCod());
        assertEquals(NOME, produto.getNome());
        assertEquals(PRECO, produto.getPreco());
    }

    @Test
    public void testeSetProduto(){
        int cod = 2;
        String nome = "copo";
        double preco = 2.1;

        produto.setCod(cod);
        produto.setNome(nome);
        produto.setPreco(preco);

        assertEquals(cod, produto.getCod());
        assertEquals(nome, produto.getNome());
        assertEquals(preco, produto.getPreco());
    }


}