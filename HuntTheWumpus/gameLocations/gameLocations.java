// Aadhav and Arunim
// February 16, 2024
// Period 5
// Hunt the Wumpus - Game Locations Class

/* */

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

public class gameLocations {
    ///////////////////////
    // Properties & Fields
    //////////////////////
    private Cave    Cave;
    private Wumpus  Wump;
    private Player  Player;
    private int[][] WumpusPos;
    private int[][] PlayerPos;
    
    ///////////////////////
    // Constructor(s)
    //////////////////////
    public gameLocations() throws FileNotFoundException{
        Cave   = new Cave();
        Wump   = new Wumpus();
        Player = new Player();
    }

    ///////////////////////
    // Methods
    //////////////////////
    public void findHazards(){

    }

    public int[][] getWumpusLocation(Wumpus Wumpus){
        return WumpusPos;
    }

    public int[][] getPlayerLocation(Player Player){
        return PlayerPos;
    }

    public void giveHint(){

    }

    public void giveWarning(){
        

    }


}
