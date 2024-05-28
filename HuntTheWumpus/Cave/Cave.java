// Ishaan and Anders
// Period 5 CSA
// 2/12/24
// Hunt The Wumpus - Cave Class

package Cave;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;

public class Cave  {
    ///////////////////////
    // Properties & Fields
    //////////////////////

    ///////////////////////
    // Constructor(s)
    //////////////////////
    public Cave()  {
        Cell c = new Cell();
        c.setValue(5);
        new CellMap(c);
        System.out.println();
        System.out.println("Code runs");
    }
    ///////////////////////
    // Methods
    //////////////////////
    
    
   
}