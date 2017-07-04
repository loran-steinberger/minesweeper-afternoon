import java.util.Random;
import java.util.Arrays;
import java.awt.Point;

public class Board {

  private enum Cell {
    MINE(-1), ZERO(0), ONE(1), TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6),
    SEVEN(7), EIGHT(8);

    private int value;

    public Cell(value) {
      this.value = value;
    }

    public void increment(){
      if(this == Cell.MINE) return;
      else this.value++;
    }
  }
  
  private Cell[][] board; //holds actual values

  public Board(int size, int mines){
    board = new Cell[size + 2][size + 2]; // avoids bound exceptions
    Arrays.fill(board, Cell.EMPTY);
    Random generator = new Random();
    for(int mine = 0; mine < mines; mine++) {
      int x = generator.nextInt(size) + 1;
      int y = generator.nextInt(size) + 1;
      setMine(x, y);
    }
  }

  public Cell get(int x, int y, Point p) {
    return board[x + (int)point.getX()][y + (int)point.getY()];
  }

  public Cell get(int x, int y) {
    return board[x][y];
  }

  public void setMine(int x, int y){
      board[x][y] = Cell.MINE;
      for (Point point : Neighbors.iterator()) {
        get(x, y, point).increment();
      }
  }
}
