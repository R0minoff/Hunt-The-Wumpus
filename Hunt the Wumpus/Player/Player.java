// Amrit Gill
// March 1, 2024
// Period 5
// Hunt the Wumpus

import java.util.Scanner;

public class Player {
    ///////////////////////
    // Properties & Fields
    //////////////////////
    private String name;

    ///////////////////////
    // Constructor(s)
    //////////////////////
    public Player(){

    }
    ///////////////////////
    // Methods
    //////////////////////

    // This method gets the name of the Player
    public String getName(){
        Scanner s = new Scanner(System.in);
        System.out.println("What is your name?");
        name = s.nextLine();
        System.out.println("Hello " + name + "! Welcome to Hunt the Wumpus!");

        s.close();

        return name;
    }

    // This method makes the player move
    public void move(){

    }

    // This method gives gold to the player
    public void giveGold(){

    }
    
    // This method allows the player to attack the Wumpus
    public void attack(){

    }

    // This method allows the player to block attacks
    public void block(){

    }

    // This method allows the player to choose which spot they would like to move to
    public void chooseMove(){

    }
}
