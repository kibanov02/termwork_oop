abstract public class OpenFigure implements IShape{
    public double square() {
        return 0;
    }
}

class Segment extends OpenFigure {

    public double length() {
        return 0;
    }

    public IShape shift(Point2D a) {
        return null;
    }

    public IShape rot(double phi) {
        return null;
    }


    public IShape symAxis(int i) {
        return null;
    }

    public boolean cross(IShape s) {
        return false;
    }
}