package Sets;

import java.util.NoSuchElementException;

public class LLSIterator<E> implements MyIterator<E> {

    int pointer;
    LinkedListSet<E> list; 

    public LLSIterator(LinkedListSet<E> myList) {
        list = myList;
        pointer = 0;
    }

    @Override
    public boolean hasNext() {
        return pointer < list.size();
    }

    @Override
    public E next() {
        if (!hasNext()) {
            throw new NoSuchElementException("No more elements in list");
        }
        return list.getList().get(pointer++); 
    }

    @Override
    public void remove() {
        if (pointer == 0) {
            throw new IllegalStateException("Cannot remove before calling next()");
        }
        list.getList().remove(--pointer); 
    }
}
