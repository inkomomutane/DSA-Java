package LikedLists;

public class Single {

    Node root;
    public int last;
    private int length;

    public Single() {
        this.root = null;
        this.length = 0;
    }

    /**
     * InnerSingle
     */
    protected class Node {
        int element;
        Node next = null;

        Node(int element) {
            this.element = element;
        }
    }

    public void insert(int element) {
        this.root = insertElement(root, element);
    }

    public void insertHead(int element) {
        Node newNode = new Node(element);
        newNode.next = this.root;
        this.root = newNode;
        this.length++;
    }

    public void insertAt(int index,int element) {
        if (index > this.length)  {System.err.println("Length is less than index.");  return; }
        if (index == 0) this.insertHead(element);

        int i = 0;
        for (Node aux = this.root; i < index - 1; aux =aux.next,i++) {
            if(aux == null){
                aux = new Node(element);this.length++;
            }else
            if(i == index - 1){
                Node newNode  = new Node(element);
                newNode.next = aux.next;
                aux.next = newNode;
                this.length++;
            }
        }
    }

    private Node insertElement(Node root, int element) {
        Node aux = root;
        if (aux == null) {
            this.length++;
            this.last = element;
            return root = new Node(element);
        }
        aux.next = insertElement(aux.next, element);
        return root = aux;
    }

    @Override
    public String toString() {
        String toString = "";
        for (Node aux = this.root; aux != null; aux = aux.next) {
            toString += aux.element + ",";
        }
        return toString;
    }

    public int getFirst() {
        return  this.root != null ? this.root.element  : -1;
    }

    public int getLast() {
        return this.last;
    }
    public int length() {
        return this.length;
    }
    public int[] toArray(){
        int[] array = new int[this.length];
        int i =0;
        for (Node aux = this.root; aux != null; aux = aux.next,i++) {
            array[i] = aux.element;
        }
        return array;
    }

    public int delete(int element){
        Node aux = this.root; if (this.root ==null) return 1;
       Node prev = aux;
        while (aux != null) {
            if(aux.element == element) {
                if (aux.next == null) {
                    prev = aux.next;
                    aux = aux.next;
                    this.length --;
                }else{
                    aux.element = aux.next.element;
                aux.next = aux.next.next;
                this.length--;
                prev = aux;
                aux = aux.next;
                }
            }else{
            prev = aux;
            aux = aux.next;}
        }
        return 1;
    }



}
