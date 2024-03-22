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
import java.util.ArrayList;
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
    private int health = 3;
    private String choice;
    private ArrayList attackList;

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

    // This method shows the list of attacks that the player can do
    public void attacks(){
        attackList.add("Arrow");
        attackList.add("SUPER SPECIAL");
        attackList.add("Slamming Spear");
        attackList.add("Hero Kick");
        attackList.add("Hero Punch");
    }
    
    // This method allows the player to attack the Wumpus
    public String attack(Random r){
        int a = (int)(Math.random() * 5) + 1;
        String attack = (String) attackList.get(a);
        return attack;
    }

    // This method allows the player to block attacks
    public String block(String b){
        return b;
    }

    // This method allows the player to choose which spot they would like to move to
    public void chooseMove(){
        Scanner s = new Scanner(System.in);
        System.out.println("Where would you like to move? Up, Down, Left, or Right?");
        choice = s.nextLine();
        if (choice.substring(0,1).equals("R") || choice.substring(0,1).equals("r")){
            move(choice.substring(0,1));
        } else if (choice.substring(0,1).equals("L") || choice.substring(0,1).equals("l")){
            move(choice.substring(0,1));
        } else if (choice.substring(0,1).equals("U") || choice.substring(0,1).equals("u")){
            move(choice.substring(0,1));
        } else if (choice.substring(0,1).equals("D") || choice.substring(0,1).equals("d")){
            move(choice.substring(0,1));
        } else {
            System.out.println("Sorry you did not enter one of the following options. Please try again.");
            chooseMove();
        }
    }

    public String getLocation(){
        return gL.PlayerPos;
    }
}