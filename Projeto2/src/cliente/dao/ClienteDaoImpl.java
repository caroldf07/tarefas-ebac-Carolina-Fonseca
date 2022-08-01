package cliente.dao;

import cliente.domain.Cliente;
import generic.dao.GenericDaoImpl;

public class ClienteDaoImpl extends GenericDaoImpl<Cliente, String> implements ClienteDao {

  public ClienteDaoImpl() {
    super();
  }

  @Override
  public Class<Cliente> getTipoClasse() {
    return Cliente.class;
  }

  @Override
  public void atualizarDados(Cliente entity, Cliente entityCadastrado) {
    entityCadastrado.setCpf(entity.getCpf());
    entityCadastrado.setNome(entity.getNome());
    entityCadastrado.setEndereco(entity.getEndereco());
    entityCadastrado.setTelefone(entityCadastrado.getTelefone());
  }
}
