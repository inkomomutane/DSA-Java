package Arrays;

/**
 * @author Nelson Alexandre Mutane
 * @since Friday, February 25, 2022 4:07:38 PM
 */

public class ArrayProblems {
    public int[] sortArrayAsc(int... array) {
        if (array.length < 1)
            return array;
        else
            for (int i = 0; i < array.length; i++) {
                for (int j = i; j < array.length; j++) {
                    if (array[i] > array[j]) {
                        int aux = array[i];
                        array[i] = array[j];
                        array[j] = aux;
                    }
                }
            }
        return array;
    }

    public String[] sortArrayAsc(String... array) {
        if (array.length < 1)
            return array;
        else
            for (int i = 0; i < array.length; i++) {
                for (int j = i; j < array.length; j++) {
                    if (array[i].compareTo(array[j]) > 0) {
                        String aux = array[i];
                        array[i] = array[j];
                        array[j] = aux;
                    }
                }
            }
        return array;
    }
}
