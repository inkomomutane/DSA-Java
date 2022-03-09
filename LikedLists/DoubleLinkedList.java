package LikedLists;

public class DoubleLinkedList {

    Node head;
    DoubleLinkedList(){
        this.head = null;
    }

    /**
     * InnerDoubleLinkedList
     */
    public class Node {
        int element;
        Node prev;
        Node next;
        Node(int element){
            this.element = element;
            this.next = null;
            this.prev = null;
        }
    }

    public void insertHead(int element) {
        Node aux = new Node(element);
        this.head = aux;
    }


}
