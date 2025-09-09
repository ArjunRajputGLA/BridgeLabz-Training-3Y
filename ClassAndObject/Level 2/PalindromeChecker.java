public class PalindromeChecker {
    String text;

    PalindromeChecker(String text) {
        this.text = text;
    }

    boolean isPalindrome() {
        String clean = text.replaceAll("\\s", "").toLowerCase();
        String rev = new StringBuilder(clean).reverse().toString();
        return clean.equals(rev);
    }

    void show() {
        if (isPalindrome())
            System.out.println(text + " is palindrome");
        else
            System.out.println(text + " is not palindrome");
    }

    public static void main(String[] args) {
        PalindromeChecker p1 = new PalindromeChecker("A man a plan a canal Panama");
        PalindromeChecker p2 = new PalindromeChecker("Hello");
        p1.show();
        p2.show();
    }
}
