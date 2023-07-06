package lesson2;
// Задача 1:
// Напишите программу, которая запрашивает у пользователя число и проверяет, является ли оно положительным. 
// Если число отрицательное или равно нулю, программа должна выбрасывать исключение InvalidNumberException с сообщением "Некорректное число". 
// В противном случае, программа должна выводить сообщение "Число корректно".

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Введите число: ");
            int number = Integer.parseInt(scanner.nextLine());
            
            if (number <= 0) {
                throw new InvalidNumberException("Некорректное число");
            }
            
            System.out.println("Число корректно");
        } catch (NumberFormatException e) {
            System.out.println("Некорректный ввод");
        } catch (InvalidNumberException e) {
            System.out.println(e.getMessage());
        }
    }
}

class InvalidNumberException extends Exception {
    public InvalidNumberException(String message) {
        super(message);
    }
}
