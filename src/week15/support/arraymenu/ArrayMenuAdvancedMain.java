package week15.support.arraymenu;

import java.util.Locale;

public class ArrayMenuAdvancedMain {
    public static void main(String[] args) {
        ArrayMenuAdvanced ama = new ArrayMenuAdvanced();
        //get the

        while(true){
            System.out.println(ama.getMenu());
            String input = ama.getUserInput().toLowerCase();
            if(input.equalsIgnoreCase("end")){
                break;
            }else{
                ama.checkMenuChoice(input);
            }
        }


    }
}
