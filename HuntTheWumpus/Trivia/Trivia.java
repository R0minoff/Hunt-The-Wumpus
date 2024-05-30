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
        this.file = new File("HuntTheWumpus\\Trivia\\Questions.csv"); //Creates a new file
        this.questions = new String[C][R]; //Initializes questions to a 2D String array with the length and width of the csv
        getQuestions(this.file); // This method fills the questions list with data from the csv
        askQuestions(5, 3); // This questions returns whether or not the user got the needed correct answers
    }

    ///////////////////////
    // Methods
    //////////////////////

    public void getQuestions(File f){
        ArrayList<String[]> lines = new ArrayList<>(); //Creates an ArrayList of string arrays
        try{
            Scanner s = new Scanner(f); //Creates a new scanner to read the questions csv file
            while(s.hasNextLine()){
                String line = s.nextLine(); //Initializes a string that is equal to the line of the scanner
                String[] parts = line.split(","); //Splits the previous string into an array
                lines.add(parts); //Adds the string array to the ArrayList lines
            }
            s.close();
        } catch(FileNotFoundException e){ //I use the catch in case the file is not found
            System.out.println("File not found");
        }
        Collections.shuffle(lines); // This fully shuffles the arrayList lines into random order
        for(int i = 0; i < lines.size(); i++){
            this.questions[i] = lines.get(i); //The for loop sets each line of questions equal to each array from lines
        }
    }

    public boolean askQuestions(int numOfQuestions, int needCorrect){
        int numOfCorrect = 0;
        String active = "";
        ArrayList<String> indexes = new ArrayList<String>(); // This arrayList keeps track of which questions were asked so it knows what needs to be removed from the csv
        Scanner s = new Scanner(System.in);
        for(int r = 0; r < numOfQuestions; r++){ // This for loop asks the number of questions specified and it checks if the user got it right
            active = this.questions[r][1]; //This sets the string active to the part of the array that contains the question
            indexes.add(this.questions[r][0]);
            System.out.println(active);
            String userAns = s.nextLine();
            if(userAns.equalsIgnoreCase(this.questions[r][2])){ //Checks if the user got the question right
                numOfCorrect++;
                System.out.println("That is correct!");
            } else {
                System.out.println("Sorry, that is incorrect");
            }
        }
        s.close();

        ArrayList<String[]> tempQuestions = new ArrayList<String[]>(); //Creates an arraylist
        for(int i = 0; i < this.questions.length; i++){ //Adds all of the questions that weren't asked to the arrayList
            if(indexes.contains(this.questions[i][0])){
                continue;
            } else {
                tempQuestions.add(this.questions[i]);
            }
        }
        this.questions = new String[tempQuestions.size()][R];
        for(int i = 0; i < tempQuestions.size(); i++){  //Sets the global questions to the temp array
            this.questions[i] = tempQuestions.get(i);
        }
        System.out.println(Arrays.deepToString(this.questions));

        
         try{
            FileWriter writer = new FileWriter(this.file); //Instantiates a new filewriter
            String line = "";
            for(int i = 0; i < this.questions.length; i++){ //The for loop adds all of the info from questions into the csv file, this is what was already in questions except it removed questions that were asked
                for(int k = 0; k < R; k++){
                    line += questions[i][k];
                    line += ",";
                }
                writer.write(line + "\n"); // Writers the line and starts a new line
                line = "";
            }
            writer.close();

        } catch(Exception e){
            System.out.println("File not found!!!");
        }
        
        
        return numOfCorrect >= needCorrect; // Decides wether or not the user met the goal
    }
     
}