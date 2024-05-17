// Ishaan and Anders
// Period 5 CSA
// 2/12/24
// Hunt The Wumpus - Cave Class

package HuntTheWumpus.Cave;
import HuntTheWumpus.Cave.*;
import HuntTheWumpus.gameControl.*;
import HuntTheWumpus.gameLocations.*;
import HuntTheWumpus.Player.*;
import HuntTheWumpus.Sound.*;
import HuntTheWumpus.Trivia.*;
import HuntTheWumpus.UI.*;
import HuntTheWumpus.Wumpus.*;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;

public class Cave  {
    ///////////////////////
    // Properties & Fields
    //////////////////////
    File file;
    Scanner reader;
    String line;
    ///////////////////////
    // Constructor(s)
    //////////////////////
    public Cave() throws FileNotFoundException {
        this.file = new File("Maps.csv");
        this.reader = new Scanner(this.file);
    }
    ///////////////////////
    // Methods
    //////////////////////
   public String[] ReadCaveFile() throws FileNotFoundException {
    //this one will process information from the cave file
    //so far it should be a CSV which has information of the map

    //skips the header
    reader.nextLine();
    //reads the first line in the csv
    String line = reader.nextLine();
    //when we had the map back we will put it at the very end, meaning that every time it will go through a new map
    String[] info = line.split(","); 

    //returns the info found by the first line with actual information
    return info;

   }
   public void WriteCaveFile() throws FileNotFoundException {
    //this one will write the played map back into the file (at the end)
    try{
      FileWriter FW = new FileWriter(file, true);
      FW.write(ConvertInfo(ReadCaveFile()));
      FW.close();
    } catch (Exception e) {

      System.out.println("i suck " + e);

    }
   }
   public String ConvertInfo(String[] info){
    //this converts the information from the string[] into string
    String str = "";
    for(int i = 0; i < info.length; i++){
        str += info[i];
    }
    return str;
   }
  }
