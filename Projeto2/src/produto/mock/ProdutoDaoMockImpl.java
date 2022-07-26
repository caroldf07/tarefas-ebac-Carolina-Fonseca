package produto.mock;

import produto.dao.ProdutoDao;
import produto.domain.Produto;

import java.util.Collection;

public class ProdutoDaoMockImpl implements ProdutoDao {

    @Override
    public boolean cadastrar(Produto entity) {
        return false;
    }

    @Override
    public Produto buscar(Long chave) {
        return null;
    }

    @Override
    public void atualizar(Produto entity) {

    }

    @Override
    public void deletar(Long chave) {

    }

    @Override
    public Collection<Produto> buscarTodos() {
        return null;
    }
}
