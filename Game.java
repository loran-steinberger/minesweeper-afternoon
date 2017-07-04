
public class Game {

  private enum Level {
    EASY(10, 10), MEDIUM(20, 20), HARD(100, 50);

    private int mines;
    private int size;

    private Level(int size, int mines) {
      this.size = size;
      this.mines = mines;
    }
  }

  private enum State {
    WIN, LOSE, PLAY;
  }

  private Mask mask;
  private Board board;

  public Game(Level level) {
    this.mask = new Mask(level.size, level.mines);
    this.board = new Board(level.size, level.mines);
  }

  public void click(int x, int y) {
    Mask.Cell mc = mask.get(x, y);
    if(mc != Mask.Cell.INVISIBLE) return;
    Board.Cell bc = board.get(x, y);

  }
}
