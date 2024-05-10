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
import java.util.Random;

public class Player {
    ///////////////////////
    // Properties & Fields
    //////////////////////
    private gameLocations gL;
    private Wumpus w;
    private String name;
    private boolean triviaAnswer;
    private int gold = 0;
    public int health = 1;
    private String choice;
    private int arrows = 3;

    ///////////////////////
    // Constructor(s)
    //////////////////////
    public Player(){
        gL = new gameLocations();
        w = new Wumpus();

        chooseMove();
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
    public String move(String c){
        return c;
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
    public int attack(){
        arrows--;
        w.health--;
        return arrows;
    }

    // This method allows the player to choose which spot they would like to move to
    public void chooseMove(){
        Scanner s = new Scanner(System.in);
        System.out.println("Where would you like to move? Up, Down, Left, or Right?");
        choice = s.nextLine();
        if (choice.substring(0,1).equals("R") || choice.substring(0,1).equals("r")){
            move(choice.substring(0,1));
            gL.PlayerPos[0]++;
        } else if (choice.substring(0,1).equals("L") || choice.substring(0,1).equals("l")){
            move(choice.substring(0,1));
            gL.PlayerPos[0]--;
        } else if (choice.substring(0,1).equals("U") || choice.substring(0,1).equals("u")){
            move(choice.substring(0,1));
            gL.PlayerPos[1]++;
        } else if (choice.substring(0,1).equals("D") || choice.substring(0,1).equals("d")){
            move(choice.substring(0,1));
            gL.PlayerPos[1]--;
        } else {
            System.out.println("Sorry you did not enter one of the following options. Please try again.");
            chooseMove();
        }
    }

    // This method gets the location of the player
    public int[] getLocation(){
        return gL.PlayerPos;
    }

    // This method is for when the player takes damage
    public int takeDamage(){
        health--;
        return health;
    }

    // This method is for when the player dies
    public boolean death(){
        if (health == 0){
            return true;
        } else {
            return false;
        }
    }
}