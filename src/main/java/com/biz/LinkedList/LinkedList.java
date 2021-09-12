package com.biz.LinkedList;

public class LinkedList {

    Node head;
    Node tail;

    public Node push(int data) {
        Node newnode = new Node(data);

        if (head == null) {
            head = newnode;
            tail = newnode;
        } else {
            Node tempNode = head;
            this.head = newnode;
            newnode.next = tempNode;
        }
        return newnode;
    }
    public void append(int data) {
        Node newnode=new Node(data);
        if (head == null) {
            head = newnode;
            tail = newnode;
        } else {
            Node tempNode=tail;
            this.tail=newnode;
            tempNode.next=tail;
        }
    }


    public void display(){
        if (head == null) {
            System.out.println("Linked list is Empty");
            return;
        } else {
            Node tempNode = head;
            System.out.println("\n");
            while (tempNode != null) {
                if(tempNode.next!=null) {
                    System.out.print(tempNode.data + "->");
                    tempNode = tempNode.next;
                }
                else {
                    System.out.print(tempNode.data);
                    tempNode=tempNode.next;
                }
            }
        }

    }
}