// Amrit Gill
// March 1, 2024
// Period 5
// Hunt the Wumpus - Lazy Wumpus Class

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

public class LazyWumpus {
    ///////////////////////
    // Properties & Fields
    //////////////////////
    public gameLocations gL;
    public Player p;
    public int health = 1;

    ///////////////////////
    // Constructor(s)
    //////////////////////
    public LazyWumpus(){
        getLocation();
    }
    ///////////////////////
    // Methods
    //////////////////////

    // This method gets the location of the Wumpus
    //Should the return type be a 2D array to make it easier to get the location in a coordinate form 
    public int[] getLocation(){
        return gL.WumpusPos;
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
