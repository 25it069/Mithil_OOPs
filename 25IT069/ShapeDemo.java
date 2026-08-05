// Abstract class
abstract class Shape {
    abstract double area();
}

// Circle class
class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}

// Rectangle class
class Rectangle extends Shape {
    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double area() {
        return length * width;
    }
}

// Triangle class
class Triangle extends Shape {
    double base, height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    double area() {
        return 0.5 * base * height;
    }
}

// Main class
public class ShapeDemo {
    public static void main(String[] args) {

        Shape[] shapes = {
            new Circle(5),
            new Rectangle(4, 6),
            new Triangle(3, 8),
            new Circle(2),
        };

        double totalArea = 0;
        double largestArea = 0;
        Shape largestShape = null;

        System.out.println("Areas of Shapes:");

        // Single loop handling all shapes using polymorphism
        for (Shape s : shapes) {
            double area = s.area();   // Polymorphic call
            System.out.printf("%s Area = %.2f%n",
                    s.getClass().getSimpleName(), area);

            totalArea += area;

            if (area > largestArea) {
                largestArea = area;
                largestShape = s;
            }
        }

        System.out.printf("%nTotal Area = %.2f%n", totalArea);
        System.out.printf("Largest Shape = %s (Area = %.2f)%n",
                largestShape.getClass().getSimpleName(), largestArea);
    }
}