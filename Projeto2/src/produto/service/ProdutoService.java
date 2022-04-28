package produto.service;

import produto.dao.ProdutoDao;
import produto.domain.Produto;

public class ProdutoService {
  private final ProdutoDao produtoDao;

  public ProdutoService(ProdutoDao produtoDao) {
    this.produtoDao = produtoDao;
  }

  public String cadastrar(Produto produto) {
    return produtoDao.cadastrar(produto);
  }
}
