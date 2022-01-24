package week13;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissor2 {

    public int getUserChoice(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter Rock, Paper or Scissors");
        String answer = scanner.nextLine();
        if(answer.equals("Rock")){
            return 0;
        }else if(answer.equals("Paper")){
            return 1;
        }else if(answer.equals("Scissors")){
            return 2;
        }else{
            return -1;
        }
    }

    public int getAIChoice(){
        Random rand = new Random();
        int result = rand.nextInt(3);
        return result;
    }

    public void printResult(int u, int a){
        if(u == a){
            System.out.println("its a tie");
        }else if(u == 0 && a == 1){
            System.out.println("AI Wins");
        }else if (u == 0 && a == 2){
            System.out.println("Human Wins");
        }else if (u == 1 && a == 0){
            System.out.println("Human Wins");
        }else if (u == 1 && a == 2){
            System.out.println("AI Wins");
        }
        System.out.println("Winner is...");
    }

    public static void main(String[] args) {
        RockPaperScissor2 rps = new RockPaperScissor2();
        int u = rps.getUserChoice();
        int a = rps.getAIChoice();
        rps.printResult(u, a);
    }
}
