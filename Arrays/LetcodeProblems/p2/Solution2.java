package Arrays.LetcodeProblems.p2;

public class Solution2 {
    public int[] removeDuplicates(int[] nums) {
        if (nums.length < 1) {
            return new int[] {};
        }
        int k = nums.length;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i] == nums[i-1]){
                for (int j = i; j < k; j++) {
                    nums[j -1] = (j) < nums.length -1 ? nums[j-1] : nums[j] ;
                }
                k--;
            }
        }
        return nums;
    }
}
