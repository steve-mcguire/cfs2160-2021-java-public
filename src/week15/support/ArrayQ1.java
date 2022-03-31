package week15.support;

public class ArrayQ1 {
    public static void main(String[] args) {
        double[] myList = {1.1, 2.2, 3.3, 8.8, 4.4, 5, 6.6, 9.9};
        //myList = [1.1, 2.2, 3.3, 4.4]
        double myLargestNumber = 0;

        for(int x = 0; x < myList.length; x++){
            if(myList[x] > myLargestNumber){
                System.out.println("updating largest with " + myList[x]);
                myLargestNumber = myList[x];
            }else{
                System.out.println(myList[x] + " is smaller");
            }
        }

        System.out.println(myLargestNumber + " is the largest");

        String[] hand = {"cA", "c2", "c3", "c4", "c5", "c6", "c7", "c8", "c9", "c10", "cJ", "cQ", "cK"};

        for(int c = 0; c < hand.length; c++){
            System.out.println(hand[c]);
            if(hand[c].equals("c8")){
                break;
            }
        }

        String[] cars = {"b", "g", "p", "g", "w", "r", "w"};

        for(String colour : cars){
            System.out.println("The car colour is " + colour);
            if(colour.equals("r")){
                System.out.println("go home");
                break;
            }
        }
    }
}