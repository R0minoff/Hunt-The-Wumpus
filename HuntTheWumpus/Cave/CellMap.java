package Cave;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.NoSuchElementException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;

public class CellMap {
  // properties
  Scanner s;
  File wv;
  int[][] wvList;
  File wh1;
  int[][] wh1List;
  File wh2;
  int[][] wh2List;

  // constructor
  public CellMap(Cell c) {
    //when in class change these to the correct file path
    wv = new File("C:\\git\\Hunt-The-Wumpus-V2\\Hunt-The-Wumpus\\HuntTheWumpus\\Cave\\WV.csv");
    wh1 = new File("C:\\git\\Hunt-The-Wumpus-V2\\Hunt-The-Wumpus\\HuntTheWumpus\\Cave\\WH1.csv");
    wh2 = new File("C:\\git\\Hunt-The-Wumpus-V2\\Hunt-The-Wumpus\\HuntTheWumpus\\Cave\\WH2.csv");
    s = resetScanner(wv);
    wvList = createMap(s);
    s = resetScanner(wh1);
    wh1List = createMap(s);
    s = resetScanner(wh2);
    wh2List = createMap(s);
    s = resetScanner(wv);
    isAjacent(c, s, wvList);
    allAjacents(c);
    //allAjacentsWithWalls(c);
  }

  // methods
  
  public ArrayList<Cell> allAjacentsWithWalls(Cell c){
    int counter = 0;
    ArrayList<Cell> neighbors = isWrappedAjacent(c);
    ArrayList<Cell> removeExcess = new ArrayList<Cell>();
    s = resetScanner(wv);
    ArrayList<Cell> ajacentWVList = isAjacent(c, s, wvList);
    s = resetScanner(wh1);
    ArrayList<Cell> ajacentWH1List = isAjacent(c, s, wh1List);
    s = resetScanner(wh2);
    ArrayList<Cell> ajacentWH2List = isAjacent(c, s, wh2List);
    ArrayList<Cell> allAjacents = new ArrayList<Cell>();
    allAjacents.addAll(ajacentWVList);
    allAjacents.addAll(ajacentWH1List);
    allAjacents.addAll(ajacentWH2List);
    allAjacents.addAll(neighbors);
    Collections.sort(allAjacents);
    for(int i = 0; i < allAjacents.size() - 1; i++){
      Cell c1 = allAjacents.get(i);
      Cell c2 = allAjacents.get(i+1);
      if(c1.getValue() == c2.getValue()){
        removeExcess.add(allAjacents.get(i));
      }
    }
    allAjacents.removeAll(removeExcess);
      int randomWall1 = (int)(Math.random() * allAjacents.size());
      int randomWall2 = (int)(Math.random() * allAjacents.size());m
      while(randomWall1 == randomWall2){
        randomWall2 = (int)(Math.random() * allAjacents.size());
      }
      int randomWall3 = (int)(Math.random() * allAjacents.size());
      while(randomWall1 == randomWall3 || randomWall2 == randomWall3){
        randomWall3 = (int)(Math.random() * allAjacents.size());
      }
      System.out.println(randomWall1);
      System.out.println(randomWall2);
      System.out.println(randomWall3);
      System.out.println();
      for(int j = 0; j < allAjacents.size(); j++){
        if(j == randomWall1){
          removeExcess.add(allAjacents.get(j));
        }
        if(j == randomWall2){
          removeExcess.add(allAjacents.get(j));
        }
        if(j == randomWall3){
          removeExcess.add(allAjacents.get(j));
        }


      }
      allAjacents.removeAll(removeExcess);
    
    for(int n = 0; n < allAjacents.size(); n++){
      System.out.println(allAjacents.get(n).getValue());
    }
    return allAjacents;
  }
  
  public ArrayList<Cell> allAjacents(Cell c){
    int counter = 0;
    ArrayList<Cell> neighbors = isWrappedAjacent(c);
    ArrayList<Cell> removeExcess = new ArrayList<Cell>();
    s = resetScanner(wv);
    ArrayList<Cell> ajacentWVList = isAjacent(c, s, wvList);
    s = resetScanner(wh1);
    ArrayList<Cell> ajacentWH1List = isAjacent(c, s, wh1List);
    s = resetScanner(wh2);
    ArrayList<Cell> ajacentWH2List = isAjacent(c, s, wh2List);
    ArrayList<Cell> allAjacents = new ArrayList<Cell>();
    allAjacents.addAll(ajacentWVList);
    allAjacents.addAll(ajacentWH1List);
    allAjacents.addAll(ajacentWH2List);
    allAjacents.addAll(neighbors);
    Collections.sort(allAjacents);
    for(int i = 0; i < allAjacents.size() - 1; i++){
      Cell c1 = allAjacents.get(i);
      Cell c2 = allAjacents.get(i+1);
      if(c1.getValue() == c2.getValue()){
        removeExcess.add(allAjacents.get(i));
      }
    }
    allAjacents.removeAll(removeExcess);
    for(int n = 0; n < allAjacents.size(); n++){
      System.out.println(allAjacents.get(n).getValue());
    }
    return allAjacents;
  }

  
  public ArrayList<Cell> isAjacent(Cell c,Scanner s, int[][] axisList){
    int currentVal = c.getValue();
    int[] newVals = new int[4];
    ArrayList<Cell> cells = createCellList(s);
    ArrayList<Cell> ajacents = new ArrayList<Cell>();
    for(int i = 0; i < axisList.length; i++){
      for(int j = 0; j < axisList[0].length; j++){
        if(currentVal == axisList[i][j]){
          if(i - 1 >= 0){
            newVals[0] = axisList[i - 1][j];
          }
          if(j - 1 >= 0){
            newVals[1] = axisList[i][j - 1];
          }
          if(i + 1 < axisList.length){
            newVals[2] = axisList[i + 1][j];
          }
          if(j + 1 < axisList[0].length){
            newVals[3] = axisList[i][j + 1];
          }
          
        }
        //break;
      }
      //break;
    }
    for(int k = 0; k < cells.size(); k++){
      for(int l = 0; l < newVals.length; l++){
        if(newVals[l] == cells.get(k).getValue()){
          ajacents.add(cells.get(k));
        }
      }
    }
    /*for(int m = 0; m < ajacents.size(); m++){
      System.out.println(ajacents.get(m).getValue());
    }*/
    return ajacents;
  }

  
  public Scanner resetScanner(File f){
    try {
      return new Scanner(f);
    } catch (IOException e) {
      System.out.println("Code doesn't work");
      e.printStackTrace();
      return null;
    }
  }

  
  public int[][] createMap(Scanner s){
    ArrayList<Cell> cells = createCellList(s);
    int length = cells.size();
    Cell last = cells.get(length-1);
    int rows = last.getRow();
    int columns = last.getColumn();
    int count = 0;
    int[][] map = new int[rows][columns];
    for(int i = 0; i < rows; i++){
      for(int j = 0; j < columns; j++){
        Cell current = cells.get(count);
        map[i][j] = current.getValue();
        count++;
      }
    }
    /*for(int k = 0; k < map.length; k++){
      for(int l = 0; l < map[0].length; l++){
        System.out.print(map[k][l]);
        System.out.print("  ");
      }
      System.out.println();
      System.out.println();
    }*/
    return map;
  }



  public ArrayList<Cell> createCellList(Scanner s){
    Scanner delim = s.useDelimiter("[,\r\n]");
    ArrayList<Cell> cellList = new ArrayList<Cell>();
    boolean stop = false;
    int rowCount = 1;
    int columnCount = 1;
    while(!stop){
      try{
        String stringInt = delim.next();
        if(stringInt.length() > 0){
          Cell c = new Cell();
          c.setValue(Integer.parseInt(stringInt));
          c.setColumn(columnCount);
          c.setRow(rowCount);
          cellList.add(c);
          columnCount ++;
        } else{
          rowCount ++;
          columnCount = 1;
        }
        
        
      }catch(NoSuchElementException n){
        stop = true;
      }
    }
    return cellList;
  }












  ////////////////////////////////////////////////////////////



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

  public int getCol(int num) {
    int col = (num % 6);
    if (col == 0)
      col = 6;
    return col;
  }

  public int wrap(int num) {
    if (num > 30) {
      return num - 30;
    }
    if (num < 1) {
      return 30 - Math.abs(num);
    }
    return num;
  }
  
  //add scanner parameter
  public ArrayList<Cell> isWrappedAjacent(Cell c){
    //Scanner delim = s.useDelimiter("[,\r\n]");
    int value = c.getValue();
    ArrayList<Cell> neighbors = new ArrayList<Cell>();
    int[] cellValues = new int[6];
    cellValues[0] = getDown(value);
    cellValues[1]= getDownLeft(value);
    cellValues[2]= getDownRight(value);
    cellValues[3]= getUp(value);
    cellValues[4] = getUpLeft(value);
    cellValues[5] = getUpRight(value);
    for(int i = 0; i < cellValues.length; i++){
      Cell w = new Cell();
      w.setValue(cellValues[i]);
      //add columns and rows values for cells 
      neighbors.add(w);
    }
    return neighbors;
  }
}