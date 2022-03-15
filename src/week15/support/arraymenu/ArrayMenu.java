package week15.support.arraymenu;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayMenu {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //int[] intArray = new int[0];


        while(true){
            System.out.println("a)\tAccept elements of an array from the user");
            System.out.println("b)\tDisplay elements of the array");
            System.out.println("c)\tSearch an element given by the user within that array");
            System.out.println("d)\tSort the array using the bubble sort method.");
            System.out.println("Enter a menu option (a, b, c or d)");
            String input = scanner.nextLine();

            switch (input){
                case "a":
                    System.out.println("Please enter your list of ints separated by a ', (comer)' and press enter to continue");
                    //1,2,3,4,5,6
                    String arrayInput = scanner.nextLine();

                    String[] strArray = arrayInput.split(",");

                    break;

                case "b":
                    System.out.println("Display elements of the array");
                    
                    break;

                case "c":
                    System.out.println("Search an element given by the user within that array");

                    break;

                case "d":
                    System.out.println("Sort the array using the bubble sort method");
                    break;
            }
        }
    }
}
