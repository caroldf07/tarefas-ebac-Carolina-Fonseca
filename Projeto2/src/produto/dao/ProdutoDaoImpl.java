package produto.dao;

import generic.GenericDaoImpl;
import produto.domain.Produto;

public class ProdutoDaoImpl extends GenericDaoImpl<Produto, Long> implements ProdutoDao {
  @Override
  public Class<Produto> getTipoClasse() {
    return Produto.class;
  }

  @Override
  public void atualizarDados(Produto entity, Produto entityCadastrado) {
    entityCadastrado.setCodigo(entity.getCodigo());
    entityCadastrado.setDescricaoProduto(entity.getDescricaoProduto());
    entityCadastrado.setNome(entity.getNome());
    entityCadastrado.setValor(entity.getValor());
  }
}
