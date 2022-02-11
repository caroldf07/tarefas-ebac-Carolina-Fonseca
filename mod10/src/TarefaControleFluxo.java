/**
 * @author carolinafonseca
 * @version 1.0 Classe responsável pelo cálculo da média de 4 notas com controle de fluxo
 */
public class TarefaControleFluxo {
  /**
   * @param nota1 valor da primeira nota
   * @param nota2 valor da segunda nota
   * @param nota3 valor da terceira nota
   * @param nota4 valor da quarta nota
   */
  public void Media(int nota1, int nota2, int nota3, int nota4) {
    double mediaFluxo = (nota1 + nota2 + nota3 + nota4);
    mediaFluxo = mediaFluxo / 4;
    System.out.println("A Média das notas é: " + mediaFluxo);
    if (mediaFluxo >= 7) {
      System.out.println("Essa pessoa está aprovada");
    } else if (mediaFluxo >= 5) {
      System.out.println("Essa pessoa está de recuperação");
    } else {
      System.out.println("Essa pessoa está reprovada");
    }
  }
}
