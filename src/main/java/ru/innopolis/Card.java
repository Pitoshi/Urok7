package ru.innopolis;

public class Card {
    private final String number;
    private final String pinCode;
    // Конструктор
    public Card(String number, String expirationDate, String cvv, String pinCode) {
        this.number = number;
        this.pinCode = pinCode;
    }

    // Метод для печати номера карты с маской
    public void printMaskedNumber() {
        String maskedNumber = "**** ** ** " + number.substring(number.length() - 4);
        System.out.println(maskedNumber);
    }

    // Метод для проверки пин-кода и печати номера карты
    public void printNumberIfPinMatches(String inputPin) {
        if (inputPin.equals(pinCode)) {
            System.out.println(number);
        } else {
            System.out.println("Неверный пин-код.");
        }
    }
}


