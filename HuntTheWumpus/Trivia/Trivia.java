// Kjell Tingelstad
// 2/16/24
// Period 5
// Hunt the Wumpus - Trivia Class

package Trivia;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.io.FileWriter;

public class Trivia{
    //////////////////////
    // Properties & Fields
    //////////////////////
    private File file;
    public String[][] questions;
    private static final int C = 8; //Idk know how but it's backwards
    private static final int R = 3;

    /////////////////////
    // Constructor(s)
    /////////////////////

    public Trivia(){
        this.file = new File("HuntTheWumpus\\Trivia\\Questions.csv");
        this.questions = new String[C][R];
        getQuestions(this.file);
        askQuestions(5, 3);
    }

    ///////////////////////
    // Methods
    //////////////////////

    public void getQuestions(File f){
        ArrayList<String[]> lines = new ArrayList<>();
        try{
            Scanner s = new Scanner(f);
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
        ArrayList<String> indexes = new ArrayList<String>();
        Scanner s = new Scanner(System.in);
        for(int r = 0; r < numOfQuestions; r++){
            active = this.questions[r][1];
            indexes.add(this.questions[r][0]);
            System.out.println(active);
            String userAns = s.nextLine();
            if(userAns.equalsIgnoreCase(this.questions[r][2])){
                numOfCorrect++;
                System.out.println("That is correct!");
            } else {
                System.out.println("Sorry, that is incorrect");
            }
        }
        s.close();

        ArrayList<String[]> tempQuestions = new ArrayList<String[]>();
        for(int i = 0; i < this.questions.length; i++){
            if(indexes.contains(this.questions[i][0])){
                continue;
            } else {
                tempQuestions.add(this.questions[i]);
            }
        }
        this.questions = new String[tempQuestions.size()][R];
        for(int i = 0; i < tempQuestions.size(); i++){
            this.questions[i] = tempQuestions.get(i);
        }
        System.out.println(Arrays.deepToString(this.questions));

        
         try{
            FileWriter writer = new FileWriter(this.file);
            String line = "";
            for(int i = 0; i < this.questions.length; i++){
                for(int k = 0; k < R; k++){
                    line += questions[i][k];
                    line += ",";
                }
                writer.write(line + "\n");
                line = "";
            }
            writer.close();

        } catch(Exception e){
            System.out.println("File not found!!!");
        }
        
         
        

        //REMOVE QUESTIONS FROM CSV
        //--DONE
        //--Make a new file
        //--Add all of the lines of the old file to the new file except for the asked questions
        //--Would need to rerun the getQuestions method with the new file in order to update the 2D array
        return numOfCorrect >= needCorrect;
    }
     
}