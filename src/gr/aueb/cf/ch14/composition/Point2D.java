package gr.aueb.cf.ch14.composition;

public class Point2D {
    private Point point;
    private double y;

    public Point2D() {

    }

    public Point2D(Point point, double y) {
        this.point = point;
        this.y = y;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}
