package produto.mock;

import java.math.BigDecimal;
import produto.dao.ProdutoDao;
import produto.domain.Produto;

public class ProdutoDaoMockImpl implements ProdutoDao {
  @Override
  public String cadastrar(Produto produto) {
    return "Produto cadastrado com sucesso";
  }

  @Override
  public Produto buscar(long codigo) {
    return new Produto(1L, "mouse", "descrição do mouse", new BigDecimal("10.00"));
  }

  @Override
  public String atualizar(long codigo) {
    this.buscar(codigo);
    return "Produto atualizado com sucesso";
  }

  @Override
  public boolean deletar(long codigo) {
    return true;
  }
}
