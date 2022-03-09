
// import Arrays.ArrayProblems;
import LikedLists.Single;
// import Recursive.Recursive;

/**
 * @author Nelson Alexandre Mutane
 * 
 */

public class Main {
    public static void main(String[] args) {

        Single lists = new Single();


        lists.insert(1);
        lists.insert(2);
        lists.insertHead(0);
        lists.insertHead(5);
        lists.insertHead(15);
        lists.insertHead(55);
        lists.insertAt(6, 150);
        lists.insertAt(7, 1501);
        // lists.deleteAt(6);
        // lists.deleteAt(5);
        //lists.insertAt(7, 155);


        //lists.delete(150);


        // lists.insert(3);

        // lists.insert(4);
        // lists.insert(5);
        // lists.insert(6);
        // lists.insert(7);
        // lists.insert(8);
        // lists.insert(9);

        System.out.println(lists.toString());
        System.out.println(lists.length());
        // lists.delete(9);
        // System.out.println(lists.toString());
        // System.out.println(lists.length());
        // System.out.println(lists.length());
        // System.out.println(lists.getFirst());
        // System.out.println(lists.getLast());
        // System.out.println(lists.getClass());
        
    }
}
