package cliente.service;

import cliente.dao.ClienteDao;
import cliente.domain.Cliente;

public class ClienteService {
  ClienteDao clienteDao;

  public ClienteService(ClienteDao clienteDao) {
    this.clienteDao = clienteDao;
  }

  public String cadastrar(Cliente cliente) {
    return clienteDao.cadastrar(cliente);
  }

  public Cliente procurar(String cpf) {
    return clienteDao.buscar(cpf);
  }

  public String atualizar(String cpf) {
    return clienteDao.atualizar(cpf);
  }

  public boolean deletar(String cpf) {
    return clienteDao.deletar(cpf);
  }
}
