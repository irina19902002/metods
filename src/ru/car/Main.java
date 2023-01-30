package ru.car;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();
        car1.start();
        car2.off();
        car1.setYear(2014);
        car2.setYear(4999);
        car1.setType("new");
        car2.setType("new");
        car1.setColor("new1");
        car2.setColor("new2");

        System.out.println(car1.getColor());
        System.out.println(car2.getColor());
        System.out.println("Автомобиль car1 "+" " +car1.getYear()+car1.getType());
        System.out.println("Автомобиль car2 "+" " +car2.getYear()+car2.getType());
    }
}
