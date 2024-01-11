package org.example.task1;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Program {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        Animal[] animals = {
                new Cat("Cat1", 2, "White"),
                new Cat("Cat2", 3, "Black"),
                new Dog("Dog1", 5, "Bull terrier"),
                new Dog("Dog2", 7, "Husky")
        };

        for (Animal animal : animals) {
            System.out.println(animal);
            Class<?> clazz = animal.getClass();
            System.out.println("Class: " + clazz.getSimpleName());
            Method[] methods = clazz.getDeclaredMethods();
            Field[] fields = clazz.getDeclaredFields();
            for (Method method: methods){
                System.out.println("\tPrivate метод: " + method.getName());
                if (method.getName().equals("makeSound")) {
                    System.out.println("\tМетод makeSound: ");
                    method.invoke(animal);
                } else System.out.println("\tМетод makeSound отсутствует!");
            }
            for (Field field: fields){
                System.out.println("\tPrivate поле: " + field.getName());
            }
        }
    }
}
