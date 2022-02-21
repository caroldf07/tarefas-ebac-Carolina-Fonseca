/**
 * @author carolinafonseca on 21/02/2022
 * @project tarefas-ebac-Carolina-Fonseca
 */
public class Tesla extends Carro {
  /**
   * @param potencia potência do motor
   * @param quantidadeMaxCombustivel quantidade de combustível que o carro comporta
   * @param tipoCombustivel tipo de combustível mais utilizado no carro
   * @param cor cor do carro
   */
  public Tesla(long potencia, long quantidadeMaxCombustivel, String tipoCombustivel, String cor) {
    super(potencia, quantidadeMaxCombustivel, tipoCombustivel, cor);
  }

  public Tesla() {}
}
