class Animal1 {
    String sound = "Animal Sound";
}

class Dog1 extends Animal1 {
    void displaySound() {
        // Accessing the superclass member using 'super'
        System.out.println("Dog Sound: " + super.sound);
    }
}

public class Person {
    public static void main(String[] args) {
        Dog1 myDog = new Dog1();
        myDog.displaySound();
    }
}
