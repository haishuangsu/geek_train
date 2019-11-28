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

    public static void main(String args[]) {
        int[] arrs = new int[]{1,1,2,3,3,5,6};
        int n = new Solution().removeDuplicates(arrs);
        for (int i = 0; i < n; i++){
            System.out.println(arrs[i]);
        }
    }
}
