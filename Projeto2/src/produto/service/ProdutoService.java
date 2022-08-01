package produto.service;

import generic.GenericServiceImpl;
import generic.dao.GenericDao;
import produto.domain.Produto;

public class ProdutoService extends GenericServiceImpl<Produto, Long> {

  public ProdutoService(GenericDao<Produto, Long> dao) {
    super(dao);
  }
}
