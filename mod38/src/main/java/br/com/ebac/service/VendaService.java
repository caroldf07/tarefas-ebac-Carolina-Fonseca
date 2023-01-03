package br.com.ebac.service;

import br.com.ebac.dao.IVendaDAO;
import br.com.ebac.domain.Venda;
import br.com.ebac.domain.Venda.Status;
import br.com.ebac.service.generic.GenericService;
import javax.ejb.Stateless;
import javax.inject.Inject;

@Stateless
public class VendaService extends GenericService<Venda, Long> implements IVendaService {

  IVendaDAO dao;

  @Inject
  public VendaService(IVendaDAO dao) {
    super(dao);
    this.dao = dao;
  }

  @Override
  public void finalizarVenda(Venda venda) {
    venda.setStatus(Status.CONCLUIDA);
    dao.finalizarVenda(venda);
  }

  @Override
  public void cancelarVenda(Venda venda) {
    venda.setStatus(Status.CANCELADA);
    dao.cancelarVenda(venda);
  }

  @Override
  public Venda consultarComCollection(Long id) {
    return dao.consultarComCollection(id);
  }

  @Override
  public Venda cadastrar(Venda entity) {
    entity.setStatus(Status.INICIADA);
    return super.cadastrar(entity);
  }
}
