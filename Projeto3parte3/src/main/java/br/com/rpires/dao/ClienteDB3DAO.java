package main.java.br.com.rpires.dao;

import main.java.br.com.rpires.dao.generic.GenericJpaDB3Dao;
import main.java.br.com.rpires.domain.Cliente;
import main.java.br.com.rpires.domain.ClienteJpa2;

/**
 * @author rodrigo.pires
 */
public class ClienteDB3DAO extends GenericJpaDB3Dao<Cliente, Long>
    implements IClienteDAO<ClienteJpa2> {

  public ClienteDB3DAO() {
    super(Cliente.class);
  }
}
