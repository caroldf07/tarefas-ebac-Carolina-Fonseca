package generic;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public abstract class GenericDaoImpl<T extends Persistente, E extends Serializable>
    implements GenericDao<T, E> {

  private SingletonMap singletonMap;

  public GenericDaoImpl() {
    this.singletonMap = SingletonMap.getInstance();
  }

  public abstract Class<T> getTipoClasse();

  public abstract void atualizarDados(T entity, T entityCadastrado);

  public E getChave(T entity) {
    Field[] fields = entity.getClass().getDeclaredFields();
    E returnValue = null;

    for (Field field : fields) {
      if (field.isAnnotationPresent(Chave.class)) {
        Chave chave = field.getAnnotation(Chave.class);
        String nome = chave.value();
        try {
          Method method = entity.getClass().getMethod(nome);
          returnValue = (E) method.invoke(entity);
          return returnValue;
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
          throw new RuntimeException(e);
        }
      }
    }

    if (returnValue == null) {
      throw new RuntimeException("Chave não encontrada");
    }
    return null;
  }

  @Override
  public boolean cadastrar(T entity) {
    Map<E, T> mapaInterno = getMapa();
    E chave = (E) getChave(entity);
    if (mapaInterno.containsKey(chave)) {
      return false;
    }

    mapaInterno.put(chave, entity);
    return true;
  }

  private Map<E, T> getMapa() {
    Map<E, T> mapaInterno = (Map<E, T>) this.singletonMap.getMap().get(getTipoClasse());
    if (mapaInterno == null) {
      mapaInterno = new HashMap<>();
      this.singletonMap.getMap().put(getTipoClasse(), mapaInterno);
    }
    return mapaInterno;
  }

  @Override
  public void deletar(E valor) {

    Map<E, T> mapaInterno = getMapa();
    T objetoCadastrado = mapaInterno.get(valor);
    if (objetoCadastrado != null) {
      mapaInterno.remove(valor, objetoCadastrado);
    }
  }

  @Override
  public void atualizar(T entity) {
    Map<E, T> mapaInterno = getMapa();
    E chave = (E) getChave(entity);
    T objetoCadastrado = mapaInterno.get(chave);
    if (objetoCadastrado != null) {
      atualizarDados(entity, objetoCadastrado);
    }
  }

  @Override
  public T buscar(E valor) {
    Map<E, T> mapaInterno = getMapa();
    return mapaInterno.get(valor);
  }

  @Override
  public Collection<T> buscarTodos() {
    Map<E, T> mapaInterno = getMapa();
    return mapaInterno.values();
  }
}
