package main.java.domain;

import java.util.List;
import javax.persistence.*;
import main.java.dao.generic.Persistente;

@Entity
@Table(name = "tb_carro")
public class Carro implements Persistente {
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

  @ManyToOne
  @JoinColumn(
      name = "id_marca_fk",
      foreignKey = @ForeignKey(name = "fk_marca_carro"),
      referencedColumnName = "id",
      nullable = false)
  private Marca marca;

  @OneToMany(mappedBy = "carro")
  private List<Acessorio> acessorios;

  public Carro(String nome, Marca marca, List<Acessorio> acessorios) {
    this.nome = nome;
    this.marca = marca;
    this.acessorios = acessorios;
  }

  @Deprecated
  public Carro() {}

  @Override
  public Long getId() {
    return this.id;
  }

  @Override
  public void setId(Long id) {
    this.id = id;
  }
}
