import java.util.Scanner;

public class area_of_triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base: ");
        double base = sc.nextDouble();
        System.out.print("Enter height: ");
        double height = sc.nextDouble();
        double areaInInches = 0.5 * base * height;
        double areaInCm = areaInInches * 6.4516;
        System.out.printf("The area of triangle is %.2f square inches and %.2f square cm\n", areaInInches, areaInCm);
        sc.close();
    }
}
