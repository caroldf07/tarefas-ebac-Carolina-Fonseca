package contrato.service;

import contrato.dao.IContratoDao;

/**
 * @author Carolina.Fonseca on 12/04/2022
 * @project tarefas-ebac-Carolina-Fonseca
 */
public class ContratoService implements IContratoService {
  private IContratoDao contratoDao;

  public ContratoService(IContratoDao dao) {
    this.contratoDao = dao;
  }

  @Override
  public String salvar() {
    contratoDao.salvar();
    return "Sucesso";
  }

  public String buscar(String id) {
    return contratoDao.buscar(id);
  }

  public String excluir(String id) {
    contratoDao.excluir(id);
    return "Sucesso";
  }

  public String atualizar(String id) {
    return contratoDao.atualizar(id);
  }
}
