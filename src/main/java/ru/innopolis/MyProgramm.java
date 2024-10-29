package ru.innopolis;

public class MyProgramm {
    public static void main(String[] args) {
        // Создаем новый экземпляр класса Car
        Car car = new Car();

        // Запрашиваем текущую скорость и выводим на экран
        String speed = String.valueOf(car.getCurrentSpeed());
        System.out.println(speed); // Тут 0

        // Увеличиваем скорость на 25 единиц
        car.speedUp(25);
        speed = String.valueOf(car.getCurrentSpeed());
        System.out.println(speed); // Тут 25

        // Вызываем метод brake()
        car.brake();
        speed = String.valueOf(car.getCurrentSpeed());
        System.out.println(speed); // Тут 15

        // Вызываем метод brake() снова
        car.brake();
        speed = String.valueOf(car.getCurrentSpeed());
        System.out.println(speed); // Тут 5

        // Вызываем метод brake() еще раз
        car.brake();
        speed = String.valueOf(car.getCurrentSpeed());
        System.out.println(speed); // Тут 0
    }
}