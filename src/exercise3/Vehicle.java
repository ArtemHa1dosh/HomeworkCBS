package exercise3;

public class Vehicle {
    private double coordinateX;
    private double coordinateY;
    private int price;
    private int speed;
    private int year;

    public Vehicle(double coordinateX, double coordinateY, int price, int speed, int year) {
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
        this.price = price;
        this.speed = speed;
        this.year = year;
    }

    public void showInfo() {
        System.out.println("Price: " + price);
        System.out.println("Speed: " + speed);
        System.out.println("Year: " + year);
        System.out.println("Coordinates: (" + coordinateX + ", " + coordinateY + ")");
    }

    public static void main(String[] args) {
        Plane plane = new Plane(1000000, 900, 2010, 50, 60, 10000, 200);
        Car car = new Car(20000, 180, 2015, 10, 20);
        Ship ship = new Ship(500000, 60, 2018, 30, 40, 500, "Miami");

        System.out.println("Plane info:");
        plane.showInfo();
        System.out.println();

        System.out.println("Car info:");
        car.showInfo();
        System.out.println();

        System.out.println("Ship info:");
        ship.showInfo();
    }
}

