import java.util.Scanner;

public class countdosn_with_for_loop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter countdown start: ");
        int n = input.nextInt();

        for (int i = n; i >= 1; i--) {
            System.out.println(i);
        }
        System.out.println("Rocket Launched!");
        input.close();
    }
}
