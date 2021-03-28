class  Point {
    private int dim;
    private double[] x = new double[3];

    public Point(int dim, int[] ints) {
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
        return x;
    }

    public double getX(int i) {
        return x[i];
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
        int dim = Math.min(a.dim, b.dim);
        double[] x = new double[dim];
        for (int i = 0; i < dim; i++) {
            x[i] = a.x[i] + b.x[i];
        }
        return new Point(x.length, x);
    }

    public Point add(Point b) {
        int mindim = Math.min(dim, b.dim);
        double[] y = new double[mindim];
        for (int i = 0; i < mindim; i++) {
            y[i] = x[i] + b.x[i];
        }
        return new Point(y.length, y);
    }

    static Point sub(Point a, Point b) {
        int dim = Math.min(a.dim, b.dim);
        double[] x = new double[dim];
        for (int i = 0; i < dim; i++) {
            x[i] = a.x[i] - b.x[i];
        }
        return new Point(x.length, x);
    }

    Point sub(Point b) {
        int mindim = Math.min(dim, b.dim);
        double[] y = new double[mindim];
        for (int i = 0; i < mindim; i++) {
            y[i] = x[i] - b.x[i];
        }
        return new Point(y.length, y);
    }

    static Point mult(Point a, double r) {
        double[] x = new double[a.dim];
        for (int i = 0; i < a.dim; i++) {
            x[i] = a.x[i] * r;
        }
        return new Point(x.length, x);
    }

    Point mult(double r) {
        double[] y = new double[dim];
        for (int i = 0; i < dim; i++) {
            y[i] = x[i] * r;
        }
        return new Point(y.length, y);
    }

    static double mult(Point a, Point b) {
        int dim = Math.min(a.dim, b.dim);
        int res = 0;
        for (int i = 0; i < dim; i++) {
            res += a.x[i] * b.x[i];
        }
        return res;
    }

    double mult(Point b) {
        int mindim = Math.min(dim, b.dim);
        int res = 0;
        for (int i = 0; i < mindim; i++) {
            res += x[i] * b.x[i];
        }
        return res;
    }

    static Point symAxis(Point a, int i) {
        double[] y = new double[a.dim];
        for (int k = 0; k < a.x.length; k++) {
            if(k != i)
                y[k] = a.x[k] * -1;
        }
        return new Point(y.length, y);
    }

    Point symAxis(int i) {
        double[] y = new double[dim];
        for (int k = 0; k < x.length; k++) {
            if(k != i)
                y[k] = x[k] * -1;
        }
        return new Point(y.length, y);
    }

//    String toString(){
//
//    }
}

/*
class Point2D extends Point {
    public Point2D() {

    }

    public Point2D(double[] x) {
        super(dim, x);
        new Point(2, x);
    }
}

class Point3D extends Point {
    public Point3D(int dim) {
        super(dim);
        double[]x = new double[]{0, 0, 0};
        new Point(dim, x);
    }

    public Point3D(int dim, double[] x) {
        super(dim, x);
        new Point(dim, x);
    }
}

 */