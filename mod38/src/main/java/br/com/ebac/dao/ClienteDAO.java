package br.com.ebac.dao;

import br.com.ebac.dao.generic.GenericDAO;
import br.com.ebac.domain.Cliente;
import java.util.List;
import javax.persistence.TypedQuery;

public class ClienteDAO extends GenericDAO<Cliente, Long> implements IClienteDAO {

  public ClienteDAO() {
    super(Cliente.class);
  }

  @Override
  public List<Cliente> filtrarClientes(String query) {
    TypedQuery<Cliente> tpQuery =
        this.entityManager.createNamedQuery("Cliente.findByNome", this.persistenteClass);
    tpQuery.setParameter("nome", "%" + query + "%");
    return tpQuery.getResultList();
  }
}
