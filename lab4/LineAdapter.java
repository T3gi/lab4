package lab4;

/**
 * The {@code lab4.LineAdapter} class implement the {@link Pixels} interface
 * <p>
 * The adapter
 * This class provides an implementation of the {@link #setX(int)} and {@link #setY(int)} methods to set coordinates of a dot
 * or {@link #setX(double)} and {@link #setY(double)} to transform coordinates of the line from centimeters to pixels
 * </p>
 */

public class LineAdapter implements Pixels {
    Dot dot;
    public LineAdapter(Dot dot){
        this.dot = dot;
    }

    @Override
    public void setX(int x) {
        dot.setX(x);
    }
    public void setY(int y) {
        dot.setY(y);
    }

    public void setX(double x) {
        dot.setX((int)x*100);
    }
    public void setY(double y) {
        dot.setY((int)y*100);
    }
}
