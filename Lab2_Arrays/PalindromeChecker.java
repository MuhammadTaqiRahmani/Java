//Muhammad Taqi Rahmani - 283 - F - BSE
package Lab2_Arrays;
public class PalindromeChecker {
    public static void main(String[] args) {
        String[] stringArray = {"level", "hello", "radar", "world"};

        for (String str : stringArray) {
            if (isPalindrome(str)) {
                System.out.println(str + " is a palindrome.");
            } else {
                System.out.println(str + " is not a palindrome.");
            }
        }
    }

    public static boolean isPalindrome(String str) {
        str = str.toLowerCase();
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
