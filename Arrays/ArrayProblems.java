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

    public double avarageValue(int... array) {
        if (array.length < 1)
            return array.length;
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum / array.length;
    }

    public boolean contains(int value, int... array) {
        if (array.length < 1)
            return false;
        else
            for (int i : array) {
                if (value == i)
                    return true;
            }
        return false;
    }

    public int indexOf(int value, int ...array){
        for (int i = 0; i < array.length; i++) {
            if(array[i] == value) return i;
        }
        return -1;
    }

    public boolean removeValueAtIndex(int index,int ... array)
    {
        if (index < 0 || index > array.length) return false;
        for (int i = index ; i < array.length; i++) {
            if((i+1) < array.length)
            array[i] = array[i + 1];
            else
            array[i] = 0; 
        }   
        return true;
    }
}
