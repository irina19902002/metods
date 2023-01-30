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
    private String type;
    int year;
    public void start() {
        System.out.println("Автомобиль заведен");
    }
    public void off() {
        System.out.println("Автомобиль заглушен");
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getColor() {
        return color.toUpperCase();
    }
    public void setColor(String color) {
        this.color = color;
    }
    public Car() {
        color = "green";
    }
}
