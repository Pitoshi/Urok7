package ru.innopolis;

public class MyProgram {
    public static void main(String[] args) {
        // Создаем новую карту
        Card myCard = new Card("1234567812345678", "0000");

        // Вызываем метод печати с маской
        myCard.printMaskedNumber();

        // Вызываем метод печати с пин-кодом
        myCard.printNumberIfPinMatches("0000"); // правильный пин-код
        myCard.printNumberIfPinMatches("1234"); // неправильный пин-код
    }
}

