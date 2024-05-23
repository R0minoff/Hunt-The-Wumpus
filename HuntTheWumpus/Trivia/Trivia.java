// Kjell Tingelstad
// 2/16/24
// Period 5
// Hunt the Wumpus - Trivia Class

package HuntTheWumpus.Trivia;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;

public class Trivia{
    //////////////////////
    // Properties & Fields
    //////////////////////
    private File file;
    public String[][] questions;
    private static final int C = 5; //Idk know how but it's backwards
    private static final int R = 4;

    /////////////////////
    // Constructor(s)
    /////////////////////

    public Trivia(){
        this.file = new File("C:\\Git-P5 smiley face\\Hunt-The-Wumpus\\HuntTheWumpus\\Trivia\\Questions.csv");
        this.questions = new String[C][R];
        getQuestions();
        System.out.println(askQuestions(5, 3));
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
            s.close();
        } catch(FileNotFoundException e){
            System.out.println("File not found");
        }
        Collections.shuffle(lines);
        for(int i = 0; i < lines.size(); i++){
            this.questions[i] = lines.get(i);
        }
    }

    public boolean askQuestions(int numOfQuestions, int needCorrect){
        int numOfCorrect = 0;
        String active = "";
        Scanner s = new Scanner(System.in);
        for(int r = 0; r < numOfQuestions; r++){
            active = this.questions[r][1];
            System.out.println(active);
            String userAns = s.nextLine();
            if(userAns.equalsIgnoreCase(this.questions[r][3])){
                numOfCorrect++;
                System.out.println("That is correct!");
            } else {
                System.out.println("Sorry, that is incorrect");
            }
        }
        s.close();
        //TODO: Figure out how to remove the questions that were asked from the CSV file
        return numOfCorrect >= needCorrect;
    }
     
}