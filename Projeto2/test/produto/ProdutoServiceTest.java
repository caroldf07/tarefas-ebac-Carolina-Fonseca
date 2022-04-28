package produto;

import org.junit.jupiter.api.*;
import produto.dao.ProdutoDao;
import produto.dao.ProdutoDaoImpl;
import produto.domain.Produto;
import produto.mock.ProdutoDaoMockImpl;
import produto.service.ProdutoService;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ProdutoServiceTest {
    Produto produto;
    ProdutoDao produtoDao;
    ProdutoService produtoService;
    ProdutoDao produtoDaoMock;
    ProdutoService produtoServiceMock;

    @BeforeEach
    void setup() {
        produto = new Produto(1L, "mouse", "descrição do mouse", new BigDecimal("10.00"));
        produtoDao = new ProdutoDaoImpl();
        produtoService = new ProdutoService(produtoDao);
        produtoDaoMock = new ProdutoDaoMockImpl();
        produtoServiceMock = new ProdutoService(produtoDaoMock);
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
}
