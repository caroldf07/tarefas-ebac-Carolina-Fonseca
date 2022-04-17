package cliente.dao;

/**
 * @author Carolina.Fonseca on 12/04/2022
 * @project tarefas-ebac-Carolina-Fonseca
 */
public class ClienteDao implements IClienteDao {
  @Override
  public String salvar() {
    throw new UnsupportedOperationException("Não funciona sem config de banco");
  }

  @Override
  public String buscar(String id) {
    throw new UnsupportedOperationException("Não funciona sem config de banco");
  }

  @Override
  public void excluir(String id) {
    throw new UnsupportedOperationException("Não funciona sem config de banco");
  }

  @Override
  public void atualizar(String id) {
    throw new UnsupportedOperationException("Não funciona sem config de banco");
  }
}
