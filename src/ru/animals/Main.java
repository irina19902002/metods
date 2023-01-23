package ru.animals;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.catName = "Маруся";
        System.out.println("Кошку зовут "+ cat.catName);
        cat.drinkMilk();
    }
}
