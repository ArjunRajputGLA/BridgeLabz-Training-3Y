import java.util.Scanner;

public class factorial_using_while {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();

        if (n >= 0) {
            int fact = 1, i = 1;
            while (i <= n) {
                fact *= i;
                i++;
            }
            System.out.println("Factorial of " + n + " is " + fact);
        } 
        else System.out.println("Not a natural number");
        input.close();
    }
}
