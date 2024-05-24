package HuntTheWumpus.Cave;

import java.util.Arrays;


public class Cell {
    //properties
  int cellNum;
  //Hazard hazard;
  boolean player;
  boolean[] walls;
  boolean wumpus;
  //constuctor
  public Cell(String str){
    String[] info = str.split(":");
    //info[0] - - - - -- - - - - - - - - - - - - - - - - -
    cellNum = Integer.parseInt(info[0]);
    //info[1] - - - - -- - - - - - - - - - - - - - - - - -
    this.walls = new boolean[6];
    for(int i = 0; i < walls.length; i++){
      if(info[1].substring(i, i+1).equals("F")){
        walls[i] = false;
      }
    }
    //this should give, false,false,false
    System.out.println(Arrays.toString(walls));
    //info[2] - - - - -- - - - - - - - - - - - - - - - - -
    //this.hazard = new Hazard(info[2]);
    //info[3] - - - - -- - - - - - - - - - - - - - - - - -
    if(info[3].equals("T")) {
      this.player = true;
    }else{
      this.player = false;
    }
    //info[4] - - - - -- - - - - - - - - - - - - - - - - -
    if(info[4].equals("T")) {
      this.wumpus = true;
    }else{
      this.wumpus = false;
    }
    
  }
  //methods

  // NEIGHBOR CELL METHODS // ****ONLY WORKS FOR INTS ***
  // USE THIS CELLS CELL NUM 
  // given a cell number will give you the neighbor according to its direction
  /* * UL U UR * cell * DL D DR */
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
    if (col == 0)
      col = 6;
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
