public class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int left = 0; // left pointer

        // Iterate through the array
        for (int i = 0; i < n; i++) {
            // If the value is non-zero
            if (nums[i] != 0) {
                // Move the non-zero element to the left side of the array
                nums[left] = nums[i];
                left++;
            }
        }

        // Fill the remaining elements with zeros
        while (left < n) {
            nums[left] = 0;
            left++;
        }
    }
}
