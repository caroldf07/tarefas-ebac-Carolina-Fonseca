package main.java.domain;

import java.util.List;
import javax.persistence.*;
import main.java.dao.generic.Persistente;

@Entity
@Table(name = "tb_marca")
public class Marca implements Persistente {
  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "produto_seq")
  @SequenceGenerator(
      name = "produto_seq",
      sequenceName = "sq_produto",
      initialValue = 10,
      allocationSize = 1)
  private Long id;

  @Column(length = 50, nullable = false)
  private String nome;

  @OneToMany(mappedBy = "marca")
  private List<Carro> carro;

  public Marca(String nome, List<Carro> carro) {
    this.nome = nome;
    this.carro = carro;
  }

  @Deprecated
  public Marca() {}

  @Override
  public Long getId() {
    return this.id;
  }

  @Override
  public void setId(Long id) {
    this.id = id;
  }
}
