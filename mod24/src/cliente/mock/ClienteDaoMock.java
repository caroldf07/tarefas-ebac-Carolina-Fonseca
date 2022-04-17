package cliente.mock;

import cliente.dao.IClienteDao;

/**
 * @author Carolina.Fonseca on 12/04/2022
 * @project tarefas-ebac-Carolina-Fonseca
 */
public class ClienteDaoMock implements IClienteDao {
    @Override
    public String salvar() {
        return "Sucesso";
    }

    @Override public String buscar(String id) {
        return "Sucesso";
    }

    @Override public void excluir(String id) {

    }

    @Override public void atualizar(String id) {

    }
}
