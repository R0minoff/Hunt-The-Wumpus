// Amrit Gill
// March 1, 2024
// Period 5
// Hunt the Wumpus - Lazy Wumpus Class

package Wumpus;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

import Player.Player;
import Trivia.Trivia;
import gameLocations.gameLocations;

public class LazyWumpus {
    ///////////////////////
    // Properties & Fields
    //////////////////////
    public gameLocations gL;
    public Player p;
    public int health = 1;
    public Trivia t;
    private int numQ;

    ///////////////////////
    // Constructor(s)
    //////////////////////
    public LazyWumpus(){
        getLocation();
    }

    ///////////////////////
    // Methods
    //////////////////////

    public int[] getLocation(){
        return gL.wumpusPos;
    }

    // Precondition: the String state must be "asleep", "awake", or "moving"
    public String state(String state){
        return state;
    }

    public void miss(){
        if ((p.arrows == 2 && health != 0) | (p.arrows == 1 && health != 0) | (p.arrows == 0 && health != 0)){
            gL.wumpusPos[0] += 2 | gL.wumpusPos[1] + 2;
        }
    }

    public boolean loseTrivia(){
        if (t.askQuestions(numQ,3)){
            return true;
        } else {
            return false;
        }
    }

    public boolean WumpusWins(){
        if (health != 0 && p.death() == true){
            return true;
        } else {
            return false;
        }
    }

    public boolean WumpusLoses(){
        if (health == 0){
            return true;
        } else{
            return false;
        }
    }
}