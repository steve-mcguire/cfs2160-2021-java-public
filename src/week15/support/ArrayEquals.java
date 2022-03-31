package week15.support;

import java.util.Arrays;

public class ArrayEquals {

    public static void main(String[] args) {
        int[] ary1 = {1,2,3,4,5,6};
        int[] ary2 = {1,2,3,4,5,6};
        int[] ary3 = {1,2,3,4};

        boolean isEqual = false;
        for(int x = 0; x < ary1.length; x++){

            try{
                //System.out.println(x + " X");
                //System.out.println(ary1[x] + "A1");
                //System.out.println(ary3[x] + "A2");
                if(ary1[x] == ary2[x]){
                    isEqual = true;
                }
                else{
                    isEqual = false;
                    break;
                }
            }catch(ArrayIndexOutOfBoundsException ai){
                System.out.println(ai.getMessage());
                isEqual = false;
                break;
            }
        }

        System.out.println(Arrays.equals(ary1, ary2));

        System.out.println(isEqual);
    }
}
