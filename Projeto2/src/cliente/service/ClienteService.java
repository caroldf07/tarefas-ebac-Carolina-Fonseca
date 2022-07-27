package cliente.service;

import cliente.domain.Cliente;
import generic.GenericServiceImpl;
import generic.dao.GenericDao;

public class ClienteService extends GenericServiceImpl<Cliente, String> {
  public ClienteService(GenericDao<Cliente, String> dao) {
    super(dao);
  }
}
