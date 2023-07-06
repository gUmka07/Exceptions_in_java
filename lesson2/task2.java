package lesson2;

// Задача 2:
// Напишите программу, которая запрашивает у пользователя два числа и выполняет их деление. 
// Если второе число равно нулю, программа должна выбрасывать исключение DivisionByZeroException с сообщением "Деление на ноль недопустимо". 
// В противном случае, программа должна выводить результат деления.

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Введите первое число: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Введите второе число: ");
        int num2 = scanner.nextInt();
    
 
    try {
        if (num2 == 0) {
            throw new DivisionByZeroException ("Деление на ноль недопустимо");
        }
        
        int result = num1 / num2;
        System.out.println("Результат деления: " + result);
    } catch (DivisionByZeroException exc) {
        System.out.println(exc.getMessage());


        }
    }
}

class DivisionByZeroException extends Exception {
            public DivisionByZeroException(String message) {
                super(message);
    }
}
