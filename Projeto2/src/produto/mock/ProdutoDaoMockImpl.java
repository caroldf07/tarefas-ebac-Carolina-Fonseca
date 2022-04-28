package produto.mock;

import produto.dao.ProdutoDao;
import produto.domain.Produto;

public class ProdutoDaoMockImpl implements ProdutoDao {
    @Override
    public String cadastrar(Produto produto) {
        return "Produto cadastrado com sucesso";
    }

    @Override
    public String buscar(long codigo) {
        return "Produto encontrado com sucesso";
    }

    @Override
    public String atualizar(long codigo) {
        this.buscar(codigo);
        return "Produto atualizado com sucesso";
    }

    @Override
    public boolean deletar(long codigo) {
        return true;
    }
}
