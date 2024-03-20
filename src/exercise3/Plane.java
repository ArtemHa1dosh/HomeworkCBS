package exercise3;

public class Plane extends Vehicle {
    private double height;
    private int numOfPassengers;

    public Plane(double coordinateX, double coordinateY, int price, int speed, int year, double height, int numOfPassengers) {
        super(coordinateX, coordinateY, price, speed, year);
        this.height = height;
        this.numOfPassengers = numOfPassengers;
    }
    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Height: " + height);
        System.out.println("Passengers: " + numOfPassengers);
    }
}
