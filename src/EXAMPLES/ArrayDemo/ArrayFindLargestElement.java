package EXAMPLES.ArrayDemo;

public class ArrayFindLargestElement {
    public static void main(String[] args) {
        double[] myList = {0, 2.2, 3.3, 7, 4, 8, 9, -19.7};
        double biggestSoFar = myList[0];
        for(double currentNumber : myList){
            //System.out.println(currentNumber);
            if(currentNumber > biggestSoFar){
                biggestSoFar = currentNumber;
            }
        }
        System.out.println("The biggest number is " + biggestSoFar);



        String[] names = {"Steve", "Thomas", "Rabia", "George"};
        System.out.println(names.length);

        //for loop for lists / array / arraylist /collections

        for(int x = 0; x < names.length; x++){
            System.out.println(names[x]);
        }
        System.out.println("loop ended");

        for(String name : names){
            System.out.println(name);
        }
        System.out.println("loop ended");
    }
}