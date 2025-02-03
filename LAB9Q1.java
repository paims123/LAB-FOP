package lab9q1;

class Shape {
    protected String name;
    protected double perimeter;
    protected double area;

    public Shape(String name) {
        this.name = name;
        this.perimeter = 0;
        this.area = 0;
    }

    // Accessor and Mutator for perimeter
    public double getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    // Accessor and Mutator for area
    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    // Display method
    public void display() {
        System.out.printf("Shape: %s\n", name);
        System.out.printf("Perimeter: %.2f\n", perimeter);
        System.out.printf("Area: %.2f\n", area);
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle() {
        super("Rectangle");
    }

    // Method to input side lengths
    public void inputSides(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Method to compute perimeter and area
    public void compute() {
        perimeter = 2 * (length + width);
        area = length * width;
    }
}

class Square extends Shape {
    private double side;

    public Square() {
        super("Square");
    }

    // Method to input side length
    public void inputSide(double side) {
        this.side = side;
    }

    // Method to compute perimeter and area
    public void compute() {
        perimeter = 4 * side;
        area = side * side;
    }
}

class Circle extends Shape {
    private double diameter;

    public Circle() {
        super("Circle");
    }

    // Method to input diameter
    public void inputDiameter(double diameter) {
        this.diameter = diameter;
    }

    // Method to compute perimeter and area
    public void compute() {
        perimeter = Math.PI * diameter;
        area = Math.PI * Math.pow(diameter / 2, 2);
    }
}

public class LAB9Q1 {

    public static void main(String[] args) {
        // Test Rectangle
        Rectangle rectangle = new Rectangle();
        rectangle.inputSides(5, 7);
        rectangle.compute();
        rectangle.display();

        // Test Square
        Square square = new Square();
        square.inputSide(4);
        square.compute();
        square.display();

        // Test Circle
        Circle circle = new Circle();
        circle.inputDiameter(10);
        circle.compute();
        circle.display();
    }
    
}
