package main.java.br.com.rpires.dao.generic;

import main.java.br.com.rpires.dao.Persistente;

import java.io.Serializable;

public abstract class GenericJpaDB2Dao<T extends Persistente, E extends Serializable>
        extends GenericDAO<T,E> {
    protected GenericJpaDB2Dao(Class<T> persistenteClass) {
        super(persistenteClass, "Postgres2");
    }
}
