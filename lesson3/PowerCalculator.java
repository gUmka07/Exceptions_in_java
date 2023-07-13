import java.util.Scanner;

class InvalidInputException extends Exception {
    public InvalidInputException(String message) {
        super(message);
    }
}

public class PowerCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Введите основание: ");
            double base = scanner.nextDouble();
            System.out.print("Введите степень: ");
            int exponent = scanner.nextInt();

            double result = calculatePower(base, exponent);
            System.out.println("Результат: " + result);
        } catch (InvalidInputException e) {
            System.out.println(e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Ошибка деления на ноль");
        }

        scanner.close();
    }

    public static double calculatePower(double base, int exponent) throws InvalidInputException {
        if (base == 0 && exponent < 0) {
            throw new InvalidInputException("Некорректное основание и отрицательная степень");
        }

        return Math.pow(base, exponent);
    }
}
