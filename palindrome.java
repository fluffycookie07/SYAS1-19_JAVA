public class palindrome {
    public static void main(String[] args) {
        int num = 121, original, reverse = 0, rem = 0;
        original = num;

        while (num > 0) {
            rem = num % 10;
            reverse = reverse * 10 + rem;
            num = num / 10;
        }

        if (original == reverse) {
            System.out.println(original + " is a palindrome.");
        } else {
            System.out.println(original + " is not a palindrome.");
        }
    }
}

