package produto.dao;

import produto.domain.Produto;

public interface ProdutoDao {

  String cadastrar(Produto produto);

  Produto buscar(long codigo);

  String atualizar(long codigo);

  boolean deletar(long codigo);
}
