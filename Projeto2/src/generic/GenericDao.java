package generic;

import java.io.Serializable;
import java.util.Collection;

public interface GenericDao<T extends Persistente, E extends Serializable> {
  boolean cadastrar(T entity);

  T buscar(E chave);

  void atualizar(T entity);

  void deletar(E chave);

  public Collection<T> buscarTodos();
}
