package org.example.task1;

public class Cat extends Animal{
    private String colour;
    public Cat(String name, int age, String colour) {
        super(name, age);
        this.colour = colour;
    }
    private void methodPrivateCat() {
        System.out.println("This is private method for Cat!");
    }

}
