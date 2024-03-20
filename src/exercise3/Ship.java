package exercise3;

public class Ship extends Vehicle {
    private int numOfPassengers;
    private String port;

    public Ship(double coordinateX, double coordinateY, int price, int speed, int year, int numOfPassengers, String port) {
        super(coordinateX, coordinateY, price, speed, year);
        this.numOfPassengers = numOfPassengers;
        this.port = port;
    }
    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Passengers: " + numOfPassengers);
        System.out.println("Port: " + port);
    }
}
