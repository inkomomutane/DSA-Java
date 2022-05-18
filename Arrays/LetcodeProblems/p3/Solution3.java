package Arrays.LetcodeProblems.p3;

public class Solution3 {
    public int removeElement(int[] nums, int val) {
        int length = nums.length;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                nums[i] = 0;
                length--;
            }
        }
        return  length;
    }
}