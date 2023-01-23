package ru.car;
// Напишите программу с классом Car.
//        Создайте конструктор класса Car.
//        Создайте атрибуты класса Car — color (цвет), type (тип), year (год).
//        Напишите пять методов:
//        Первый — запуск автомобиля, при его вызове выводится сообщение «Автомобиль заведен».
//        Второй — отключение автомобиля — выводит сообщение «Автомобиль заглушен».
//        Третий — присвоение автомобилю года выпуска.
//        Четвертый метод — присвоение автомобилю типа.
//        Пятый — присвоение автомобилю цвета.


public class Car {
    private String color;
    String type;
    int year;


    public void start(){
        System.out.println("Автомобиль заведен");
    }

    public void off(){
        System.out.println("Автомобиль заглушен");
    }

    public int returYear(int year){
        this.year = year;
        return year;
    }
    public String returType(String type){
        this.type = type;
        return type;
    }

    public String getColor(){
        return color;
    }
    public Car(){
        color="green";

    }
}
