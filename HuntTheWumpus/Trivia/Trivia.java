// Kjell Tingelstad
// 2/16/24
// Period 5
// Hunt the Wumpus - Trivia Class

package HuntTheWumpus.Trivia;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;
import java.util.ArrayList;

public class Trivia{
    //////////////////////
    // Properties & Fields
    //////////////////////
    private File file;
    private String[][] questions;
    private static final int C = 4;
    private static final int R = 4;

    /////////////////////
    // Constructor(s)
    /////////////////////

    public Trivia(){
        this.file = new File("C:\\Git-P5 smiley face\\Hunt-The-Wumpus\\HuntTheWumpus\\Trivia\\Questions.csv");
        this.questions = new String[C][R];
    }

    ///////////////////////
    // Methods
    //////////////////////

    public void getQuestions(){
        /*Read the questions csv */
        /*put each line of the csv into a new array inside of the questions[][] array */
    }

    public int askQuestion(int numOfQuestions){
        int numOfCorrect = 0;
        String active = "";
        Scanner s = new Scanner(System.in);
        for(int r = 0; r < R; r++){
            active = questions[r][0];
            System.out.println(active);
            String userAns = s.nextLine();
            if(userAns.equals(questions[r][3])){
                numOfCorrect++;
                System.out.println("That is correct");
            }
        }



    return numOfCorrect;
    /* 
        int numOfCorrect = 0;
        for(int i = 0; i < numOfQuestions; i++){
            System.out.println(this.question[0]);
            Scanner s = new Scanner(System.in);
            String userAns = s.nextLine();
            if(userAns.equals(this.question[2])){
                numOfCorrect++;
                System.out.println("Yay, you are correct, you have gotten " + numOfCorrect + "/" + numOfQuestions);
            } else {
                System.out.println("Better luck next time, you have gotten " + numOfCorrect + "/" + numOfQuestions);
            }
        }
        return numOfCorrect;
    */
    }
     
}