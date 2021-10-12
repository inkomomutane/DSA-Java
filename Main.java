

public class Main {

    public static void main(String[] args) {
        Dsa<String> data = new SingleLinkedList<String>();
        String[] ds ={"a","b","c"};
        
        data.addAll(ds);
        data.removeByIndex(2);

        String[] numbers = data.toArray();
        for (int i = 0; i < numbers .length; i++) {
            System.out.println(numbers[i]);
        }
        System.out.println(data.toArray().length);
    }
}