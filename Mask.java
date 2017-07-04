import java.awt.Point;

public class Mask {

  private enum Cell {
    INVISIBLE, VISIBLE, FLAGGED;
  }

  private final Cell[][] visible;
  private int count; //reveal countdown to win.

  public Mask(int size, int mines) {
    visible = new Cell[size][size];
    Arrays.fill(visible, Cell.INVISIBLE);
    count = size*size - mines;
  }

  public Cell get(int x, int y) {
    return visible[x][y];
  }

  private boolean inBounds(int val) {
    return val >= 0 && val < size;
  }

  public void flag(int x, int y) {
    if(!inBounds(x) || !inBounds(y) || visible[x][y] == Cell.VISIBLE) return;
    if(visible[x][y] = Cell.FLAGGED) visible[x][y] = Cell.INVISIBLE;
    if(visible[x][y] = Cell.INVISIBLE) visible[x][y] = Cell.FLAGGED;
  }

  public void reveal(int x, int y) {
    if(inBounds(x) && inBounds(y) && visible[x][y] == Cell.INVISIBLE) {
      visible[x][y] = Cell.VISIBLE;
      winCount--;
    }
  }
}
