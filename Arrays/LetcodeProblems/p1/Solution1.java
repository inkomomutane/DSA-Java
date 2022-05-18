package Arrays.LetcodeProblems.p1;

public class Solution1 {
    public  int[] sumTwo(int[] nums,int target) {
        int indeces[] = {-1,-1};
        if (nums.length < 2) {System.err.println("Invalid nums"); return indeces;}
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] + nums[j] == target && i != j) {
                    indeces[0] = j;
                    indeces[1] = i;
                    break;
                }
            }
        }
        return indeces;
    }
}
