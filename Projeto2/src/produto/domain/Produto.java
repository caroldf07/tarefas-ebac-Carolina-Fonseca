package produto.domain;

import generic.dao.Chave;
import generic.dao.Persistente;
import java.math.BigDecimal;

public class Produto implements Persistente {
  @Chave("getCodigo")
  private long codigo;

  private String nome;
  private String descricaoProduto;
  private BigDecimal valor;

  public Produto(long codigo, String nome, String descricaoProduto, BigDecimal valor) {
    this.codigo = codigo;
    this.nome = nome;
    this.descricaoProduto = descricaoProduto;
    this.valor = valor;
  }

  public long getCodigo() {
    return codigo;
  }

  public String getNome() {
    return nome;
  }

  public String getDescricaoProduto() {
    return descricaoProduto;
  }

  public BigDecimal getValor() {
    return valor;
  }

  @Override
  public String toString() {
    return "Produto{"
        + "codigo="
        + codigo
        + ", nome='"
        + nome
        + '\''
        + ", descricaoProduto='"
        + descricaoProduto
        + '\''
        + ", valor="
        + valor
        + '}';
  }

  public void setCodigo(long codigo) {
    this.codigo = codigo;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public void setDescricaoProduto(String descricaoProduto) {
    this.descricaoProduto = descricaoProduto;
  }

  public void setValor(BigDecimal valor) {
    this.valor = valor;
  }
}
