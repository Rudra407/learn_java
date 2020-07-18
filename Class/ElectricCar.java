package tech.codingclub;

public class ElectricCar extends  Car{

    private double batteryLife = 100;

    public ElectricCar() {
        super();
    }

    public ElectricCar(String numberPlate)
    {
        super(numberPlate);
    }

    public ElectricCar(String numberPlate, int currentSpeed)
    {
        super(numberPlate, currentSpeed);
    }

    public double getBatteryLife()
    {
        return batteryLife;
    }

    public void accelerate()
    {
        super.accelerate();
        batteryLife = batteryLife - 0.50;
    }

    public static void main(String[] args) {

        ElectricCar tesla = new ElectricCar("TESLA 007",500);
        tesla.accelerate();
        ElectricCar.printAboutWheel();
        System.out.println("Tesla speed : "+tesla.getCurrentSpeed()+" Battery Left : "+ tesla.getBatteryLife());
    }
}
