package week13;

import java.util.*;

public class RockPaperScissors {
    private Map<Integer, String> options = new HashMap<>();
    private Map<Integer, String> results = new HashMap<>();
    private Random rand = new Random();
    //get the user input, rock, paper, scissors
    //get the ai input
    //        //how do we represent the inputs meaningfully?
    //        //1 = rock
    //        //2 = paper
    //        //3 = scissors

    public RockPaperScissors(){
        options.put(0, "Rock");
        options.put(1, "Paper");
        options.put(2, "Scissors");

        results.put(-2, "Human Wins");
        results.put(-1, "AI Wins");
        results.put(0, "Draw");
        results.put(1, "AI Wins");
        results.put(2, "Human Wins");
    }

    public int getUserInput(String userInput) throws Exception {
        //check to see if the user input is in the Map
        if(options.containsValue(userInput)){
            //loop the Map entry items until a key is found
            for (Map.Entry<Integer, String> entry : options.entrySet()) {
                if (entry.getValue().equals(userInput)) {
                    //return found key for given value
                    return entry.getKey();
                }
            }
        }
        //if nothing found
        throw new Exception("Input not valid");
    }

    public String getResult(int u, int a) throws Exception {
        //calculate the difference between the scores
        int diff = a - u;
        //check to see if Map contains the key
        if(results.containsKey(diff)){
            //return value of given key
            return results.get(diff);
        }
        //if key not found
        throw new Exception("Result Not Found");
    }

    public String getAIValue(int aiInput) throws Exception {
        //check if ai key is in Map, should always be as we set the bound of random to 3
        if(options.containsKey(aiInput)){
            //return value for given key
            return options.get(aiInput);
        }
        throw new Exception("AI Input Not Recognised");
    }

    public int getAiInput(){
        return rand.nextInt(3);
    }

    public static void main(String[] args)  {
        RockPaperScissors rps = new RockPaperScissors();
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("Please enter 'Rock', 'Paper' or 'Scissors'" +
                    "\nType 'END' to finish the game");

            String userInput = scanner.nextLine();
            if(userInput.toLowerCase().equals("end")){
                break;
            }else{
                try {
                    int userValue = rps.getUserInput(userInput);
                    int aiValue = rps.getAiInput();
                    System.out.println("AI played " + rps.getAIValue(aiValue));
                    String result = rps.getResult(userValue, aiValue);
                    System.out.println(result);
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }
}