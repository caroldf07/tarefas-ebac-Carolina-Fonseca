package produto;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;
import org.junit.jupiter.api.*;
import produto.dao.ProdutoDao;
import produto.dao.ProdutoDaoImpl;
import produto.domain.Produto;
import produto.mock.ProdutoDaoMockImpl;

public class ProdutoDaoTest {
  ProdutoDao produtoDao;
  ProdutoDao produtoDaoMock;
  Produto produto;

  public ProdutoDaoTest() {
    produtoDao = new ProdutoDaoImpl();
    produtoDaoMock = new ProdutoDaoMockImpl();
  }

  @BeforeEach
  void setup() {
    produto = new Produto(1L, "mouse", "descrição do mouse", new BigDecimal("10.00"));
  }

  @Test
  @DisplayName("Deve retornar sucesso quando cadastrar um produto com sucesso")
  void deveCadastrarUmProdutoComSucesso() {
    String retorno = produtoDaoMock.cadastrar(produto);
    assertEquals("Produto cadastrado com sucesso", retorno);
  }

  @Test
  @DisplayName("Deve retornar uma exception quando tentar cadastrar um produto")
  void naoDeveCadastrarUmProduto() {
    RuntimeException exception =
        assertThrows(UnsupportedOperationException.class, () -> produtoDao.cadastrar(produto));
    assertEquals("Não pode realizar operação sem o banco cadastrado", exception.getMessage());
  }

  @Test
  @DisplayName("Deve retornar 'produto encontrado com sucesso' ao pesquisar o produto")
  void deveEncontrarUmProdutoComSucesso() {
    Produto retorno = produtoDaoMock.buscar(produto.getCodigo());
    assertEquals(produto.toString(), retorno.toString());
  }

  @Test
  @DisplayName("Deve retornar uma exception quando tentar encontrar uma produto")
  void naoDeveEncontrarUmProduto() {
    RuntimeException exception =
        assertThrows(
            UnsupportedOperationException.class, () -> produtoDao.buscar(produto.getCodigo()));
    assertEquals("Não pode realizar operação sem o banco cadastrado", exception.getMessage());
  }

  @Test
  @DisplayName("Deve retornar produto com dado atualizado")
  void deveAtualizarUmProdutoComSucesso() {
    String retorno = produtoDaoMock.atualizar(produto.getCodigo());
    assertEquals("Produto atualizado com sucesso", retorno);
  }

  @Test
  @DisplayName("Deve retornar uma exception quando tentar atualizar um produto")
  void naoDeveAtualizarUmProduto() {
    RuntimeException exception =
        assertThrows(
            UnsupportedOperationException.class, () -> produtoDao.atualizar(produto.getCodigo()));
    assertEquals("Não pode realizar operação sem o banco cadastrado", exception.getMessage());
  }

  @Test
  @DisplayName("Deve retornar true quando deletar um produto")
  void deveDeletarUmProduto() {
    boolean retorno = produtoDaoMock.deletar(produto.getCodigo());
    assertTrue(retorno);
  }

  @Test
  @DisplayName("Deve retornar uma exception quando tentar atualizar um produto")
  void naoDeveDeletarUmProduto() {
    RuntimeException exception =
        assertThrows(
            UnsupportedOperationException.class, () -> produtoDao.deletar(produto.getCodigo()));
    assertEquals("Não pode realizar operação sem o banco cadastrado", exception.getMessage());
  }
}
