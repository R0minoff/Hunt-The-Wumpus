// Ishaan and Anders
// Period 5 CSA
// 2/12/24
// Hunt The Wumpus - Cave Class

package HuntTheWumpus.Cave;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;

import java.util.ArrayList;
import java.util.Arrays;

public class Cave  {
    ///////////////////////
    // Properties & Fields
    //////////////////////
    private ArrayList<Cell> rooms;
    private File maps;
    private Scanner reader;
    ///////////////////////
    // Constructor(s)
    //////////////////////
    public Cave() throws FileNotFoundException {
    this.maps = new File("C:\\git\\Hunt-The-Wumpus-V2\\Hunt-The-Wumpus\\HuntTheWumpus\\Cave\\C:\\Git-P5 smiley face\\Hunt-The-Wumpus\\HuntTheWumpus\\Cave\\Maps.csv");
    this.rooms = new ArrayList<Cell>();
    this.reader = new Scanner(maps);
    //set each cell to its information based on a map (we need 5 made maps)
    String cellsInfo = getFirstLineCSV();
    for(int i = 0; i < 30; i++){
      rooms.add(new Cell(cellsInfo));
    }
}


    /////////////////
    // Methods
    /////////////////


    // this returns String[] of infos for each cell (1-30)
    public String getFirstLineCSV(){
    //skips header
    String restOfLines = "";
    //grabs first line
    String lineInfo = reader.nextLine();
    //grabs rest of lines
    while(reader.hasNextLine()){
      restOfLines += reader.nextLine() + "\n";
    }
    //writes rest of lines back in
    try {
      FileWriter fw = new FileWriter(maps);
      fw.write(restOfLines + lineInfo);
      fw.close();
    }catch(Exception e){
      System.out.println("Writing lines into csv Failed " + e);
    }
    return lineInfo;
    }
  
  }
