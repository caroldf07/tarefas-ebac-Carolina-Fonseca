package cliente.dao;

/**
 * @author Carolina.Fonseca on 12/04/2022
 * @project tarefas-ebac-Carolina-Fonseca
 */
public interface IClienteDao {
  String salvar();

  String buscar(String id);

  void excluir(String id);

  void atualizar(String id);
}
