package produto;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import produto.dao.ProdutoDao;
import produto.domain.Produto;
import produto.mock.ProdutoDaoMockImpl;
import produto.service.ProdutoService;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ProdutoServiceTest {
    Produto produto;

    ProdutoDao produtoDaoMock;
    ProdutoService produtoService;

    public ProdutoServiceTest() {
        produtoDaoMock = new ProdutoDaoMockImpl();
        produtoService = new ProdutoService(produtoDaoMock);
    }

    @BeforeEach
    void setup() {
        produto = new Produto(1L, "mouse", "descrição do mouse", new BigDecimal("10.00"));
    }

    @Test
    @DisplayName("Deve retornar sucesso quando cadastrar um produto com sucesso")
    void deveCriarUmNovoProdutoComSucesso() {
        boolean retorno = produtoService.cadastrar(produto);
        assertTrue(retorno);
    }


    @Test
    @DisplayName("Deve retornar 'produto encontrado com sucesso' ao pesquisar o cliente")
    void deveProcurarUmProdutoComSucesso() {
        Produto retorno = produtoService.procurar(produto.getCodigo());
        assertEquals(produto.toString(), retorno.toString());
    }

    @Test
    @DisplayName("Deve retornar um produto atualizado com sucesso")
    void deveAtualizarUmProdutoComSucesso() {
        produto.setNome("teclado");
        produtoService.atualizar(produto);

        Produto retorno = produtoService.procurar(produto.getCodigo());
        assertEquals("teclado", retorno.getNome());
    }

    @Test
    @DisplayName("Deve retornar true quando deletar um produto")
    void deveDeletarUmProdutoComSucesso() {
        produtoService.deletar(produto.getCodigo());

    }

}
