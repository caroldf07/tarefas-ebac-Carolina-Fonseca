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

    public Produto procurar(long codigo) {
        return produtoDao.buscar(codigo);
    }

    public String atualizar(long codigo) {
        return produtoDao.atualizar(codigo);
    }

    public boolean deletar(long codigo) {
        return produtoDao.deletar(codigo);
    }
}
