/**
 * @author carolinafonseca on 17/02/2022
 * @project tarefas-ebac-Carolina-Fonseca Classe de cliente sem contrato com a empresa
 */
public class CarFactory extends Factory {

    /**
     * @param requestedgrade recebe a grade da solicitação do cliente
     * @return retorna o carro de acordo com a nota passada anteriormente
     */
    @Override
    protected Car retrieveCar(String requestedgrade) {
        switch (requestedgrade) {
            case "C":
                return new Volks(1000, "full", "green");
            case "D":
                return new Toyota(800, "full", "yellow");
            default:
                System.out.println("Opção inválida");
                return null;
        }
    }
}
