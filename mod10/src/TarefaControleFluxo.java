/**
 * @author carolinafonseca
 * @version 1.0
 * Classe responsável pelo cálculo da média de 4 notas
 */
public class TarefaControleFluxo {
    private int nota1 = 0;
    private int nota2 = 0;
    private int nota3 = 0;
    private int nota4 = 0;
    private double media = 0.0;

    /**
     * @param nota1 valor da primeira nota
     * @param nota2 valor da segunda nota
     * @param nota3 valor da terceira nota
     * @param nota4 valor da quarta nota
     */
    public void Media(int nota1, int nota2, int nota3, int nota4) {
        this.media = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.println("A Média das notas é: " + media);
        if (media >= 7) {
            System.out.println("Essa pessoa está aprovada");
        } else if (media >= 5) {
            System.out.println("Essa pessoa está de recuperação");
        } else {
            System.out.println("Essa pessoa está reprovada");
        }
    }

    public int getNota1() {
        return nota1;
    }

    public int getNota2() {
        return nota2;
    }

    public int getNota3() {
        return nota3;
    }

    public int getNota4() {
        return nota4;
    }
}
