package main.java.br.com.rpires.dao;

import main.java.br.com.rpires.dao.generic.GenericJpaDB2Dao;
import main.java.br.com.rpires.domain.Cliente;

/**
 * @author rodrigo.pires
 */
public class ClienteDB2DAO extends GenericJpaDB2Dao<Cliente, Long> implements IClienteDAO<Cliente> {

  public ClienteDB2DAO() {
    super(Cliente.class);
  }
}
