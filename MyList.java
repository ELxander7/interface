package ru.itis.inf304.interfaces;

public interface MyList {

    void input(int data);

    void swap(Node e1, Node e2);

    Node findPrev(Node t);

    void sort();

    void PrintList();

    void addAtIndex(int index, int data);

    Node removeElem(int index_del);


}