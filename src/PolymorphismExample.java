public class PolymorphismExample {
    public static void main(String[] args) {
        Animal cat = new Cat() ;  //polymorphism örnek
        Animal dog = new Dog() ;

        cat.makeSound() ;
        dog.makeSound() ;
    }
}
class Animal {
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}
class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }
}
class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }
}