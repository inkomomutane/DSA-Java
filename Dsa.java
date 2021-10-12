
/**
 * @package Data Structures and Algoritms 
 * @author Nelson Alexandre Mutane
 * @version 1.0.0
 * @created 12-10-2021 at 11:33:59
 * 
 */


public abstract interface Dsa<E> {

    /**
     * Add element to collection
     * @param element
     * @return true|false
     */
    public abstract boolean add(E element);



    /**
     * Add Array of elements to collection
     * @param elements
     * @return true|false
     */
    public abstract boolean  addAll(E[] elements);

    /**
     * return size of collection
     * @return 
     */
    public abstract int size();

    public abstract boolean isEmpty();

    public abstract boolean isNotEmpty();

    public abstract boolean clear();

    @Override
    public abstract String toString();

    /**
     * Get element from collection by index
     * @param index
     * @return Element
     */
     public abstract E  getByIndex(int index);

     /**
      * get First element from collection or return (NULL)
      * @return
      */
     public abstract E getFirst();

     /**
      * return last element from collection or return (NULL)
      * @return
      */
     public abstract E getLast();

     /**
      * Remove element from collection by index
      * @param index
      * @return
      */
     public abstract boolean removeByIndex(int index);

     /**
      * remove Array of elements from collection by indexes
      * @param indexes
      * @return
      */
     public abstract boolean removeAllByIndex(int ...indexes);


     /**
      * retains collection of elements from Array of indexes
      * @param indexes
      * @return
      */
      public abstract boolean retainAllByIndex(int ...indexes);

    /**
     * Trasnform this collection to an Array of elements
     *  if this collections is null this Array will automaticly be null
     * @return [...]
     */
     public abstract E[] toArray();

     /**
      * Check if this element exists on collection
      * @param element
      * @return true|false
      */
     public abstract boolean contains(E element);

     /**
      * Check if all of elements are in the collection
      * @param elements
      * @return true|false
      */
     public abstract boolean containsAll(E[] elements);

     public abstract E[] where(java.util.function.Predicate<E> element);


}
