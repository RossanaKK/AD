public class Main {
    public static void main(String[] args) {
        Point p1 = new Point(1.0, 2.0);
        System.out.println("P1 - X: " + p1.getX() + ", Y: " + p1.getY());
        Point p2 = new Point();
        System.out.println("P2 - X: " + p2.getX() + ", Y: " + p2.getY());
        double distance = p1.distanceTo(p2);
        System.out.println("Initial distance: " + distance);
        p2.setXY(4.0, 4.0);
        System.out.println("New P2 - X: " + p2.getX() + ", Y: " + p2.getY());
        System.out.println("New distance: " + p1.distanceTo(p2));
        Point pA = new Point(0.0, 0.0);
        Point pB = new Point(4.0, 0.0);
        Point pC = new Point(0.0, 3.0);
        Triangle myTriangle = new Triangle(pA, pB, pC);
        System.out.println("Triangle Base: " + myTriangle.baseTriangle());
        System.out.println("Triangle Height: " + myTriangle.heightTriangle());
        System.out.println("Triangle Area: " + myTriangle.areaTriangle());
        Point topLeftPoint = new Point(0.0,5.0);
        Rectangle myRectangle = new Rectangle(topLeftPoint, 5.0, 10.0);
        System.out.println("Rectangle Area: " + myRectangle.areaRectangle());
        System.out.println("Rectangle Perimeter: " + myRectangle.perimeterRectangle());
        Point pIn = new Point(3.0, 3.0);
        System.out.println("Point Inside Rectangle: " + myRectangle.contains(pIn));
        Point pOut = new Point(-1.0, 6.0);
        System.out.println("Point Inside Rectangle: " + myRectangle.contains(pOut));
    }
}
