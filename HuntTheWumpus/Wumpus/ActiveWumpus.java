// Amrit Gill
// May 16, 2024
// Period 5
// Hunt the Wumpus - Active Wumpus Class

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
        return gL.WumpusPos;
    }
}
