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
    private ArrayList<Question> questions;

    /////////////////////
    // Constructor(s)
    /////////////////////

    public Trivia(){
        this.file = new File("HuntTheWumpus\\Trivia\\Questions.csv");
        this.questions = new ArrayList<Question>();
        createQuestions(this.file);
        getQuestion();
    }

    ///////////////////////
    // Methods
    //////////////////////

    public void createQuestions(File f){
        try{
            Scanner s = new Scanner(f);
            while(s.hasNextLine()){
                String line = s.nextLine();
                String[] parts = line.split(",");
                this.questions.add(new Question(parts[0], parts[1], parts[2]));
            }
            s.close();
        } catch(FileNotFoundException e){
            System.out.println("File not found");
        }
        Collections.shuffle(this.questions);
    }


/*
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
            if(userAns.equalsIgnoreCase(this.questions[r][3])){
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
            File tempFile = new File("HuntTheWumpus\\Trivia\\Questions(copy).csv");
            FileWriter writer = new FileWriter(tempFile);
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
        
        return numOfCorrect >= needCorrect;
    }
 */
    
    public Question getQuestion(){
        Question tempQuestion = this.questions.get(0);
        this.questions.remove(0);
        try{
            FileWriter writer = new FileWriter(this.file);
            for(int i = 0; i < this.questions.size(); i++){
                writer.write(this.questions.get(i).toString() + "\n");
            }
            writer.close();
        } catch(Exception e){
            System.out.println("File not found!!!");
        }
        return tempQuestion;
    }
}