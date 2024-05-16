// Aadhav and Arunim
// February 16, 2024
// Period 5
// Hunt the Wumpus - Game Locations Class

/*
 *  ABOUT THE OBJECT  *
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
import HuntTheWumpus.Cave.*;
import HuntTheWumpus.gameControl.*;
import HuntTheWumpus.gameLocations.*;
import HuntTheWumpus.Player.*;
import HuntTheWumpus.Sound.*;
import HuntTheWumpus.Trivia.*;
import HuntTheWumpus.UI.*;
import HuntTheWumpus.Wumpus.*;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class gameLocations {
    ///////////////////////
    // Properties & Fields
    //////////////////////
    private Cave     Cave;
    private String   typeOfHazard;
    private String[] Hints;
    public  int[]    WumpusPos;
    public  int[]    PlayerPos;
    public  int[]    HazardPos;
    

    ///////////////////////
    // Constructor(s)
    //////////////////////
    public gameLocations() {
        //Cave   = new Cave();
        WumpusPos = new int[2];
        PlayerPos = new int[2];
        HazardPos = new int[2];
        
        //findHazard(PlayerPos);
    }

    ///////////////////////
    // Methods
    //////////////////////
    public int[] findHazard(int[] pPos){
        typeOfHazard = "";
        giveWarning(typeOfHazard);
        return HazardPos;
    }

    public int[] getWumpusLocation(){ return WumpusPos; }

    public int[] getPlayerLocation(){ return PlayerPos; }

    public void giveHint(){ }

    public String giveWarning(String warnType){
        if(warnType.equals("SuperBats")) 
            return "Bats Nearby.";
        else if(warnType.equals("Pit")) 
            return "I feel a draft."; 
        else if(warnType.equals("Wumpus")) 
            return "I smell a Wumpus!";
        return warnType;
    }

    public int shootArrow(int arrowCount){
        arrowCount -= 1;        
        return arrowCount;
    }

    public void initializeCave(){ }


}
