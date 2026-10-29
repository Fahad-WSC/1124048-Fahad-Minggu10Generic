package pbo.model;

import java.util.ArrayList;
import java.util.List;

public class BelajarPboList<T> extends ArrayList<T> {

    public void printList() {
        for (T item : this) {
            System.out.println(item);
        }
    }

    public void printListSorted() {
        List<T> sortedList = new ArrayList<>(this);
        sortedList.sort((a, b) -> {
            if (a instanceof Comparable && b instanceof Comparable) {
                return ((Comparable) a).compareTo(b);
            }
            return 0;
        });
        
        for (T item : sortedList) {
            System.out.println(item);
        }
    }
}