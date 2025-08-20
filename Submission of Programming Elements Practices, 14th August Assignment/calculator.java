import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double number1 = sc.nextDouble();
        System.out.print("Enter second number: ");
        double number2 = sc.nextDouble();
        double add = number1 + number2;
        double sub = Math.abs(number1 - number2);
        double mul = number1 * number2;
        double div = number1 / number2;
        System.out.printf("The addition, subtraction, multiplication and division value of 2 numbers %.2f and %.2f is %.2f, %.2f, %.2f, and %.2f\n", number1, number2, add, sub, mul, div);
        sc.close();
    }
}
