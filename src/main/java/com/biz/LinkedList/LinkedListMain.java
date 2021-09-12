package com.biz.LinkedList;
import java.util.Scanner;

public class LinkedListMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter \n 1 to add element at the start \n " +
                "2 to append an element " +
                "\n choice: ");

        switch (sc.nextInt()) {
            case 1:
                Operations.addoperation();
                break;

            case 2:
                Operations.appendoperation();
                break;
        }
    }
}