class Animal {
    
    public final void sound() {
        System.out.println("Animal eats");
    }
}

class Dog extends Animal {
 
}

public class Final {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();  
    }
}
