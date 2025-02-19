class Animal{
    void eat(){
    System.out.println("eating");
    }
}

class Dog extends Animal{
    void bark(){
        System.out.println("barking");
    }
}

class LabDog extends Animal{
void sleep(){
    System.out.println("sleeping");
}
}

public class Multilevel{
    public static void main(String[] args) {
        LabDog labDog =new LabDog();
        labDog.eat();
        
      
        labDog.sleep();
    }  
}