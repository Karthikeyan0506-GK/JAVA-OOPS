class Car {
    String make;
    String model;
    int year;

    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public void displayInfo() {
        System.out.println("Car Make: " + make);
        System.out.println("Car Model: " + model);
        System.out.println("Car Year: " + year);
    }
}

public class ConstructorAttribute {
    public static void main(String[] args) {
        
        Car car1 = new Car("Maruti Suzuki", "vitara", 2016);
        Car car2 = new Car("jaguar", "F-pace", 2016);
        Car car3 = new Car("Ford", "Mustang", 2021);

        System.out.println("Car 1 Info:");
        car1.displayInfo();
        System.out.println();

        System.out.println("Car 2 Info:");
        car2.displayInfo();
        System.out.println();

        System.out.println("Car 3 Info:");
        car3.displayInfo();
    }
}