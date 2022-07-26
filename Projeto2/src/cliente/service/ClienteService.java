package cliente.service;

import cliente.dao.ClienteDao;
import cliente.domain.Cliente;

public class ClienteService {
  ClienteDao clienteDao;

  public ClienteService(ClienteDao clienteDao) {
    this.clienteDao = clienteDao;
  }

  public boolean cadastrar(Cliente cliente) {
    return clienteDao.cadastrar(cliente);
  }

  public Cliente procurar(String cpf) {
    return clienteDao.buscar(cpf);
  }

  public void atualizar(Cliente cliente) {
    clienteDao.atualizar(cliente);
  }

  public void deletar(String cpf) {
    clienteDao.deletar(cpf);
  }
}
