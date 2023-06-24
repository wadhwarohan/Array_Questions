import java.util.Arrays;

class Solution {
    public int NthLargest(int[] nums, int n) {
        Arrays.sort(nums);
        return nums[nums.length - n];
    }
}

public class NthLargest {
    public static void main(String[] args) {
        int[] nums = { 5, 2, 1, 7, 4 };
        System.out.println("The " + (new Solution()).NthLargest(nums, 3) + " is the Nth largest number in array");
    }
}