package lab4;

/**
 * The {@code lab4.Line} class implement the {@link Draw} interface
 * <p>
 * The line vector object
 * This class provides an implementation of the {@link #draw(double, double)} method to draw a line on your canvas
 * {@link #setX(double)} and {@link #setY(double)} allows you to set the coordinates of the end of the line
 * </p>
 */

public class Line implements Draw {
    private Dot dot;
    public Line(Dot dot) {
        this.dot = dot;
    }
    LineAdapter output = new LineAdapter(new Dot());
    public void setX(double x) {
        output.setX(x);
    }
    public void setY(double y) {
        output.setY(y);
    }
    public void draw(double x, double y) {
        setX(x);
        setY(y);
        System.out.printf("Drawing a Line from (%d, %d) to (%d, %d)\n", dot.x, dot.y, output.dot.x + dot.x, output.dot.y + dot.y);

    }
}
