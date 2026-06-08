public class TestMyRectangle {

    public static void main(String[] args) {

        MyPoint topLeft = new MyPoint(2, 8);
        MyPoint bottomRight = new MyPoint(10, 2);

        MyRectangle rect = new MyRectangle(topLeft, bottomRight);

        System.out.println(rect);
        System.out.println("Width: " + rect.getWidth());
        System.out.println("Height: " + rect.getHeight());
        System.out.println("Area: " + rect.getArea());
        System.out.println("Perimeter: " + rect.getPerimeter());
    }
}
