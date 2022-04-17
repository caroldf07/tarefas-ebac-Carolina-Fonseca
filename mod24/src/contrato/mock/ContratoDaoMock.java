package contrato.mock;

import contrato.dao.IContratoDao;

/**
 * @author Carolina.Fonseca on 12/04/2022
 * @project tarefas-ebac-Carolina-Fonseca
 */
public class ContratoDaoMock implements IContratoDao {
  @Override
  public void salvar() {}

  @Override
  public String buscar(String id) {
    return "Sucesso";
  }

  @Override
  public void excluir(String id) {}

  @Override
  public String atualizar(String id) {
    return "Sucesso";
  }
}
