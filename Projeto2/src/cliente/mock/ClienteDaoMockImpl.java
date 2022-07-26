package cliente.mock;

import cliente.dao.ClienteDao;
import cliente.domain.Cliente;

import java.util.Collection;

public class ClienteDaoMockImpl implements ClienteDao {

    @Override
    public boolean cadastrar(Cliente entity) {
        return false;
    }

    @Override
    public Cliente buscar(String chave) {
        return null;
    }

    @Override
    public void atualizar(Cliente entity) {

    }

    @Override
    public void deletar(String chave) {

    }

    @Override
    public Collection<Cliente> buscarTodos() {
        return null;
    }
}
