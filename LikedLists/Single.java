
/**
 * @author Nelson Alexandre Mutane
 * 
 */
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
    public class Node {
        int element;
        Node next = null;

        Node(int element) {
            this.element = element;
        }

        @Override
        public String toString() {
            return "" + this.element;
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
        if (index > this.length || index < 0)  {System.err.println("Length is less than index or index is invalid.");  return; }
        if (index == 0) {this.insertHead(element); return;}
        if (index == this.length()) {insert(element); return;} 
        Node aux = this.root;
        for (int i = 0; i < index - 1; aux = aux.next,i++) ;
        Node newNode  = new Node(element);
        newNode.next = aux.next;
        aux.next = newNode;
        this.length++;
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

    public void deleteAt(int index) {
        if(index < 0 || index > this.length ){System.out.println("Index not found."); return;}
        if (index == 0) {this.root = this.root.next;}
        Node aux = this.root;
        for (int i = 1; i  < index - 1 ; i++) {
            aux=aux.next;
        }
        
        aux.next = 
        aux.next.next;
    }

}
