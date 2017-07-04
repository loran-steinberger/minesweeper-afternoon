import java.util.Iterator;
import java.awt.Point;

public static class Neighbors implements Iterable<Point> {

  private final Point[] NEIGHBORS = new Point[]{ new Point(-1, -1),
    new Point(-1, 0), new Point(-1, 1), new Point(0, 1), new Point(0, -1),
    new Point(1, 1), new Point(1, 0), new Point(1, -1) };

  @Override
  public Iterator<Point> iterator() {
    Iterator<Point> it = new Iterator<Point>(){

      private int index = 0;

      @Override
      public boolean hasNext() {
       return index < NEIGHBORS.length;
      }

      @Override
      public Point next() {
        return NEIGHBORS[index++];
      }
    };
    return it;
  }

}
