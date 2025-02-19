class Calculator {

    int add(int a, int b) {
        return a + b;
    }
    int add(int a, int b, int c) {
        return a + b + c;
    }
    double add(double a, double b) {
        return a + b;
    }
}

public class MethodOverloading {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("Sum of two integers: " + calc.add(67, 87));
        System.out.println("Sum of three integers: " + calc.add(78, 90, 56));
        System.out.println("Sum of two doubles: " + calc.add(5.9, 6.6));
    }
}