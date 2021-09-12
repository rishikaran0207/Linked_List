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
    public void insert(int firstnode,int data) {
        Node newnode =new Node(data);
        Node previousnode=new Node(firstnode);
        Node temp=head;
        while(temp.data != previousnode.data){
            temp=temp.next;
        }
        Node tempNode =temp.next;
        temp.next = newnode;
        newnode.next = tempNode;
    }
    public Node popfirst() {
        Node tempNode = head;
        head = tempNode.next;
        head.next = tempNode.next.next;
        return tempNode;
    }
    public void poplast() {
        Node tempNode = head;
        while(!tempNode.next.equals(tail)) {
            tempNode = tempNode.next;
        }
        this.tail = tempNode;
        tempNode.next = null;
    }
    public void searchelement(int value)
    {
        Node tempNode=head;
        int index=1;
        while(tempNode.data != value)
        {
            tempNode = tempNode.next;
            index++;
        }
        if(tempNode.data == value)
            System.out.println("\nthe searched data is "+value+" and its index is  "+index);
        else
            System.out.println("the searched data is not available");

    }
    public void delete(int delete){
        int size=0;
        Node temp = head;
        while (temp != null){
            temp = temp.next;
            size++;
        }
        temp=head;
        while(temp.next.data != delete){
            temp = temp.next;
        }
        System.out.println("\n Before deleting:");
        System.out.println("\nthe size of the list is "+size);
        display();
        System.out.println("\n");
        temp.next = temp.next.next;
        temp.next.next=null;
        temp = head;
        size=0;
        while (temp != null){
            temp = temp.next;
            size++;
        }
        System.out.println("\n After deleting:");
        System.out.println("\nthe size of the list is "+size);
        display();
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