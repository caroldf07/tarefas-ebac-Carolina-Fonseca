package br.com.ebac.dao;

import br.com.ebac.dao.generic.GenericDAO;
import br.com.ebac.domain.Produto;
import java.util.List;
import javax.persistence.TypedQuery;

public class ProdutoDAO extends GenericDAO<Produto, String> implements IProdutoDAO {

  public ProdutoDAO() {
    super(Produto.class);
  }

  @Override
  public List<Produto> filtrarProdutos(String query) {
    TypedQuery<Produto> tpQuery =
        this.entityManager.createNamedQuery("Produto.findByNome", this.persistenteClass);
    tpQuery.setParameter("nome", "%" + query + "%");
    return tpQuery.getResultList();
  }
}
