package com.biz.LinkedList;
import java.util.Scanner;

public class LinkedListMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter \n 1 to add element at the start \n " +
                "2 to append an element " +
                "\n 3 to insert an element" +
                " \n 4 to pop an first element" +
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
        }
    }
}