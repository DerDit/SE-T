package entity;

import  java.util.Scanner;

public class Scanner1 {
    public static void main(String[] args) {

       //Scanner aanmaken
       java.util.Scanner input = new java.util.Scanner(System.in);

       //tekst bij de scanner
       System.out.print("Add review:");

       //input van de scanner
       String value =input.nextLine();

       //output van de scanner
       System.out.println("Review is: " + value);

       //scanner 2.0 toevoegen
        java.util.Scanner input2 = new java.util.Scanner(System.in);
        System.out.print("Add dj:");

        String value2 =input2.nextLine();
        System.out.println("dj heet: " + value2);

        //afsluiten van de input
        input.close();
    }
}
