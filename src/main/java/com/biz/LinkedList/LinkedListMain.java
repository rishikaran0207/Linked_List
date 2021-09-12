package com.biz.LinkedList;
import java.util.Scanner;


public class LinkedListMain {
    public static int search,addnode,afternode;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter \n 1 to add element at the start \n " +
                "2 to append an element " +
                "\n 3 to insert an element" +
                " \n 4 to pop an first element" +
                " \n 5 to pop an last element" +
                "\n 6 to search an element"+
                "\n 7 to insert an element after specific node"+
                "\n choice: ");
        switch (sc.nextInt()) {
            case 1:
                Operations.addoperation();
                break;

            case 2:
                Operations.appendoperation();
                break;

            case 3:
                Operations.insertoperation();
                break;
            case 4:
                Operations.popfirstoperation();
                break;
            case 5:
                Operations.poplastoperation();
                break;
            case 6:
                System.out.print("\n Enter the value to find:");
                search=sc.nextInt();
                Operations.searchelement();
                break;
            case 7:
                System.out.print("\n Enter the value to add:");
                addnode=sc.nextInt();
                System.out.print("\n Enter the node where to add after that:");
                afternode=sc.nextInt();
                Operations.insertatspecificplace();
                break;
        }
    }
}