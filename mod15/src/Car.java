/**
 * @author carolinafonseca on 17/02/2022
 * @project tarefas-ebac-Carolina-Fonseca Classe de modelo do Carro
 */
public abstract class Car {

    private int horsePower;
    private String fuelSource;
    private String color;

    public int getHorsePower() {
        return horsePower;
    }

    public String getFuelSource() {
        return fuelSource;
    }

    public String getColor() {
        return color;
    }

    /**
     * @param horsePower Potência do motor
     * @param fuelSource Fonte do combustível
     * @param color      cor do carro
     */
    public Car(int horsePower, String fuelSource, String color) {
        this.horsePower = horsePower;
        this.fuelSource = fuelSource;
        this.color = color;
    }

    public void clean() {
    }

    public void mechanicCheck() {
        System.out.println("The car is ok!");
    }

    public void fuelCar() {
    }
}
