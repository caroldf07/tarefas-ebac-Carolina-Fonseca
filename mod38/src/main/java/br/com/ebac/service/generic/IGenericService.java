package br.com.ebac.service.generic;

import br.com.ebac.domain.Persistente;
import java.io.Serializable;
import java.util.Collection;

public interface IGenericService<T extends Persistente, E extends Serializable> {

  T cadastrar(T entity);

  void excluir(T entity);

  T alterar(T entity);

  T consultar(E valor);

  Collection<T> buscarTodos();
}
