/** */
package main.java.services.generic;

import java.io.Serializable;
import java.util.Collection;
import main.java.dao.generic.Persistente;

public interface GenericService<T extends Persistente, E extends Serializable> {

  T cadastrar(T entity);

  void excluir(E valor);

  T consultar(E valor);

  Collection<T> buscarTodos();
}
