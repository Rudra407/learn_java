package tech.codingclub;

public class Car implements CarInterface {
    public static int wheelCount  = 4;

    int maxSpeed = 300;
    private int currentSPeed = 0;
    String numberPlate;

    public Car()
    {

    }

    public Car(String numberPlate)
    {
        this.numberPlate = numberPlate;
    }

    public Car(String numberPlate, int currentSPeed)
    {
        this.numberPlate = numberPlate;
        this.currentSPeed = currentSPeed;
    }
    public void accelerate(){
        System.out.println("Speeding Up!");
        currentSPeed+=10;
    }

    public void applyBrake() {
        currentSPeed = 0;
    }

    public static void printAboutWheel(){
        // not valid to write this
        //currentSpeed+=10;
        //But Valid
        System.out.println("car has " + wheelCount + " wheels.");
    }

    public static void main(String[] args) {

    }

    public void increaseSpeed(int i) {
        currentSPeed+=i;
        if(currentSPeed>maxSpeed)
            currentSPeed=maxSpeed;
    }

    public int getCurrentSpeed() {
        return currentSPeed;
    }
}
