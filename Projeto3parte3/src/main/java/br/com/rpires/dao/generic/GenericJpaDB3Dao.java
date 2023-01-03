package main.java.br.com.rpires.dao.generic;

import java.io.Serializable;
import main.java.br.com.rpires.dao.Persistente;

public abstract class GenericJpaDB3Dao<T extends Persistente, E extends Serializable>
    extends GenericDAO<T, E> {
  protected GenericJpaDB3Dao(Class<T> persistenteClass) {
    super(persistenteClass, "Mysql1");
  }
}
