// Amrit Gill
// March 1, 2024
// Period 5
// Hunt the Wumpus - Player Class

package HuntTheWumpus.Player;
import HuntTheWumpus.Cave.*;
import HuntTheWumpus.gameControl.*;
import HuntTheWumpus.gameLocations.*;
import HuntTheWumpus.Player.*;
import HuntTheWumpus.Sound.*;
import HuntTheWumpus.Trivia.*;
import HuntTheWumpus.UI.*;
import HuntTheWumpus.Wumpus.*;

import java.util.Scanner;

public class Player {
    ///////////////////////
    // Properties & Fields
    //////////////////////
    private Wumpus w;
    private String name;
    private boolean triviaAnswer;
    private int gold = 0;
    private int health = 3;

    ///////////////////////
    // Constructor(s)
    //////////////////////
    public Player(){

    }
    ///////////////////////
    // Methods
    //////////////////////

    // This method gets the name of the Player
    public String getName(){
        Scanner s = new Scanner(System.in);
        System.out.println("What is your name?");
        name = s.nextLine();
        System.out.println("Hello " + name + "! Welcome to Hunt the Wumpus!");

        s.close();

        return name;
    }

    // This method makes the player move
    public void move(){

    }

    // This method gives gold to the player
    public void giveGold(){
        if(triviaAnswer == true){
            gold = gold + 50;
        } else if (triviaAnswer == false){
            if (gold == 0){
                health = health - 1;
            }
            else if (gold >= 50){
                gold = gold - 50;
            }
        }
    }
    
    // This method allows the player to attack the Wumpus
    public void attack(){

    }

    // This method allows the player to block attacks
    public void block(){

    }

    // This method allows the player to choose which spot they would like to move to
    public void chooseMove(){
        
    }
}