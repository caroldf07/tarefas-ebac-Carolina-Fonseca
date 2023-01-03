package br.com.ebac.dao;

import br.com.ebac.dao.generic.IGenericDAO;
import br.com.ebac.domain.Venda;

public interface IVendaDAO extends IGenericDAO<Venda, Long> {

  void finalizarVenda(Venda venda);

  void cancelarVenda(Venda venda);

  Venda consultarComCollection(Long id);
}
