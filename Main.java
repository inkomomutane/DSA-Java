

import Arrays.LetcodeProblems.p3.Solution3;

// import LikedLists.*;

/**
 * @author Nelson Alexandre Mutane
 * 
 */

public class Main {
    public static void main(String[] args) {

        // DoubleLinkedList lists = new DoubleLinkedList();
        // lists.insertEnd(15);
        // lists.insertEnd(154);
        // lists.insertEnd(155);
        // lists.insertAt(3,1545);
        // System.out.println(lists.toString());
        // System.out.println(lists.getLenght());
        // lists.deleteAt(0);
        // lists.deleteAt(0);
        // lists.deleteAt(0);
        // lists.deleteAt(0);
        // lists.insertEnd(155);
        // lists.insertEnd(155);
        // lists.insertEnd(155);
        // lists.insertEnd(155);

        // lists.updateAt(4, 4);
        // System.out.println(lists.getLenght());
        // System.out.println(lists.toString());

        // Solution3 s3 = new Solution3();

         int ar[] = {0,2,1,5,3,4};



            
         
         

        //  int ans[] = new int[ar.length];

        //  for (int i = 0; i < ar.length; i++) {
        //      ans[i] = ar[ar[i]];
        //  }

        //  for (int i : ans) {
        //      System.out.println(ans[i]);
        //  }
 
        // // System.out.println(s3.removeElement(ar, 3));
        // 1,2 ,3 ,4,5 ,6,7, 8,9,10
            sum(1,2,3,4);
    }


    public static void sum(int ...nums) {
        int sum =0;
        int[] ans = new int[nums.length];
        for(int i = 0 ; i < nums.length; i++){
            sum += nums[i];
            ans[i] = sum;
            System.out.print("," + ans[i]);
        }
    }
}
