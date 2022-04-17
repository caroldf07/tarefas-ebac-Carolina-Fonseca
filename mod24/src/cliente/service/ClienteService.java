package cliente.service;

import cliente.dao.IClienteDao;

/**
 * @author Carolina.Fonseca on 12/04/2022
 * @project tarefas-ebac-Carolina-Fonseca
 */
public class ClienteService {

    private IClienteDao clienteDao;

    public ClienteService(IClienteDao clienteDao) {
        this.clienteDao = clienteDao;
    }

    public String salvar() {
        clienteDao.salvar();
        return "Sucesso";
    }

    public String buscar(String id) {
        return clienteDao.buscar(id);
    }

    public String excluir(String id) {
        clienteDao.excluir(id);
        return "Sucesso";
    }

    public String atualizar(String id) {
        clienteDao.atualizar(id);
        return "Sucesso";
    }
}
