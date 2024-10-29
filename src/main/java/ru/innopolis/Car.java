package ru.innopolis;

public class Car {
    private int currentSpeed; // Текущая скорость автомобиля

    // Конструктор по умолчанию
    public Car() {
        this.currentSpeed = 0; // Изначальная скорость равна 0
    }

    // Метод для получения текущей скорости
    public int getCurrentSpeed() {
        return currentSpeed;
    }

    // Метод для увеличения скорости
    public void speedUp(int increment) {
        currentSpeed += increment;
    }

    // Метод для торможения
    public void brake() {
        currentSpeed -= 10;
        if (currentSpeed < 0) {
            currentSpeed = 0; // Если скорость меньше 0, устанавливаем в 0
        }
    }
}



