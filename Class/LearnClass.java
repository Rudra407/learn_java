package tech.codingclub;

public class LearnClass {
    public static void main(String[] args) {
        Car audi = new Car("AUDI 007");
        audi.accelerate();
        audi.wheelCount = 8;

        Car bmw = new Car("BMW 707", 100);
        bmw.accelerate();
        bmw.increaseSpeed(400);

        System.out.println("Current Speed Audi : "+audi.getCurrentSpeed());
        System.out.println("Current Speed BMW : "+bmw.getCurrentSpeed());
        System.out.println("AW : "+audi.wheelCount);
        System.out.println("BW : "+bmw.wheelCount);

        bmw.printAboutWheel();
        Car.printAboutWheel();

        Car.wheelCount = 4;
        System.out.println("AW now : "+audi.wheelCount);
        System.out.println("BW now    : "+bmw.wheelCount);
        Car.printAboutWheel();

        DummyCar car1 = new DummyCar() {
            public void move() {
            this.accelerate();
            this.getCurrentSpeed();
            }
        };

        DummyCar car2 = new DummyCar() {
            public void move() {
                this.accelerate();
                this.getCurrentSpeed();
            }
        };

//        ElectricCar.main(null);


    }
}
