// Amrit Gill
// May 16, 2024
// Period 5
// Hunt the Wumpus - Active Wumpus Class

package Wumpus;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class ActiveWumpus {
    /////////////////
    // PROPERTIES
    /////////////////
    public int health = 1;
    public int[] wumpusPos;

    /////////////////
    // CONSTRUCTOR(S)
    /////////////////
    public ActiveWumpus(){
        wumpusPos = new int[2];
    }

    /////////////////
    // METHODS
    /////////////////
    public int[] getLocation(){
        return wumpusPos;
    }

    

// Precondition: the String state must be "asleep" or "awake"
    public String state(String state){
        return state;
    }
}
