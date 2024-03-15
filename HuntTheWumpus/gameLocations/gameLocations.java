// Aadhav and Arunim
// February 16, 2024
// Period 5
// Hunt the Wumpus - Game Locations Class
// urrrlh

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

public class gameLocations {
    ///////////////////////
    // Properties & Fields
    //////////////////////
    private Cave Cave;
    private Wumpus Wump;
    private Player Player;
    
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
}
