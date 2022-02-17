/**
 * @author carolinafonseca on 17/02/2022
 * @project tarefas-ebac-Carolina-Fonseca
 */
public class CompanyCarFactory extends Factory {
  /**
   * @param requestedgrade recebe a grade da solicitação do cliente
   * @return retorna o carro de acordo com a nota passada anteriormente
   */
  @Override
  protected Car retrieveCar(String requestedgrade) {
    switch (requestedgrade) {
      case "A":
        return new Tesla(1000, "full", "blue");
      case "B":
        return new Audi(800, "full", "red");
      default:
        System.out.println("Opção inválida");
        return null;
    }
  }
}
