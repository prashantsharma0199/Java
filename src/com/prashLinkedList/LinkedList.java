package com.prashLinkedList;

public class LinkedList {
    public static void main(String[] args) {
        LL list= new LL();

        list.insertLast(3);
        list.insertLast(5);
        list.insertLast(9);
        list.insertLast(8);
        list.insertLast(12);
        list.insertFirst(10);

        list.display();

        list.insert(17,3);
        list.display();

        System.out.println(list.delete(4));
        list.display();
    }
}
