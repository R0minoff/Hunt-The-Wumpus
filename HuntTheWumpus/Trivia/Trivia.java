// Kjell Tingelstad
// 2/16/24
// Period 5
// Hunt the Wumpus - Trivia Class

package HuntTheWumpus.Trivia;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;

public class Trivia{
    ///////////////////////
    // Properties & Fields
    //////////////////////
    private File file;
    private int difficulty;
    private String question;
    private String answer;

    ///////////////////////
    // Constructor(s)
    //////////////////////

    public Trivia(){
        this.file = new File("C:\\Git-P5 smiley face\\Hunt-The-Wumpus\\HuntTheWumpus\\Trivia\\Questions.csv");
        getQuestion();
        askQuestion();
    }

    ///////////////////////
    // Methods
    //////////////////////

    public void getQuestion(){
        try{
            Scanner s = new Scanner(this.file);                    //Creates new scanner
            String line = "";                                      //Creates empty string variable
            while(s.hasNextLine()){                                //Creates while loop to iterate over csv file
                s.nextLine();                                      //Advances scanner to the next line to skip the file header
                line = s.nextLine();                               //Sets line equal to the current line of the file
                String[] info = line.split(",");             //Creates a string array that contains the tokens in the line string
                this.question = info[0];                           //Sets the first token of the line to the question
                this.difficulty = Integer.parseInt(info[1]);       //Sets difficulty equal to the second token of the line
                this.answer = info[2];                             //Sets answer equal to the third token
            }
        } catch(FileNotFoundException e){                          //Uses a try catch in case of a fileNotFound exception
            System.out.println("File not Found");
        }
    }


    public boolean askQuestion(){
        System.out.println(this.question);
        Scanner s = new Scanner(System.in);
        String userAns = s.nextLine();
        if(userAns.equals(this.answer)){
            System.out.println("Yay you got it right!!");
            return true;
        } else {
            System.out.println("Ooof... better luck next time");
            return false;
        }
    }

     
}