/**
 * @author carolinafonseca on 21/02/2022
 * @project tarefas-ebac-Carolina-Fonseca Classe builder de Carro
 */
public class HondaBuilder {
    Honda carro;

    /**
     * Cria uma instância para o objeto Carro
     */
    public HondaBuilder() {
        this.carro = new Honda();
    }

    /**
     * Cria uma instância de CarroBuilder
     *
     * @return uma instância de CarroBuilder
     */
    public static HondaBuilder builder() {
        return new HondaBuilder();
    }

    /**
     * Adiciona no objeto o valor da potência do Carro
     *
     * @param potencia valor da potência do carro
     * @return a instância atual de CarroBuilder com a potência inclusa
     */
    public HondaBuilder potencia(long potencia) {
        this.carro.setPotencia(potencia);
        return this;
    }

    /**
     * Adiciona no objeto a quantidade máxima de combustível que o carro comporta
     *
     * @param quantidadeMaxCombustivel valor da quantidade máxima de combustível que o carro
     *                                 comporta
     * @return a instância atual de CarroBuilder com a quantidade máxima de combustível inclusa
     */
    public HondaBuilder quantidadeMaxCombustivel(long quantidadeMaxCombustivel) {
        this.carro.setQuantidadeMaxCombustivel(quantidadeMaxCombustivel);
        return this;
    }

    /**
     * Adiciona no objeto o tipo de combustível mais utilizado pelo carro
     *
     * @param tipoCombustivel tipo de combustível mais utilizado pelo carro
     * @return a instância atual de CarroBuilder com o tipo de combustível incluso
     */
    public HondaBuilder tipoCombustivel(String tipoCombustivel) {
        this.carro.setTipoCombustivel(tipoCombustivel);
        return this;
    }

    /**
     * Adiciona no objeto a cor do carro
     *
     * @param cor recebe a cor do carro
     * @return a instância atual de CarroBuilder com a cor do carro inclusa
     */
    public HondaBuilder cor(String cor) {
        this.carro.setCor(cor);
        return this;
    }

    public Honda build() {
        return this.carro;
    }

}
