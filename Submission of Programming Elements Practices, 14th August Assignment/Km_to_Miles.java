import java.util.Scanner;

public class Km_to_Miles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter distance in km: ");
        double km = sc.nextDouble();
        double miles = km / 1.6;
        System.out.printf("The total miles is %.2f mile for the given %.2f km\n", miles, km);
        sc.close();
    }
}
