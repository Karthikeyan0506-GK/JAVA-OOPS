interface Animal{
    void eat();
}

interface Barkable{
    void bark();
}

class Dog implements Animal,
Barkable{
    public void eat(){
        System.out.println("eating");
    }
    public void bark(){
        System.out.println("barking");
    }
}

public class Interface1{
    public static void main(String[] args) {
        Dog dog=new Dog();
        dog.eat();
        dog.bark();
    }
}