package CrackYourPlacementDay12;

import java.util.Arrays;

public class MaximumProductofThreeNumbers {

    // Method to find the maximum product of three numbers
    public static int maximumProduct(int[] nums) {
        if (nums == null || nums.length < 3) {
            throw new IllegalArgumentException("Array must have at least three numbers.");
        }

        // Sort the array
        Arrays.sort(nums);

        // Calculate the product of the three largest numbers
        int product1 = nums[nums.length - 1] * nums[nums.length - 2] * nums[nums.length - 3];

        // Calculate the product of the two smallest numbers and the largest number
        int product2 = nums[0] * nums[1] * nums[nums.length - 1];

        // Return the maximum of the two products
        return Math.max(product1, product2);
    }

    // Main method to test the functionality
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 4};
        int[] nums2 = {-10, -10, 5, 2};
        int[] nums3 = {-1, -2, -3, -4};

        System.out.println(maximumProduct(nums1)); // Output: 24
        System.out.println(maximumProduct(nums2)); // Output: 500
        System.out.println(maximumProduct(nums3)); // Output: -6
    }
}
