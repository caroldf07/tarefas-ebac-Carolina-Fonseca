package produto.mock;

import produto.dao.ProdutoDao;
import produto.domain.Produto;

public class ProdutoDaoMockImpl implements ProdutoDao {
  @Override
  public String cadastrar(Produto produto) {
    return "Produto cadastrado com sucesso";
  }
}
