package lab4;

/**
 * The {@code lab4.Dot} class implement the {@link Pixels} interface
 * <p>
 * The dot vector object
 * This class provides an implementation of the {@link #setX(int)} and {@link #setY(int)} methods to set coordinates of a dot
 * {@link #draw()} allow you to draw dot on your canvas
 * {@link #getX()} and {@link #getY()}  methods give you back the coordinates of the dot
 * </p>
 */

public class Dot implements Pixels {
    int x, y;

    public void draw() {
        System.out.printf("Drawing a Point at coordinates (%d, %d)\n", x, y);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
}
