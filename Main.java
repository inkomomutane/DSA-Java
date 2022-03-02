
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
        lists.insert(4);
        lists.insert(41);
        lists.insert(44);
        lists.insert(4);
        lists.insert(41);
        lists.insert(44);
        lists.insert(4);
        lists.insert(41);
        lists.insert(44);

        System.out.println(lists.toString());
        System.out.println(lists.lenght());
        System.out.println(lists.getFirt());
        System.out.println(lists.getLast());
        System.out.println(lists.getClass());
    }
}
