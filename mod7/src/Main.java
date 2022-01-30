import java.time.LocalDate;

/**
 * @author carolina.fonseca
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {
        Estudante estudante = new Estudante(1234, "Carolina", "Nascimento", LocalDate.of(1993, 11, 07));
        System.out.println("A pessoa registrada como estudante é: " + estudante);
    }
}
