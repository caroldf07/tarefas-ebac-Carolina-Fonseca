import java.util.Scanner;

/**
 * @author carolinafonseca
 * Classe para casting de variável
 */
public class TarefaWrapper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um valor numérico: ");
        int variavel = scanner.nextInt();

        Integer novaVariavel = (Integer) variavel;

        System.out.println("A variavél foi: " + novaVariavel + "do tipo: " + novaVariavel.getClass().getName());
    }
}
