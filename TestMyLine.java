public class TestMyLine {
    public static void main(String[] args) {

        MyLine line1 = new MyLine(1, 2, 5, 6);

        System.out.println("Line 1: " + line1);
        System.out.println("Length: " + line1.getLength());
        System.out.println("Gradient: " + line1.getGradient());

        System.out.println("Begin Point: " + line1.getBegin());
        System.out.println("End Point: " + line1.getEnd());

        System.out.println("Begin X: " + line1.getBeginX());
        System.out.println("Begin Y: " + line1.getBeginY());
        System.out.println("End X: " + line1.getEndX());
        System.out.println("End Y: " + line1.getEndY());

        int[] beginXY = line1.getBeginXY();
        System.out.println("Begin XY: (" + beginXY[0] + "," + beginXY[1] + ")");

        int[] endXY = line1.getEndXY();
        System.out.println("End XY: (" + endXY[0] + "," + endXY[1] + ")");

        line1.setBeginXY(7, 8);
        System.out.println();
        System.out.println("After setBeginXY(7, 8):");
        System.out.println("Line 1: " + line1);

        line1.setEndXY(9, 10);
        System.out.println();
        System.out.println("After setEndXY(9, 10):");
        System.out.println("Line 1: " + line1);

        line1.setBeginX(3);
        line1.setBeginY(4);
        System.out.println();
        System.out.println("After changing begin point:");
        System.out.println("Line 1: " + line1);

        MyPoint begin = new MyPoint(0, 0);
        MyPoint end = new MyPoint(10, 10);
        MyLine line2 = new MyLine(begin, end);

        System.out.println();
        System.out.println("Line 2: " + line2);
        System.out.println("Length: " + line2.getLength());
        System.out.println("Gradient: " + line2.getGradient());

        line2.setEndXY(20, 20);

        System.out.println();
        System.out.println("After changing end point:");
        System.out.println("Line 2: " + line2);
        System.out.println("Length: " + line2.getLength());
    }
}