package br.com.ebac.dao;

import br.com.ebac.dao.generic.IGenericDAO;
import br.com.ebac.domain.Cliente;
import java.util.List;

public interface IClienteDAO extends IGenericDAO<Cliente, Long> {

  List<Cliente> filtrarClientes(String query);
}
