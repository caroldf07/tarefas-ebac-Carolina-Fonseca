package br.com.ebac.service;

import br.com.ebac.domain.Cliente;
import br.com.ebac.exceptions.DAOException;
import br.com.ebac.service.generic.IGenericService;
import java.util.List;

public interface IClienteService extends IGenericService<Cliente, Long> {

  Cliente buscarPorCPF(Long cpf) throws DAOException;

  List<Cliente> filtrarClientes(String query);
}
