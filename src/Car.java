public class Car {
    String brand;
    String model;
    String milage;

    public Car(String brand, String model, String milage) {
        this.brand = brand;
        this.model = model;
        this.milage = milage;
    }
    public void drive() {
        System.out.println("The " + brand + " " + model + " is driving with"+milage);
    }

    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Camry", "26mpl");
        Car car2 = new Car("Honda", "Civic", "24mpl");

        System.out.println(car1.brand);
        System.out.println(car1.model);
        car1.drive();
        car2.drive();
    }
}
