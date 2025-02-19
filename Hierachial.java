class Dog extends Animal{
    void bark(){
        System.out.println("barking");
    }
}

class Cat extends Animal{
    void meow(){
        System.out.println("meowing");
    }
}

public class Hierachial{
    public static void main(String[] args) {
        Dog dog=new Dog();
        dog.bark();

        Cat cat=new Cat();
        cat.meow();
        cat.meow();
    }
}