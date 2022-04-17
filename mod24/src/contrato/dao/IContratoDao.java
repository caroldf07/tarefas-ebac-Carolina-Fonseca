package contrato.dao;

/**
 * @author Carolina.Fonseca on 12/04/2022
 * @project tarefas-ebac-Carolina-Fonseca
 */
public interface IContratoDao {
    void salvar();

    String buscar(String id);

    void excluir(String id);

    String atualizar(String id);
}
