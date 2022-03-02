package LikedLists;

public class Single {

    Node root;
    public int last;
    private int lenght;

    public Single() {
        this.root = null;
        this.lenght = 0;
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

    private Node insertElement(Node root, int element) {
        Node aux = root;
        if (aux == null) {
            this.lenght++;
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

    public int getFirt() {
        return  this.root != null ? this.root.element  : -1;
    }

    public int getLast() {
        return this.last;
    }
    public int lenght() {
        return this.lenght;
    }
}
