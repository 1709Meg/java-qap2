public class MyCircle {
    private MyPoint center = new MyPoint(0, 0);
    private int radius = 1;

    public MyCircle() {
        this.center = new MyPoint(0, 0);
        this.radius = 1;

    }

    public MyCircle(int x, int y, int radius) {
        this.center = new MyPoint(x, y);
        this.radius = radius;
    }

    public MyCircle(MyPoint center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public MyPoint getCenter() {
        return this.center;
    }

    public void setCenter(MyPoint center) {
        this.center = center;
    }

    public int getCenterX() {
        return this.center.getX();
    }

    public void setCenterX(int x) {
        this.center.setX(x);
    }

    public int getCenterY() {
        return this.center.getY();
    }

    public void setCenterY(int y) {
        this.center.setY(y);
    }

    public int[] getCenterXY() {
        int[] XY = new int[2];
        XY[0] = this.center.getX();
        XY[1] = this.center.getY();
        return XY;
    }

    public void setCenterXY(int x, int y) {
        this.center.setXY(x, y);
    }

    public String toString() {
        return ("Center = " + this.center + " with radius = " + this.radius);
    }

    public double getArea() {
        return (Math.PI * this.radius * this.radius);

    }

    public double getCircumference() {
        return (2 * Math.PI * this.radius);
    }

    public double distance(MyCircle another) {
        return (this.center.distance(another.center));
    }
}
