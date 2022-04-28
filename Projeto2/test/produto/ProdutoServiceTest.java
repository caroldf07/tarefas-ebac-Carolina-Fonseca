package produto;

import org.junit.jupiter.api.*;
import produto.dao.ProdutoDao;
import produto.dao.ProdutoDaoImpl;
import produto.domain.Produto;
import produto.mock.ProdutoDaoMockImpl;
import produto.service.ProdutoService;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

public class ProdutoServiceTest {
    Produto produto;
    ProdutoDao produtoDao;
    ProdutoService produtoService;
    ProdutoDao produtoDaoMock;
    ProdutoService produtoServiceMock;

    public ProdutoServiceTest() {
        produtoDao = new ProdutoDaoImpl();
        produtoService = new ProdutoService(produtoDao);
        produtoDaoMock = new ProdutoDaoMockImpl();
        produtoServiceMock = new ProdutoService(produtoDaoMock);
    }

    @BeforeEach
    void setup() {
        produto = new Produto(1L, "mouse", "descrição do mouse", new BigDecimal("10.00"));
    }

    @Test
    @DisplayName("Deve retornar sucesso quando cadastrar um produto com sucesso")
    void deveCriarUmNovoProdutoComSucesso() {
        String retorno = produtoServiceMock.cadastrar(produto);
        assertEquals("Produto cadastrado com sucesso", retorno);
    }

    @Test
    @DisplayName("Deve retornar uma exception quando tentar cadastrar um produto")
    void naoDeveCriarUmNovoProduto() {
        RuntimeException exception = assertThrows(UnsupportedOperationException.class,
                                                  () -> produtoService.cadastrar(produto));
        assertEquals("Não pode realizar operação sem o banco cadastrado", exception.getMessage());
    }

    @Test
    @DisplayName("Deve retornar 'produto encontrado com sucesso' ao pesquisar o cliente")
    void deveProcurarUmProdutoComSucesso() {
        String retorno = produtoServiceMock.procurar(produto.getCodigo());
        assertEquals("Produto encontrado com sucesso", retorno);
    }

    @Test
    @DisplayName("Deve retornar uma exception quando tentar procurar um produto")
    void naoDeveEncontrarUmProduto() {
        RuntimeException exception = assertThrows(UnsupportedOperationException.class,
                                                  () -> produtoService.procurar(
                                                          produto.getCodigo()));
        assertEquals("Não pode realizar operação sem o banco cadastrado", exception.getMessage());
    }

    @Test
    @DisplayName("Deve retornar um produto atualizado com sucesso")
    void deveAtualizarUmProdutoComSucesso() {
        String retorno = produtoServiceMock.atualizar(produto.getCodigo());
        assertEquals("Produto atualizado com sucesso", retorno);
    }

    @Test
    @DisplayName("Deve retornar uma exception quando tentar atualizar um produto")
    void naoDeveAtualizarUmProduto() {
        RuntimeException exception = assertThrows(UnsupportedOperationException.class,
                                                  () -> produtoService.atualizar(
                                                          produto.getCodigo()));
        assertEquals("Não pode realizar operação sem o banco cadastrado", exception.getMessage());
    }

    @Test
    @DisplayName("Deve retornar true quando deletar um produto")
    void deveDeletarUmProdutoComSucesso() {
        boolean retorno = produtoServiceMock.deletar(produto.getCodigo());
        assertTrue(retorno);
    }

    @Test
    @DisplayName("Deve retornar uma exception quando tentar deletar um produto")
    void naoDeveDeletarUmProduto() {
        RuntimeException exception = assertThrows(UnsupportedOperationException.class,
                                                  () -> produtoService.deletar(
                                                          produto.getCodigo()));
        assertEquals("Não pode realizar operação sem o banco cadastrado", exception.getMessage());
    }
}
