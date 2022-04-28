package produto.dao;

import produto.domain.Produto;

public class ProdutoDaoImpl implements ProdutoDao {
    @Override
    public String cadastrar(Produto produto) {
        throw new UnsupportedOperationException("Não pode realizar operação sem o banco cadastrado");
    }
}
