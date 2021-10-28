import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class SingleLinkedList<E> implements Dsa<E> {

    private Struct<E> _list;
    private E _last;

    SingleLinkedList() {
        _list = null;
        _last = null;

    }

    public class Struct<T> {
        T element;
        Struct<T> next;
        Struct(T element) {
            this.element = element;
            this.next = null;
        }

        @Override
        public String toString() {
            return this.element.toString() + (this.next != null ? ", " + this.next.toString() : "");
        }
    }

    @Override
    public String toString() {
        return this.isNotEmpty() ? "[" + this._list.toString() + "]" : "[]";
    }

    private Struct<E> addIntoList(E element, Struct<E> list) {
        if (list == null) {
            return new Struct<E>(element);
        } else {
            list.next = addIntoList(element, list.next);
            return list;
        }
    }

    @Override
    public boolean add(E element) {
        try {
            this._list = addIntoList(element, this._list);
            this._last = element;
            return true;
        } catch (Exception e) {
            // throw e;
            return false;
        }

    }

    @Override
    public boolean addAll(E[] elements) {
        try {
            for (E e : elements) {
                add(e);
            }
            return true;
        } catch (Exception e) {        
            return false;
        }
    }

    @Override
    public int size() {
        Struct<E> aux = this._list;
        int i = 0;
        while (aux != null) {
            i++;
            aux = aux.next;
        }
        return i;
    }

    @Override
    public boolean isEmpty() {
        return this._list == null;
    }

    @Override
    public boolean isNotEmpty() {
        return this._list != null;
    }

    @Override
    public boolean clear() {
        this._list = null;
        this._last  = null;
        return true;
    }

    @Override
    public E getByIndex(int index) {
        Struct<E> aux = this._list;
        int i = 0;
        while (aux != null) {
            if(i == index) return aux.element;
            aux = aux.next; i++;
        }
       
        return null;
    }

    @Override
    public E getFirst() {
        return this.isNotEmpty()? this._list.element : null;
    }

    @Override
    public E getLast() {
        return this._last;
    }

    @Override
    public boolean removeByIndex(int index) { 
        Struct<E> aux = this._list; int i = 0;
        boolean test = false;
        while (aux != null && i <= index ) {
            if (aux.next == null  && i == index) {
                aux = null;
                test = true;
            }else if(index == i){
                aux.element = aux.next.element;
                aux.next = aux.next.next;
                test = true;
            }else if(aux!=null)
         aux = aux.next;   
        }
        return test;
    }

    @Override
    public boolean removeAllByIndex(int... indexes) {

        return false;
    }

    @Override
    public boolean retainAllByIndex(int... indexes) {

        return false;
    }

    @Override
    public E[] toArray() {
        Struct<E> aux = this._list;
        int i = 0;
        if (this.isEmpty()) {
            return null;
        } else {
            E[] result = (E[]) Array.newInstance(aux.element.getClass(), this.size());
            while (aux != null) {
                result[i] = aux.element;
                i++;
                aux = aux.next;
            }
            return result;
        }
    }

    @Override
    public boolean contains(E element) {
        Struct<E> aux = this._list;
        while (aux != null) {
            if (element.equals(aux.element))
                return true;
            aux = aux.next;
        }
        return false;
    }

    @Override
    public boolean containsAll(E[] elements) {
        for (int i = 0; i < elements.length; i++) {
            if (this.contains(elements[i]))
                return false;
        }
        return true;
    }

    @Override
    public E[] where(Predicate<E> element) {

        Struct<E> aux = this._list;
        int i = 0;
        if (this.isEmpty()) {
            return null;
        } else {
            E[] result = (E[]) Array.newInstance(aux.element.getClass(), this.size());
            while (aux != null) {
                if (element.test(aux.element)) {
                    result[i] = aux.element;
                    i++;
                }
                aux = aux.next;
            }
            return result = Arrays.copyOf(result, i);
        }
    }

    @Override
    public List<E> toList() {

        List<E> temp = new ArrayList<>();
        return null;
    }

    @Override
    public Dsa<E> toStream() {
        return null;
    }

}
