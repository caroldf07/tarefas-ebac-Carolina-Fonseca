package main.java.builders;

import java.util.List;
import main.java.domain.Carro;
import main.java.domain.Marca;

public class MarcaBuilder {
  private String nome;
  private List<Carro> carro;

  public MarcaBuilder setNome(String nome) {
    this.nome = nome;
    return this;
  }

  public MarcaBuilder setCarro(List<Carro> carro) {
    this.carro = carro;
    return this;
  }

  public Marca createMarca() {
    return new Marca(nome, carro);
  }
}
