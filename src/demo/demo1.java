package demo;

 class Dog {
    void bark() {
        System.out.println("The dog barks");
    }
}

class Animal extends Dog {
    void speak() {
        System.out.println("All animals speak");
    }
}

public class demo1 {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.bark(); 
        a.speak(); 
     System.out.println("git pull")
    }
}
