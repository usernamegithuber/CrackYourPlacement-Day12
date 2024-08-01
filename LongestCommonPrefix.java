package CrackYourPlacementDay12;

import java.util.Arrays;

public class LongestCommonPrefix {

    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        // Sort the array
        Arrays.sort(strs);

        // Convert the first and last strings to char arrays
        char[] first = strs[0].toCharArray();
        char[] last = strs[strs.length - 1].toCharArray();

        // Use a StringBuilder to store the common prefix
        StringBuilder sc = new StringBuilder();

        // Compare characters of the first and last string in the sorted array
        for (int i = 0; i < first.length; i++) {
            if (i >= last.length || first[i] != last[i]) {
                break;
            }
            sc.append(first[i]);
        }

        return sc.toString();
    }

    public static void main(String[] args) {
        String[] strs = {"sow", "cow", "cow"};
        System.out.println(longestCommonPrefix(strs));  // Output: ""
    }
}
