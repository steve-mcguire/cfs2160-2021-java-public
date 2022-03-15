package arraydemo;

public class ArrayFindLargestElement {
    public static void main(String[] args) {
        double[] myList = {0, 2.2, 3.3, 7, 4, 8, 9, -19.7};
        double biggestSoFar = 0;
        for(double currentNumber : myList){
            //System.out.println(currentNumber);
            if(currentNumber > biggestSoFar){
                biggestSoFar = currentNumber;
            }
        }
        System.out.println("The biggest number is " + biggestSoFar);


        System.out.println("IGNORE FROM EHRE");
        String[] names = {"Steve", "Thomas", "Rabia", "George"};
        System.out.println(names.length);

        //for loop for lists / array / arraylist /collectiosn

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
