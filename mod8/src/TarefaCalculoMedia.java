/**
 * @author carolinafonseca
 * @version 1.0 Classe responsável pelo cálculo da média de 4 notas
 */
public class TarefaCalculoMedia {
    /**
     * @param nota1 valor da primeira nota
     * @param nota2 valor da segunda nota
     * @param nota3 valor da terceira nota
     * @param nota4 valor da quarta nota
     */
    public void Media(int nota1, int nota2, int nota3, int nota4) {
        double media = (nota1 + nota2 + nota3 + nota4);
        media = media / 4;
        System.out.println("A Média das notas é: " + media);
    }
}
