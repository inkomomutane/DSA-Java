
/**
 * @author Nelson Alexandre Mutane
 * 
 */
package LikedLists;

public class DoubleLinkedList {

    public Node head;
    private int length;

    public DoubleLinkedList() {
        this.head = null;
    }

    /**
     * InnerDoubleLinkedList
     */
    public class Node {
        public int element;
        public Node prev;
        public Node next;

        public Node(int element) {
            this.element = element;
            this.next = null;
            this.prev = null;
        }

        @Override
        public String toString() {
            return "" + this.element;
        }
    }

    public void insertHead(int element) {
        if (this.head == null) {
            this.head = new Node(element);
            this.length++;
            return;
        }
        Node aux = this.head;
        Node newNode = new Node(element);
        aux.prev = newNode;
        newNode.next = aux;
        this.head = newNode;
    }

    public void insertEnd(int element) {
        if (this.head == null) {
            insertHead(element);
            return;
        }
        Node aux;
        for (aux = this.head; aux.next != null; aux = aux.next)
            ;
        Node newNode = new Node(element);
        aux.next = newNode;
        newNode.prev = aux;
        this.length++;
    }

    public void insertAt(int index, int element) {
        if (this.length < index || index < 0) {
            System.out.println("Index invalid");
            return;
        }
        if (this.head == null || index == 0) {
            insertHead(element);
            return;
        }
        Node aux;
        int i;
        for (aux = this.head, i = 0; i < index - 1; aux = aux.next, i++)
            ;
        Node newNode = new Node(element);
        newNode.next = aux.next;
        newNode.prev = aux;
        aux.next = newNode;
        this.length++;
    }

    public void updateAt(int index, int element) {
        if (this.length <= index || index < 0) {
            System.out.println("Index invalid");
            return;
        }
        Node aux;
        int i;
        for (aux = this.head, i = 0; i < index; aux = aux.next, i++)
            ;
        aux.element = element;

    }

    @Override
    public String toString() {
        String toString = "";
        for (Node aux = this.head; aux != null; aux = aux.next) {
            toString += aux.element + ",";
        }
        return toString;
    }

    public int getLenght() {
        return this.length;
    }

    public void deleteAt(int index) {
        if (this.length <= index || index < 0 || this.head == null) {
            System.out.println("Index invalid");
            return;
        }
        if (index == 0) {
            this.head = this.head.next;
            this.length--;
            return;
        }

        Node aux;
        int i;
        for (aux = this.head, i = 0; i < index - 1; aux = aux.next, i++)
            ;
        Node oldNode = aux.next;
        aux.next = oldNode.next;
        if (oldNode.next != null) {
            oldNode.next.prev = aux;
        }
        this.length--;
    }

    public int[] toArray(){
        int[] array = new int[this.length];
        int i =0;
        for (Node aux = this.head; aux != null; aux = aux.next,i++) {
            array[i] = aux.element;
        }
        return array;
    }
}
