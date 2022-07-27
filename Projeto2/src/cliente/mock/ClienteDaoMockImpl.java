package cliente.mock;

import cliente.dao.ClienteDao;
import cliente.domain.Cliente;
import cliente.domain.Endereco;

public class ClienteDaoMockImpl implements ClienteDao {

    Cliente cliente = new Cliente("Carolina", "12312312312", "1199999999",
            new Endereco("Rua dos bobos", "S/N", "", "São Paulo", "SP"));

    @Override
    public boolean cadastrar(Cliente entity) {
        return true;
    }

    @Override
    public Cliente buscar(String chave) {
        return cliente;
    }

    @Override
    public void atualizar(Cliente entity) {
        cliente.setNome(entity.getNome());
    }

    @Override
    public void deletar(String chave) {
        // TODO Auto-generated method stub
    }

}
