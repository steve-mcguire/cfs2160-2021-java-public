package week10;

public class LargestSmallestWords {

    public static void main(String[] args) {
        String largest = "", smallest = "";

        String sentence ="These clauses remain law today, and provided the basis for important principles in English l" +
                "aw developed in the fourteenth through to the seventeenth century, and which were exported to America " +
                "and other English-speaking countries. Their phrasing, ‘to no one' and ‘no free man' gave these " +
                "provisions a universal quality that is still applicable today in a way that many of the clauses " +
                "relating specifically to feudal custom are not.";
        for(String word : sentence.split(" ")){
            if(word.length() > largest.length()){
                largest = word;
            }else if(word.length() < smallest.length() || smallest.equals("")){
                smallest = word;
            }
        }
        System.out.println("Largest words is : " + largest + ", and smallest word is: " + smallest);
    }
}