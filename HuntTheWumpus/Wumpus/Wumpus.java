// Amrit Gill
// March 1, 2024
// Period 5
// Hunt the Wumpus - Wumpus Class

package HuntTheWumpus.Wumpus;
import HuntTheWumpus.Cave.*;
import HuntTheWumpus.gameControl.*;
import HuntTheWumpus.gameLocations.*;
import HuntTheWumpus.Player.*;
import HuntTheWumpus.Sound.*;
import HuntTheWumpus.Trivia.*;
import HuntTheWumpus.UI.*;
import HuntTheWumpus.Wumpus.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Wumpus {
    ///////////////////////
    // Properties & Fields
    //////////////////////
    public gameLocations gL;
    public Player p;
    public int health = 5;
    private ArrayList attackList;

    ///////////////////////
    // Constructor(s)
    //////////////////////
    public Wumpus(){

    }
    ///////////////////////
    // Methods
    //////////////////////

    // This method gets the location of the Wumpus
    public String getLocation(){
        return gL.WumpusPos;
    }

    // This method shows the attacks the Wumpus can do
    public void Attacks(){
        attackList.add("Slimy Sucker Punch");
        attackList.add("Tornado Kick");
        attackList.add("Slimeball");
        attackList.add("Tougue Tap");
        attackList.add("Flash Fist");
        attackList.add("SUPER SPECIAL");
        attackList.add("Casual Kick");
        attackList.add("Casual Punch");
        attackList.add("Laser Eyes");
        attackList.add("Headbutt");
    }

    // This method is when the Wumpus attacks the player.
    public String Attack(){
        int a = (int)(Math.random() * 10) + 1;
        String attack = (String) attackList.get(a);
        return attack;
    }

    // This method is when the Wumpus blocks the player's attack.
    public String Block(String b){
        return b;
    }

    // This method is when the Wumpus takes damage.
    public int takeDamage(){
        health--;
        return health;
    }

    // This method is when the Wumpus kills the player.
    public boolean WumpusWins(){
        if (health != 0 && p.death() == true){
            return true;
        } else {
            return false;
        }
    }

    // This method is when the Wumpus dies.
    public boolean WumpusLoses(){
        if (health == 0){
            return true;
        } else{
            return false;
        }
    }
}
