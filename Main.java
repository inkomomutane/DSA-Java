

import LikedLists.*;

/**
 * @author Nelson Alexandre Mutane
 * 
 */

public class Main {
    public static void main(String[] args) {

        DoubleLinkedList lists = new DoubleLinkedList();
        lists.insertEnd(15);
        lists.insertEnd(154);
        lists.insertEnd(155);
        lists.insertAt(3,1545);
        System.out.println(lists.toString());
        System.out.println(lists.getLenght());
        lists.deleteAt(0);
        lists.deleteAt(0);
        lists.deleteAt(0);
        lists.deleteAt(0);
        lists.insertEnd(155);
        lists.insertEnd(155);
        lists.insertEnd(155);
        lists.insertEnd(155);

        lists.updateAt(4, 4);
        System.out.println(lists.getLenght());
        System.out.println(lists.toString());
    }
}
