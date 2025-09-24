public class TestShape {
    public static void main(String[] args) {
        // Test Shape class
        Shape shape1 = new Shape();
        System.out.println("Shape 1: " + shape1.toString());
        System.out.println("Color: " + shape1.getColor());
        System.out.println("Filled: " + shape1.isFilled());

        Shape shape2 = new Shape("blue", false);
        System.out.println("\nShape 2: " + shape2.toString());
        shape2.setColor("green");
        shape2.setFilled(true);
        System.out.println("After modification: " + shape2.toString());

        // Test CircleShape class (note: using CircleShape instead of Circle)
        CircleShape circle1 = new CircleShape();
        System.out.println("\nCircle 1: " + circle1.toString());
        System.out.println("Area: " + circle1.getArea());
        System.out.println("Perimeter: " + circle1.getPerimeter());

        CircleShape circle2 = new CircleShape(2.5);
        System.out.println("\nCircle 2: " + circle2.toString());
        System.out.println("Area: " + circle2.getArea());
        System.out.println("Perimeter: " + circle2.getPerimeter());

        CircleShape circle3 = new CircleShape(3.0, "yellow", false);
        System.out.println("\nCircle 3: " + circle3.toString());
        circle3.setRadius(4.0);
        System.out.println("After setting radius to 4.0: " + circle3.toString());

        // Test Rectangle class
        Rectangle rect1 = new Rectangle();
        System.out.println("\nRectangle 1: " + rect1.toString());
        System.out.println("Area: " + rect1.getArea());
        System.out.println("Perimeter: " + rect1.getPerimeter());

        Rectangle rect2 = new Rectangle(2.0, 3.0);
        System.out.println("\nRectangle 2: " + rect2.toString());
        System.out.println("Width: " + rect2.getWidth());
        System.out.println("Length: " + rect2.getLength());
        System.out.println("Area: " + rect2.getArea());
        System.out.println("Perimeter: " + rect2.getPerimeter());

        Rectangle rect3 = new Rectangle(3.0, 4.0, "cyan", true);
        System.out.println("\nRectangle 3: " + rect3.toString());
        rect3.setWidth(5.0);
        rect3.setLength(6.0);
        System.out.println("After changing dimensions: " + rect3.toString());

        // Test Square class
        Square square1 = new Square();
        System.out.println("\nSquare 1: " + square1.toString());
        System.out.println("Side: " + square1.getSide());
        System.out.println("Area: " + square1.getArea());
        System.out.println("Perimeter: " + square1.getPerimeter());

        Square square2 = new Square(2.5);
        System.out.println("\nSquare 2: " + square2.toString());
        System.out.println("Area: " + square2.getArea());

        Square square3 = new Square(3.0, "purple", false);
        System.out.println("\nSquare 3: " + square3.toString());

        // Test setWidth and setLength for Square (should maintain square geometry)
        System.out.println("\nTesting Square geometry maintenance:");
        square2.setWidth(4.0);
        System.out.println("After setWidth(4.0): " + square2.toString());
        System.out.println("Width: " + square2.getWidth() + ", Length: " + square2.getLength());

        square2.setLength(5.0);
        System.out.println("After setLength(5.0): " + square2.toString());
        System.out.println("Width: " + square2.getWidth() + ", Length: " + square2.getLength());

        square2.setSide(6.0);
        System.out.println("After setSide(6.0): " + square2.toString());
        System.out.println("Width: " + square2.getWidth() + ", Length: " + square2.getLength());
    }
}