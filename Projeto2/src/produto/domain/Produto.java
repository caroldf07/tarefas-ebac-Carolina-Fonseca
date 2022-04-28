package produto.domain;

import java.math.BigDecimal;

public class Produto {
    private final long codigo;
    private final String nome;
    private final String descricaoProduto;
    private final BigDecimal valor;

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
        return "Produto{" +
                "codigo=" + codigo +
                ", nome='" + nome + '\'' +
                ", descricaoProduto='" + descricaoProduto + '\'' +
                ", valor=" + valor +
                '}';
    }
}
