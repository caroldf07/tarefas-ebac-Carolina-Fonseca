package produto.dao;

import produto.domain.Produto;

public class ProdutoDaoImpl implements ProdutoDao {
  @Override
  public String cadastrar(Produto produto) {
    throw new UnsupportedOperationException("Não pode realizar operação sem o banco cadastrado");
  }

  @Override
  public Produto buscar(long codigo) {
    throw new UnsupportedOperationException("Não pode realizar operação sem o banco cadastrado");
  }

  @Override
  public String atualizar(long codigo) {
    throw new UnsupportedOperationException("Não pode realizar operação sem o banco cadastrado");
  }

  @Override
  public boolean deletar(long codigo) {
    throw new UnsupportedOperationException("Não pode realizar operação sem o banco cadastrado");
  }
}
