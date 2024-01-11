package org.example.task1;

public class Dog extends Animal{
    private String breed;
    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    public void makeSound() {
        System.out.println("Gav!");
    }
    private void methodPrivateDog(){
        System.out.println("This is private method of Dog!");
    }
}
