package part1;

import java.util.Iterator;

public class GenericList<T> implements Iterable<T> {
    private T[] items = (T[]) new Object[10];
    private int count;

    public void add(T item) {
        items[count] = item;
        count++;
    }

    public T get(Integer index) {
        return items[index];
    }

    public int getSize() {
        return count;
    }

    @Override
    public Iterator<T> iterator() {
        return new ListInterator(this);
    }

    private class ListInterator implements Iterator<T> {
        private GenericList<T> listIterable;
        private Integer index = 0;

        public ListInterator(GenericList<T> listIterable) {
            this.listIterable = listIterable;
        }

        @Override
        public boolean hasNext() {
            return (index < listIterable.count);
        }

        @Override
        public T next() {
            return listIterable.items[index++];
        }
    }
}
