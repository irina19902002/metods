package ru.car;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();
        car1.start();
        car2.off();
        System.out.println(car1.getColor());
        System.out.println(car2.getColor());
        System.out.println("Автомобиль car1 "+" " +car1.returYear(2020)+car1.returType(" Новый"));
        System.out.println("Автомобиль car2 "+" " +car2.returYear(1990)+car2.returType(" Б.У"));
    }
}
