package week10;

public class SmallestLargestWord {

    public static void main(String[] args) {
        String longest = "", shortest = "";
        String string = "Hardships often prepare ordinary people for an extraordinary destiny";
        for(String word : string.split(" ")){
            System.out.println(word);
            if(word.length() > longest.length()){
                longest = word;
            }else if (word.length() < shortest.length() || shortest.equals("")){
                shortest = word;
            }
        }
        System.out.println("Longest: " + longest + ", shortest: " + shortest);
    }
}
