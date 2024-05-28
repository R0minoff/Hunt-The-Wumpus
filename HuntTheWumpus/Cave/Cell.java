package Cave;
// data class

public class Cell implements Comparable<Cell> {
  // properties
  private int value;
  private int column;
  private int row;

  // constructor
  public Cell() {
    this.value = 0;
    this.column = 0;
    this.row = 0;
  }

  // methods
  public int getValue() {
    return value;
  }

  public void setValue(int value) {
    this.value = value;
  }

  public int getColumn() {
    return column;
  }

  public void setColumn(int column) {
    this.column = column;
  }

  public int getRow() {
    return row;
  }

  public void setRow(int row) {
    this.row = row;
  }

  @Override
  public int compareTo(Cell otherCell){
    return Integer.compare(this.value, otherCell.value);
  }
}