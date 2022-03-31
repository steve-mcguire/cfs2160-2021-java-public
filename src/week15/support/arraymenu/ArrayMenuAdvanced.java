package week15.support.arraymenu;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayMenuAdvanced {
    private ArrayList<Object> objects;
    private Scanner scanner;

    public ArrayMenuAdvanced() {
        this.objects = new ArrayList<>();
        this.scanner = new Scanner(System.in);
    }

    public String getMenu(){
        return """
                a)\tAccept elements of an array from the user
                b)\tDisplay elements of the array
                c)\tSearch an element given by the user within that array
                d)\tSort the array using the bubble sort method.
                
                Enter a menu option (a, b, c or d)""";
    }

    public String getUserInput(){
        return scanner.next();
    }

    public void checkMenuChoice(String menuChoice){
        switch (menuChoice){
            case "a":
                System.out.println("a");
                break;
            case "b":
                System.out.println("b");
                break;
            case "c":
                System.out.println("c");
                break;
            case "d":
                System.out.println("d");
                break;
            default:
                System.out.println("ERROR!");
                break;
        }
    }

    public void addElements(){

    }

    public void getElements(){

    }

    public void searchElement(String e){

    }

    public void addElement(Object o){
        this.objects.add(o);
    }
}
