package com.biz.LinkedList;

public class Operations {

    public static LinkedList addoperation() {
        LinkedList linkedlist =new LinkedList();
        linkedlist.push(70);
        linkedlist.push(30);
        linkedlist.push(56);

        linkedlist.display();
        return linkedlist;

    }
    public static void appendoperation() {
        LinkedList linkedlist =new LinkedList();

        linkedlist.append(56);
        linkedlist.append(30);
        linkedlist.append(70);
        linkedlist.display();
    }
    public static void insertoperation() {
        LinkedList linkedlist = new LinkedList();
        linkedlist.push(70);
        linkedlist.push(56);
        linkedlist.display();
        linkedlist.insert(56, 30);
        linkedlist.display();
    }
    public static void popfirstoperation() {
        LinkedList linkedlist = addoperation();
        linkedlist.popfirst();
        linkedlist.display();
    }
    public static void poplastoperation() {
        LinkedList linkedlist =addoperation();
        linkedlist.poplast();
        linkedlist.display();
    }
}

