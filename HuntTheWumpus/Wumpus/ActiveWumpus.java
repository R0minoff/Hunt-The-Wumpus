// Amrit Gill
// May 16, 2024
// Period 5
// Hunt the Wumpus - Active Wumpus Class

package Wumpus;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

import Player.Player;
import gameLocations.gameLocations;

public class ActiveWumpus {
    /////////////////
    // PROPERTIES
    /////////////////
    public gameLocations gL;
    public Player p;
    public int health = 1;

    /////////////////
    // CONSTRUCTOR(S)
    /////////////////
    public ActiveWumpus(){

    }

    /////////////////
    // METHODS
    /////////////////
    public int[] getLocation(){
        return gL.wumpusPos;
    }

    

// Precondition: the String state must be "asleep" or "awake"
    public String state(String state){
        return state;
    }
}
