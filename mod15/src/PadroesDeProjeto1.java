import java.util.Scanner;

/**
 * @author carolinafonseca
 * @version 1.0 Exercício referente a padrões de projeto do módulo 15 - Criar um padrão de projeto
 * Abstract Factory Method da classe Carro
 */
public class PadroesDeProjeto1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String gradeRequest = "";
        boolean hasContract = false;
        boolean continuar = true;

        while (continuar) {

            System.out.print("Especifique a grade: ");
            gradeRequest = scanner.next();

            System.out.println("Tem contrato? (SIM se tiver e NÂO caso não tenha: ");
            String contrato = scanner.next();


            if (contrato.equalsIgnoreCase("sim") || contrato.equalsIgnoreCase("s")) {
                hasContract = true;
                continuar = false;
            } else if (contrato.equalsIgnoreCase("não") || contrato.equalsIgnoreCase("n") ||
                    contrato.equalsIgnoreCase("nao")) {
                continuar = false;
            } else {
                System.out.println("Opção de contrato inválida, tente novamente");
            }
        }

        scanner.close();
        Client client = new Client(gradeRequest, hasContract);
        Factory factory = getCarFactory(client);
        Car clientCar = factory.create(client.getGradeRequest());
        System.out.println(clientCar.getColor());


    }

    private static Factory getCarFactory(Client client) {
        if (client.isHasCompanyContract()) {
            return new CompanyCarFactory();
        } else {
            return new CarFactory();
        }
    }
}
