class  Point {
    private int dim;
    private double[] x = new double[3];

    public Point(int dim) {
        this.dim = dim;
        for(int i = 0; i < dim; i++) {
            this.x[i] = 1;
        }
    }

    public Point(int dim, double[] x) {
        this.dim = dim;
        if (dim >= 0) System.arraycopy(x, 0, this.x, 0, dim);
    }

    public double[] getX() {
        return this.x;
    }

    public double getX(int i) {
        return this.x[i];
    }

    public void setX(double[] x) {
        this.x = x;
    }

    public void setX(double[] x, int i) {
        this.x[i] = x[i];
    }

    public double abs() {
        double res = 0;
        for (double i : x) {
            res += i * i;
        }
        return Math.sqrt(res);
    }
    static Point add(Point a, Point b) {
        //return a + b;
    }

    public Point add(Point b) {

    }

    static Point sub(Point a, Point b) {

    }

    Point sub(Point b) {

    }

    static Point mult(Point a, double r) {

    }

    Point mult(double r) {

    }

    static double mult(Point a, Point b) {

    }

    double mult(Point b) {

    }

    static
}

class Point2D extends Point {
    public Point2D(int dim) {
        super(dim);
    }

    public Point2D(int dim, double[] x) {
        super(dim, x);
    }
}

class Point3D extends Point {

    public Point3D(int dim) {
        super(dim);
    }

    public Point3D(int dim, double[] x) {
        super(dim, x);
    }
}