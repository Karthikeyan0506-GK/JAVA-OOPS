// ATTRIBUTES IN CLASSES ACCESSING AND MODIFYING IN IT
 
class Car {
   
    private String model;
    private int year;

    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

  
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

  
    public void displayInfo() {
        System.out.println("Car Model: " + model + ", Year: " + year);
    }
}

public class Modifying {
    public static void main(String[] args) {
       
        Car myCar = new Car("Toyota", 2020);

        System.out.println("Original Info:");
        myCar.displayInfo();

        
        myCar.setModel("Honda");
        myCar.setYear(2024);

        System.out.println("Updated Info:");
        myCar.displayInfo();
       
        System.out.println("Model: " + myCar.getModel());
        System.out.println("Year: " + myCar.getYear());
    }
}