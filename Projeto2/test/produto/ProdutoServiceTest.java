package produto;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import produto.dao.ProdutoDao;
import produto.dao.ProdutoDaoImpl;
import produto.domain.Produto;
import produto.mock.ProdutoDaoMockImpl;
import produto.service.ProdutoService;

class ProdutoServiceTest {
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
    boolean retorno = produtoServiceMock.cadastrar(produto);
    assertTrue(retorno);
  }

  @Test
  @DisplayName("Deve retornar uma exception quando tentar cadastrar um produto")
  void naoDeveCriarUmNovoProduto() {
    RuntimeException exception =
        assertThrows(UnsupportedOperationException.class, () -> produtoService.cadastrar(produto));
    assertEquals("Não pode realizar operação sem o banco cadastrado", exception.getMessage());
  }

  @Test
  @DisplayName("Deve retornar 'produto encontrado com sucesso' ao pesquisar o cliente")
  void deveProcurarUmProdutoComSucesso() {
    Produto retorno = produtoServiceMock.procurar(produto.getCodigo());
    assertEquals(produto.toString(), retorno.toString());
  }

  @Test
  @DisplayName("Deve retornar uma exception quando tentar procurar um produto")
  void naoDeveEncontrarUmProduto() {
    RuntimeException exception =
        assertThrows(
            UnsupportedOperationException.class,
            () -> produtoService.procurar(produto.getCodigo()));
    assertEquals("Não pode realizar operação sem o banco cadastrado", exception.getMessage());
  }

  @Test
  @DisplayName("Deve retornar um produto atualizado com sucesso")
  void deveAtualizarUmProdutoComSucesso() {
    produto.setNome("teclado");
    produtoServiceMock.atualizar(produto);
    assertEquals("teclado", produto.getNome());
  }

  @Test
  @DisplayName("Deve retornar true quando deletar um produto")
  void deveDeletarUmProdutoComSucesso() {
    produtoServiceMock.deletar(produto.getCodigo());
    Produto retorno = produtoServiceMock.procurar(produto.getCodigo());
    assertNull(retorno);
  }
}
