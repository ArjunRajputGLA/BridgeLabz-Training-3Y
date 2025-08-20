import java.util.Scanner;

public class multiplication_6_to_9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
        input.close();
    }
}