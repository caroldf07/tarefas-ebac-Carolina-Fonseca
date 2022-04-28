package cliente.dao;

import cliente.domain.Cliente;

public interface ClienteDao {

    String cadastrar(Cliente cliente);

    Cliente buscar(String cpf);

    String atualizar(String cpf);

    boolean deletar(String cpf);
}
