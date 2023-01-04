package main.java.br.com.rpires.dao;

/**
 * @author rodrigo.pires
 *     <p>Classe que representa todas as entidades ou objetos da aplicação que seram salvas no banco
 *     de dados
 */
public interface Persistente {
  Long getId();

  void setId(Long id);
}
