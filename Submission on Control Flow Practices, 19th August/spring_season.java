import java.util.Scanner;

public class spring_season {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter month (1-12): ");
        int month = input.nextInt();
        System.out.print("Enter day: ");
        int day = input.nextInt();

        boolean isSpring = ( (month == 3 && day >= 20) || (month > 3 && month < 6) || (month == 6 && day <= 20) );
        if (isSpring)
            System.out.println("Its a Spring Season");
        else
            System.out.println("Not a Spring Season");
        input.close();
    }
}
