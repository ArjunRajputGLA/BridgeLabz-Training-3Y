import java.util.Scanner;

public class sum_natural_numbers_(While + Formula) {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = input.nextInt();

        if (n > 0) {
            int formulaSum = n * (n + 1) / 2;

            int sum = 0, i = 1;
            while (i <= n) {
                sum += i;
                i++;
            }

            System.out.println("Formula Sum = " + formulaSum);
            System.out.println("While Loop Sum = " + sum);
            System.out.println("Both are equal? " + (formulaSum == sum));
        } else {
            System.out.println("Not a natural number");
        }
        input.close();
    }
}
