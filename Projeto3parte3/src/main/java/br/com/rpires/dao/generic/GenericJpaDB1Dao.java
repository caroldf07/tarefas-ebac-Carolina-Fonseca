package main.java.br.com.rpires.dao.generic;

import main.java.br.com.rpires.dao.Persistente;

import java.io.Serializable;

public abstract class GenericJpaDB1Dao<T extends Persistente, E extends Serializable>
        extends GenericDAO<T,E> {
    protected GenericJpaDB1Dao(Class<T> persistenteClass) {
        super(persistenteClass, "Postgres1");
    }
}
