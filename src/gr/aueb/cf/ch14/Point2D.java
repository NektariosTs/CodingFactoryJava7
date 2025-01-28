package gr.aueb.cf.ch14;

public class Point2D extends Point {
    private double y;

    public Point2D() {
//        super(); // ws prwth entolh prepei na kalei ton default constructor ths point(super klashs).
//        y = 0;

    }

    public Point2D(double x, double y) {
        super(x); //kalei ton uperfortomeno constructor ths Point, AN DEN kalesoume ton default costructor prepei emeis na dhlwsoume tox
//        setX(x);
        this.y = y;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return super.toString() + "(" + y + ")";
    }

    //    @Override
//    public String pointToString() {
//        return super.pointToString() + "(" + y + ")";
//    }

    //Liskov substitution principle
    @Override
    public void movePlus10() {
        super.movePlus10();
        y += 10;
    }

    @Override
    protected void movePluOne() {
        super.movePluOne();
        y += 1;
    }
}
