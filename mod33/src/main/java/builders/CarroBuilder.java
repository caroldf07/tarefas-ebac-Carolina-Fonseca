package main.java.builders;

import java.util.List;
import main.java.domain.*;

public class CarroBuilder {
  private String nome;
  private Marca marca;
  private List<Acessorio> acessorios;

  public CarroBuilder setNome(String nome) {
    this.nome = nome;
    return this;
  }

  public CarroBuilder setMarca(Marca marca) {
    this.marca = marca;
    return this;
  }

  public CarroBuilder setAcessorios(List<Acessorio> acessorios) {
    this.acessorios = acessorios;
    return this;
  }

  public Carro createCarro() {
    return new Carro(nome, marca, acessorios);
  }
}
