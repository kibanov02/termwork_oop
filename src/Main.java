import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double[] x = {1, 2, 3};
        double[] y = {4, 5, 6};
        Point p = new Point(3, x);
        p.setX(y);
        System.out.print(p.getX(1));
    }
}


