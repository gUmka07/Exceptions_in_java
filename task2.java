// Простая задача 2: 
// Обработка некорректного ввода
// Напишите программу, которая запрашивает у пользователя его возраст. Если введенное значение не является числом, 
// выбросите исключение NumberFormatException 
// с сообщением "Некорректный ввод". Иначе выведите возраст на экран

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Введите ваш возраст: ");
            int age = Integer.parseInt(scanner.nextLine());
            System.out.println("Ваш возраст: " + age);
        } catch (NumberFormatException e) {
            System.out.println("Некорректный ввод");
        }
    }
}