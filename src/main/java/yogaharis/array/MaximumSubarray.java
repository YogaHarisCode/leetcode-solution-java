package yogaharis.array;

public class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        var maxSum = nums[0];
        var currentSum = 0;

        for (int num : nums) {
            currentSum = Math.max(num, num + currentSum);

            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
        }

        return maxSum;
    }
}
