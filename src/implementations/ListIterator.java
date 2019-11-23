package implementations;

import interfaces.Iterator;

import java.util.List;
import java.util.NoSuchElementException;

public class ListIterator<T> implements Iterator<T> {

    private List<T> list;
    private int counter = 0;

    public ListIterator(List<T> list) {
        this.list = list;
    }

    @Override
    public T next()
    {
        if (!hasNext()) {
            throw new NoSuchElementException("No more items in list.");
        }
        T item = list.get(counter);
        counter++;
        return item;
    }

    @Override
    public boolean hasNext() {
        return list.size() > counter;
    }
}
