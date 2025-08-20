import java.util.Scanner;

public class sum_until_0 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double total = 0.0;

        System.out.print("Enter number (0 to stop): ");
        double num = input.nextDouble();

        while (num != 0) {
            total += num;
            System.out.print("Enter number (0 to stop): ");
            num = input.nextDouble();
        }

        System.out.println("The total sum is " + total);
        input.close();
    }    
} 