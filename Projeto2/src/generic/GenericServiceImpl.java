package generic;

import generic.dao.GenericDao;
import generic.dao.Persistente;
import generic.service.GenericService;

import java.io.Serializable;

public class GenericServiceImpl<T extends Persistente, E extends Serializable> implements GenericService<T, E> {

    protected GenericDao<T, E> dao;

    public GenericServiceImpl(GenericDao<T, E> dao) {
        this.dao = dao;
    }

    @Override
    public boolean cadastrar(T entity) {
        return dao.cadastrar(entity);
    }

    @Override
    public T procurar(E key) {
        return dao.buscar(key);
    }

    @Override
    public void atualizar(T entity) {
        dao.atualizar(entity);
    }

    @Override
    public void deletar(E key) {
        dao.deletar(key);
    }
}
