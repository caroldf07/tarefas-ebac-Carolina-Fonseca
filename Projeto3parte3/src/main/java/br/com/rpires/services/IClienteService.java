package main.java.br.com.rpires.services;

import main.java.br.com.rpires.domain.Cliente;
import main.java.br.com.rpires.exceptions.DAOException;
import main.java.br.com.rpires.services.generic.IGenericService;

/**
 * @author rodrigo.pires
 */
public interface IClienteService extends IGenericService<Cliente, Long> {
  Cliente buscarPorCPF(Long cpf) throws DAOException;
}
