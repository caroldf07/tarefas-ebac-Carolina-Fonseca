/**
 * @author carolinafonseca on 17/02/2022
 * @project tarefas-ebac-Carolina-Fonseca
 */
public abstract class Factory {

  /**
   * @param requestedgrade grade solicitada pelo cliente
   * @return solicitação finalizada e o carro pronto para o uso do cliente
   */
  public Car create(String requestedgrade) {
    Car car = retrieveCar(requestedgrade);
    return prepareCar(car);
  }

  /**
   * @param requestedgrade recebe a grade da solicitação do cliente
   * @return retorna o carro de acordo com a nota passada anteriormente
   */
  protected abstract Car retrieveCar(String requestedgrade);

  /**
   * @param car Carro disponibilizado para o cliente de acordo com a regra de negócio
   * @return carro pronto para o uso do cliente
   */
  private Car prepareCar(Car car) {
    car.clean();
    car.mechanicCheck();
    car.fuelCar();
    return car;
  }
}
