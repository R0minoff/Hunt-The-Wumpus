// Kjell Tingelstad
// 2/16/24
// Period 5
// Hunt the Wumpus - Trivia Class

package HuntTheWumpus.Trivia;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;

public class Trivia{
    //////////////////////
    // Properties & Fields
    //////////////////////
    private File file;
    private String[] question;

    /////////////////////
    // Constructor(s)
    /////////////////////

    public Trivia(){
        this.file = new File("C:\\Git-P5 smiley face\\Hunt-The-Wumpus\\HuntTheWumpus\\Trivia\\Questions.csv");
        this.question = new String[4];
        getQuestion();
        askQuestion(2);
    }

    ///////////////////////
    // Methods
    //////////////////////

    public void getQuestion(){
        try{
            Scanner s = new Scanner(this.file);
            String line = "";
            while(s.hasNextLine()){
                s.nextLine();
                line = s.nextLine();
                String[] info = line.split(",");
                this.question[0] = info[1];
                this.question[1] = info[2];
                this.question[2] = info[3];
            }
        } catch(FileNotFoundException e){
            System.out.println("File not Found");
        }
    }

    public int askQuestion(int numOfQuestions){
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
    }
     
}