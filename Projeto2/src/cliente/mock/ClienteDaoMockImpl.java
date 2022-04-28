package cliente.mock;

import cliente.dao.ClienteDao;
import cliente.domain.Cliente;
import cliente.domain.Endereco;

public class ClienteDaoMockImpl implements ClienteDao {
  @Override
  public String cadastrar(Cliente cliente) {
    return "Cliente cadastrado com sucesso";
  }

  @Override
  public Cliente buscar(String cpf) {
    return new Cliente(
        "Carolina",
        "12312312312",
        "1199999999",
        new Endereco("Rua dos bobos", "S/N", "", "São Paulo", "SP"));
  }

  @Override
  public String atualizar(String cpf) {
    this.buscar(cpf);
    return "Cliente atualizado com sucesso";
  }

  @Override
  public boolean deletar(String cpf) {
    this.buscar(cpf);
    return true;
  }
}
