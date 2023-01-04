/**
 *
 */
package main.java.br.com.rpires.dao;

import main.java.br.com.rpires.dao.generic.GenericDAO;
import main.java.br.com.rpires.dao.generic.GenericJpaDB1Dao;
import main.java.br.com.rpires.domain.Cliente;

/**
 * @author rodrigo.pires
 *
 */
public class ClienteDAO extends GenericJpaDB1Dao<Cliente, Long> implements IClienteDAO<Cliente> {

    public ClienteDAO() {
        super(Cliente.class);
    }
}
