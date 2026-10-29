package pbo.view;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PrintUtil {

    public static void printList(List<?> list) {
        for (Object item : list) {
            System.out.println(item);
        }
    }

    public static <T> void printList(T[] array) {
        for (T item : array) {
            System.out.println(item);
        }
    }

    public static <T extends Printable> void printPrintableList(List<T> list) {
        for (T item : list) {
            System.out.println(item.getPrintDetail());
        }
    }

    public static <T extends Comparable<T>> void printListSorted(List<T> list) {
        List<T> sortedList = new ArrayList<>(list);
        Collections.sort(sortedList);
        for (T item : sortedList) {
            System.out.println(item);
        }
    }

    public static <T extends Comparable<T>> void printListSorted(T[] array) {
        T[] sortedArray = array.clone();
        java.util.Arrays.sort(sortedArray);
        for (T item : sortedArray) {
            System.out.println(item);
        }
    }
}