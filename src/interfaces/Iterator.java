package interfaces;

public interface Iterator<T> {

    /**
     * Getting next element of provided object
     *
     * @return template object
     */
    T next();

    /**
     * Checking if iterable has next element
     *
     * @return boolean value (true | false)
     */
    boolean hasNext();

}
