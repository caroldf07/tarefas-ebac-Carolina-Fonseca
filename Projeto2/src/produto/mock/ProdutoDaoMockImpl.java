package produto.mock;

import java.math.BigDecimal;
import produto.dao.ProdutoDao;
import produto.domain.Produto;

public class ProdutoDaoMockImpl implements ProdutoDao {

  Produto produto = new Produto(1L, "mouse", "descrição do mouse", new BigDecimal("10.00"));

  @Override
  public boolean cadastrar(Produto entity) {
    return true;
  }

  @Override
  public Produto buscar(Long chave) {
    return produto;
  }

  @Override
  public void atualizar(Produto entity) {
    produto.setNome(entity.getNome());
  }

  @Override
  public void deletar(Long chave) {
    // TODO Auto-generated method stub
  }
}
