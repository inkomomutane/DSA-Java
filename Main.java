

public class Main {

    public static void main(String[] args) {
        /*Dsa<String> data = new SingleLinkedList<String>();*/

        Dsa<String> strings = new SingleLinkedList<>();
        strings.add("element0");
        strings.add("element1");
        strings.add("element2");
        strings.add("element3");
        strings.add("element4");

        strings.removeByIndex(0);
        System.out.println(strings);
        //Pessoa teste = new Pessoa();
       // teste.serialNumer();
        /*String[] ds ={"a","b","c"};

        data.addAll(ds);
        data.removeByIndex(2);

        String[] numbers = data.toArray();
        for (int i = 0; i < numbers .length; i++) {
            System.out.println(numbers[i]);
        }
        System.out.println(data.toArray().length);
    */}

    /**
     * 
     *  void deleteNode(int key)
    {
        // Store head node
        Node temp = head, prev = null;
 
        // If head node itself holds the key to be deleted
        if (temp != null && temp.data == key) {
            head = temp.next; // Changed head
            return;
        }
 
        // Search for the key to be deleted, keep track of
        // the previous node as we need to change temp.next
        while (temp != null && temp.data != key) {
            prev = temp;
            temp = temp.next;
        }
 
        // If key was not present in linked list
        if (temp == null)
            return;
 
        // Unlink the node from linked list
        prev.next = temp.next;
    }
     */
}