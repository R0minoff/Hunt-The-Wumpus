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
    private ArrayList<Cell> rooms;
    private File maps;
    private Scanner reader;
    ///////////////////////
    // Constructor(s)
    //////////////////////
    public Cave() throws FileNotFoundException {
    this.maps = new File("C:\\git\\Hunt-The-Wumpus-V2\\Hunt-The-Wumpus\\HuntTheWumpus\\Cave\\Maps.csv");
    this.rooms = new ArrayList<Cell>();
    this.reader = new Scanner(this.maps);
    //set each cell to its information based on a map (we need 5 made maps)
    String[] cellsInfo = getFirstLineCSV();
    for(int i = 0; i < cellsInfo.length; i++){
      rooms.add(new Cell(cellsInfo[i]));
      System.out.println(getCell(i));
    }
    ///////////////////////
    // Methods
    //////////////////////
    // this returns String[] of infos for each cell (1-30)
  public String[] getFirstLineCSV(){
    //skips header
    String restOfLines = "";
    //grabs first line
    String lineInfo = reader.nextLine();
    String[] info = lineInfo.split(",");
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
    System.out.println(Arrays.toString(info));
    return info;
  }
      
// NEIGHBOR CELL METHODS

    // ****ONLY WORKS FOR INTS ***

    // given a cell number will give you the neighbor according to its direction
    /*
     * UL U UR
     * cell
     * DL D DR
     */
    
    public int getUp(int num) {
        int up = num - 6;
        return wrap(up);
    }

    public int getUpRight(int num) {
        int colNum = getCol(num);
        int UR = num;
        if (colNum % 2 == 0 && colNum != 0) {
            return wrap(UR + 1);
        } else if (colNum == 0) {
            return wrap(UR - 5);
        } else {
            return wrap(UR - 5);
        }
    }

    public int getDownRight(int num) {
        int colNum = getCol(num);
        int DR = wrap(num + 1);
        if (colNum % 2 == 0 && colNum != 0) {
            return wrap(DR + 6); // + 7
        } else {
            return DR; // + 1
        }
    }

    public int getDown(int num) {
        int down = num + 6;
        return wrap(down);
    }

    public int getDownLeft(int num) {
        int colNum = getCol(num);
        int DL = num;
        if (colNum % 2 == 1 && colNum != 1) {
            return wrap(DL - 1);
        } else if (colNum == 1) {
            return wrap(DL + 5);
        } else {
            return wrap(DL + 5);
        }
    }

    public int getUpLeft(int num) {
        int colNum = getCol(num);
        int UL = wrap(num - 1);
        if (colNum % 2 == 1 && colNum != 1) {
            return wrap(UL - 6); // - 1
        } else {
            return UL; // - 7
        }
    }

    private int getCol(int num) {
        int col = (num % 6);
        // if(col == 0) col = 6;
        return col;
    }

    private int wrap(int num) {
        if (num > 30) {
            return num - 30;
        }
        if (num < 1) {
            return 30 - Math.abs(num);
        }
        return num;
    }


  }
