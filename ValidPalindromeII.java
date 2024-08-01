package CrackYourPlacementDay12;

public class ValidPalindromeII {

    // Main method to check if the string can be a palindrome after removing at most one character
    public static boolean validPalindrome(String s) {
        if (s == null || s.length() < 2) {
            return true; // A string with 0 or 1 character is always a palindrome
        }

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                // Check two possibilities: removing the character at left or at right
                return canBePalindrome(s, left + 1, right) || canBePalindrome(s, left, right - 1);
            }
            left++;
            right--;
        }

        return true; // If no mismatches are found, the string is already a palindrome
    }

    // Helper method to check if a substring (from left to right) is a palindrome
    private static boolean canBePalindrome(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false; // If mismatch found, it's not a palindrome
            }
            left++;
            right--;
        }
        return true; // If all characters match, it's a palindrome
    }

    // Main method to test the functionality
    public static void main(String[] args) {
        System.out.println(validPalindrome("abca")); // Output: true
        System.out.println(validPalindrome("abc"));  // Output: false
        System.out.println(validPalindrome("racecar")); // Output: true
        System.out.println(validPalindrome("hello"));   // Output: false
    }
}

