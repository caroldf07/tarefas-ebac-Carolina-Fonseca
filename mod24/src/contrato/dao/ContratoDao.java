package contrato.dao;

/**
 * @author Carolina.Fonseca on 12/04/2022
 * @project tarefas-ebac-Carolina-Fonseca
 */
public class ContratoDao implements IContratoDao {
    @Override
    public void salvar() {
        throw new UnsupportedOperationException("Não funciona com o banco");
    }

    @Override public String buscar(String id) {
        throw new UnsupportedOperationException("Não funciona com o banco");

    }

    @Override public void excluir(String id) {
        throw new UnsupportedOperationException("Não funciona com o banco");

    }

    @Override public String atualizar(String id) {
        throw new UnsupportedOperationException("Não funciona com o banco");

    }
}
