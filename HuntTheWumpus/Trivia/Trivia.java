// Kjell Tingelstad
// 2/16/24
// Period 5
// Hunt the Wumpus - Trivia Class

package HuntTheWumpus.Trivia;
import HuntTheWumpus.Cave.*;
import HuntTheWumpus.gameControl.*;
import HuntTheWumpus.gameLocations.*;
import HuntTheWumpus.Player.*;
import HuntTheWumpus.Sound.*;
import HuntTheWumpus.Trivia.*;
import HuntTheWumpus.UI.*;
import HuntTheWumpus.Wumpus.*;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;

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

    public String getQuestion(){
        String myQuestion = "";
        try{
            Scanner s = new Scanner(this.file);
            String line = "";
            while(s.hasNextLine()){
                s.nextLine();
                line = s.nextLine();
                String[] info = line.split(",");
                this.question = info[0];
                this.difficulty = Integer.parseInt(info[1]);
                this.answer = info[2];
            }
        } catch(FileNotFoundException e){
            System.out.println("File not Found");
        }
        return myQuestion;
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