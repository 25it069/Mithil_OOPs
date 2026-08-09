import java.util.Objects;

public class Point {

    private int x;
    private int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    public boolean equals(Object obj) {
        Point p = (Point) obj;

        return x == p.x && y == p.y;
    }

    public int hashCode() {
        return Objects.hash(x, y);
    }

    public static void main(String[] args) {

        Point[] points = {
            new Point(1, 2),
            new Point(3, 4),
            new Point(1, 2),
            new Point(5, 6),
            new Point(3, 4)
        };

        int count = 0;

        for (int i = 0; i < points.length; i++) {

            boolean repeated = false;

            for (int j = 0; j < i; j++) {

                if (points[i].equals(points[j])) {
                    repeated = true;
                    break;
                }
            }

            if (!repeated) {
                count++;
            }
        }

        System.out.println("Distinct: " + count);
    }
}