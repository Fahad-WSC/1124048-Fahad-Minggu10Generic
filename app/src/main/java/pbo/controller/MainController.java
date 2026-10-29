package pbo.controller;

import pbo.model.Box;
import pbo.model.BelajarPboList;

public class MainController {
    
    public void run() {
        BelajarPboList<Box<Integer>> myList = new BelajarPboList<>();
        myList.add(new Box<>(123));
        myList.add(new Box<>(45));
        myList.add(new Box<>(789));

        System.out.println("printList dari BelajarPboList");
        myList.printList();

        System.out.println("printListSorted dari BelajarPboList");
        myList.printListSorted();
        
        System.out.println("Memastikan list asli tidak ikut tersort");
        System.out.println("Elemen pertama asli: " + myList.get(0).get());
    }
}