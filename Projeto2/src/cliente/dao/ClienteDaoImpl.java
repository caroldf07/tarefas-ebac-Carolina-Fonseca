package cliente.dao;

import cliente.domain.Cliente;

public class ClienteDaoImpl implements ClienteDao {
    @Override
    public String cadastrar(Cliente cliente) {
        throw new UnsupportedOperationException(
                "Não pode realizar operação sem o banco cadastrado");
    }

    @Override
    public Cliente buscar(String cpf) {
        throw new UnsupportedOperationException(
                "Não pode realizar operação sem o banco cadastrado");
    }

    @Override
    public String atualizar(String cpf) {
        throw new UnsupportedOperationException(
                "Não pode realizar operação sem o banco cadastrado");
    }

    @Override
    public boolean deletar(String cpf) {
        throw new UnsupportedOperationException(
                "Não pode realizar operação sem o banco cadastrado");
    }
}
