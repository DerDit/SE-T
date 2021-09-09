package entity;

import  java.util.Scanner;

public class scanner {
    public static void main(String[] args) {

       Scanner input = new Scanner(System.in);
       System.out.print("Add review:");

       String value =input.nextLine();
       System.out.println("Review is: " + value);

       input.close();
    }

}
