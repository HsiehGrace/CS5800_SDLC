package Memento_Mediator;

import java.util.Iterator;

public interface IterableByUser {
    Iterator iterator (User userToSearchWith);
    boolean hasNext();
    Object next();
}

