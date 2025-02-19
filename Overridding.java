class Animal {
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {

    public void sound() {
        System.out.println("Dog barks");
    }
}
class Cat extends Animal {
    public void sound() {
        System.out.println("Cat meows");
    }
}

public class Overridding {
    public static void main(String[] args) {
        Animal animal = new Dog();  
        animal.sound();  

        animal = new Cat(); 
        animal.sound(); 
    }
}