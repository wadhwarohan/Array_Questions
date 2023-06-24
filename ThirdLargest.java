import java.util.Arrays;

class Solution {
    public int thirdMax(int[] nums) {
        long m1 = Long.MIN_VALUE;
        long m2 = Long.MIN_VALUE;
        long m3 = Long.MIN_VALUE;
        Arrays.sort(nums);
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] > m1)
                m1 = nums[i];
            else if (m1 > nums[i] && nums[i] > m2)
                m2 = nums[i];
            else if (m2 > nums[i] && nums[i] > m3)
                m3 = nums[i];
        }
        return (m3 == Long.MIN_VALUE ? (int) m1 : (int) m3);
    }
}

class ThirdLargest {
    public static void main(String[] args) {
        int[] nums = { 3, 8, 4, 1, 0 };
        System.out.println("The 3rd largest number is " + new Solution().thirdMax(nums));
    }
}