/**
 * @author carolinafonseca on 21/02/2022
 * @project tarefas-ebac-Carolina-Fonseca Classe base dos veículos - TemplateMethod
 */
public abstract class Carro {
    private long potencia;
    private long quantidadeMaxCombustivel;
    private String tipoCombustivel;
    private String cor;

    public void setPotencia(long potencia) {
        this.potencia = potencia;
    }

    public void setQuantidadeMaxCombustivel(long quantidadeMaxCombustivel) {
        this.quantidadeMaxCombustivel = quantidadeMaxCombustivel;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    public long getPotencia() {
        return potencia;
    }

    public long getQuantidadeMaxCombustivel() {
        return quantidadeMaxCombustivel;
    }

    public String getCor() {
        return cor;
    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    /**
     * @param potencia                 potência do motor
     * @param quantidadeMaxCombustivel quantidade de combustível que o carro comporta
     * @param tipoCombustivel          tipo de combustível mais utilizado no carro
     * @param cor                      cor do carro
     */
    public Carro(long potencia, long quantidadeMaxCombustivel, String tipoCombustivel, String cor) {
        this.potencia = potencia;
        this.quantidadeMaxCombustivel = quantidadeMaxCombustivel;
        this.tipoCombustivel = tipoCombustivel;
        this.cor = cor;
    }

    public Carro() {
    }

    @Override
    public String toString() {
        return "Carro{" + "potencia=" + potencia + ", quantidadeMaxCombustivel=" +
                quantidadeMaxCombustivel + ", tipoCombustivel='" + tipoCombustivel + '\'' +
                ", cor='" + cor + '\'' + '}';
    }
}
