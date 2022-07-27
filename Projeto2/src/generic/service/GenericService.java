package generic.service;

import generic.dao.Persistente;

import java.io.Serializable;

public interface GenericService<T extends Persistente, E extends Serializable> {
    boolean cadastrar(T entity);

    T procurar(E key);

    void atualizar(T entity);

    void deletar(E key);
}
