// Простая задача 1:
// Напишите программу, которая запрашивает у пользователя два целых числа и выполняет их деление. 
// Если второе число равно нулю, выбросите исключение ArithmeticException с сообщением
// "Деление на ноль недопустимо". Иначе выведите результат деления на экран.

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Введите первое число: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Введите второе число: ");
        int num2 = scanner.nextInt();
        
        try {
            if (num2 == 0) {
                throw new ArithmeticException("Деление на ноль недопустимо");
            }
            
            int result = num1 / num2;
            System.out.println("Результат деления: " + result);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}