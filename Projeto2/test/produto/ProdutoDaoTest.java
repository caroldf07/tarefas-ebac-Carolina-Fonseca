package produto;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import produto.dao.ProdutoDao;
import produto.dao.ProdutoDaoImpl;
import produto.domain.Produto;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class ProdutoDaoTest {
    ProdutoDao produtoDao;
    Produto produto;

    public ProdutoDaoTest() {
        produtoDao = new ProdutoDaoImpl();
    }

    @BeforeEach
    void setup() {
        produto = new Produto(1L, "mouse", "descrição do mouse", new BigDecimal("10.00"));
    }

    @Test
    @DisplayName("Deve retornar sucesso quando cadastrar um produto com sucesso")
    void deveCadastrarUmProdutoComSucesso() {
        boolean retorno = produtoDao.cadastrar(produto);
        assertTrue(retorno);
    }

    @Test
    @DisplayName("Deve retornar 'produto encontrado com sucesso' ao pesquisar o produto")
    void deveEncontrarUmProdutoComSucesso() {
        Produto retorno = produtoDao.buscar(produto.getCodigo());
        assertEquals(produto.toString(), retorno.toString());
    }

    @Test
    @DisplayName("Deve retornar produto com dado atualizado")
    void deveAtualizarUmProdutoComSucesso() {
        produto.setNome("teclado");
        produtoDao.atualizar(produto);
        Produto retorno = produtoDao.buscar(produto.getCodigo());
        assertEquals("teclado", retorno.getNome());
    }

    @Test
    @DisplayName("Deve retornar true quando deletar um produto")
    void deveDeletarUmProduto() {
        produtoDao.deletar(produto.getCodigo());
        Produto retorno = produtoDao.buscar(produto.getCodigo());
        assertNull(retorno);
    }

}
