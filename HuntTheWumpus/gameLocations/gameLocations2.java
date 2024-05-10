// Aadhav and Arunim
// February 16, 2024
// Period 5
// Hunt the Wumpus - Game Locations Class
/*
ABOUT THE OBJECT  
 *  The gameLocations object tracks the locations of all objects in the current game. The tasks it performs are as follows:
 *      - Store and interact with the cave used for this game
 *      - Keep track of where the hazards are
 *      - Keep track of where the wumpus is
 *      - Keep track of where the player is
 *      - Control arrow shooting
 *      - Give any necessary warnings
 *      - Obtain hints to help the player
 *  MORE INFO  *
 *   Hazards (Wumpus is immune to all hazards):
 *      - Bottomless Pits
 *          - Two rooms have bottomless pits in them
 *          - You can save yourself by answering 2/3 trivia questions correctly
 *          - If you escape the pit, you will spawn back where you started the game
 *      - Super Bats
 *          - Two rooms have super bats in them
 *          - The bats will take you to some room at random
 *          - They fly away into another random room in the cave after taking you
 *      - No room has more than one hazard
 *      - The wumpus is not considered as a hazard
 *   Warnings:
 *      - You will be given a warning whenever a hazard or wumpus is in an adjacent room
 *          - Wumpus: I smell a Wumpus!
 *          - Bat: Bats Nearby.
 *          - Pit: I feel a draft.
 *   Arrows: 
 *      - Player starts game with 3 arrows
 *      - Shoot arrows into any adjacent room connected by a tunnel
 */

package HuntTheWumpus.gameLocations;
import java.io.FileNotFoundException;

import HuntTheWumpus.Cave.*;
import HuntTheWumpus.gameControl.*;
import HuntTheWumpus.gameLocations.*;
import HuntTheWumpus.Player.*;
import HuntTheWumpus.Sound.*;
import HuntTheWumpus.Trivia.*;
import HuntTheWumpus.UI.*;
import HuntTheWumpus.Wumpus.*;

// Store and interact with the cave used for this game
// keep track of where the hazards are
// Keep track of where the Wumpus is. This includes controlling Wumpus behavior(that is, asleep awake, moving).
// Keep track of where the player is
// control arrow shooting
// give any necessary warnings
// obtain hints to help the player 
// //////////////////////////////////



public class gameLocations2 {
    ///////////////////////
    // Properties & Fields
    //////////////////////


    ///////////////////////
    // Constructor(s)
    //////////////////////
    public gameLocations2() throws FileNotFoundException{
        Cave map = new Cave();
    }
    ///////////////////////
    // Methods
    //////////////////////
    // Interact, HazardsLocation, WumpusLocation, WumpusBehavior, PlayerLocation,giveHints, warnings

    public Cave interact(Cave c, Player p){
        return c;
    }

    public int[][] hazardsLocation(/*hazard h*/){
        int[][] location = new int[10][10];
        return location;
    }

    public int[][] wumpusLocation(Wumpus w){
        int[][] location = new int[10][10];
        return location;
    }

    public String wumpusBehavior(Wumpus w){
        String str = "";
        return str;
    }

    public int[][] playerLocation(Player p){
        int[][] location = new int[10][10];
        return location;
    }

    public void giveHints(Wumpus w, /*Hazard h, */ Player p){
        System.out.println("yo");
    }


}