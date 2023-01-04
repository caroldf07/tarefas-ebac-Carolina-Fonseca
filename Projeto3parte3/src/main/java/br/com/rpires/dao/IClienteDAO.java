/** */
package main.java.br.com.rpires.dao;

import main.java.br.com.rpires.dao.generic.IGenericDAO;
import main.java.br.com.rpires.domain.Cliente;

public interface IClienteDAO<T extends Persistente> extends IGenericDAO<Cliente, Long> {}
