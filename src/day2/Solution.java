package day2;

public class Solution {

    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int i = 0;
        for (int n : nums) {
            if (i == 0 || nums[i - 1] != n) {
                nums[i] = n;
                i++;
            }
        }
        return i;
    }
}
