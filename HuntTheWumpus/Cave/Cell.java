package HuntTheWumpus.Cave;




import java.io.FileReader;
import java.io.File;


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
}
