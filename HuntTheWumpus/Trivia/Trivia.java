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
                s.next();
                line = s.nextLine();
                String[] info = line.split(",");
                this.question = info[0];
                this.difficulty = Integer.parseInt(info[1]);
                this.answer = info[2];
              System.out.println(Arrays.toString(info));
            }
        } catch(FileNotFoundException e){
            System.out.println("File not Found");
        }
        return myQuestion;
    }




    public boolean askQuestion(){
        boolean correct = false;
        return correct;
    }

     
}