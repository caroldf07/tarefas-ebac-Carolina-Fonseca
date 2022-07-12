package produto.service;

import produto.dao.ProdutoDao;
import produto.domain.Produto;

public class ProdutoService {
  private final ProdutoDao produtoDao;

  public ProdutoService(ProdutoDao produtoDao) {
    this.produtoDao = produtoDao;
  }

  public boolean cadastrar(Produto produto) {
    return produtoDao.cadastrar(produto);
  }

  public Produto procurar(long codigo) {
    return produtoDao.buscar(codigo);
  }

  public void atualizar(Produto produto) {
    produtoDao.atualizar(produto);
  }

  public void deletar(long codigo) {
    produtoDao.deletar(codigo);
  }
}
