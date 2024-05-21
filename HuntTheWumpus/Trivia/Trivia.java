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
        getQuestions();
    }

    ///////////////////////
    // Methods
    //////////////////////

    public void getQuestions(){
        ArrayList<String[]> lines = new ArrayList<>();
        try{
            Scanner s = new Scanner(this.file);
            while(s.hasNextLine()){
                String line = s.nextLine();
                String[] parts = line.split(",");
                lines.add(parts);
            }
        } catch(FileNotFoundException e){
            System.out.println("File not found");
        }

        String[][] questionList = new String[lines.size()][];
        for(int i = 0; i < lines.size(); i++){
            questions[i] = lines.get(i);
        }
        /*Need to shuffle the order of the list*/
        this.questions = questionList;
    }

    public boolean askQuestions(int numOfQuestions, int needCorrect){
        int numOfCorrect = 0;
        String active = "";
        Scanner s = new Scanner(System.in);
        for(int r = 0; r < numOfQuestions; r++){
            active = this.questions[r][0];
            System.out.println(active);
            String userAns = s.nextLine();
            if(userAns.equals(this.questions[r][3])){
                numOfCorrect++;
                System.out.println("That is correct");
            }
            /*Need to remove the questions that were asked to prevent them from being asked again */
        }

        return numOfCorrect >= needCorrect;
    }
     
}