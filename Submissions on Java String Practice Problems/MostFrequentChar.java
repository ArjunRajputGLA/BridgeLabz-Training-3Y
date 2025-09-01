import java.util.HashMap;
import java.util.Scanner;
public class MostFrequentChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        HashMap<Character, Integer> map = new HashMap<>();
        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        char mostFrequent = ' ';
        int maxCount = 0;
        for (char ch : map.keySet()) {
            if (map.get(ch) > maxCount) {
                maxCount = map.get(ch);
                mostFrequent = ch;
            }
        }
        System.out.println("Most Frequent Character: '" + mostFrequent + "'");
        sc.close();
    }
} 