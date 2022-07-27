package generic.dao;

import java.io.Serializable;

public interface GenericDao<T extends Persistente, E extends Serializable> {
    boolean cadastrar(T entity);

    T buscar(E chave);

    void atualizar(T entity);

    void deletar(E chave);
}
