import lab4.Dot;
import lab4.Line;

public class Main {
    public static void main(String[] args) {
        Dot dot = new Dot();
        dot.setX(5);
        dot.setY(5);
        dot.draw();
        Line line = new Line(dot);
        line.draw(11.1, 9.9);
    }
}