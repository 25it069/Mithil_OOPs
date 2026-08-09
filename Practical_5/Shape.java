abstract class MyShape {
    abstract double area();
}

class Circle extends MyShape {
    double r;

    Circle(double r) {
        this.r = r;
    }

    double area() {
        return 3.14 * r * r;
    }
}

class Rectangle extends MyShape {
    double l, w;

    Rectangle(double l, double w) {
        this.l = l;
        this.w = w;
    }

    double area() {
        return l * w;
    }
}

class Triangle extends MyShape {
    double b, h;

    Triangle(double b, double h) {
        this.b = b;
        this.h = h;
    }

    double area() {
        return 0.5 * b * h;
    }
}

public class Shape {

    public static void main(String[] args) {

        MyShape[] shapes = {
            new Circle(5),
            new Rectangle(4, 6),
            new Triangle(10, 5)
        };

        double total = 0;
        double largest = 0;

        for (MyShape s : shapes) {

            double a = s.area();

            System.out.println("Area: " + a);

            total = total + a;

            if (a > largest) {
                largest = a;
            }
        }

        System.out.println("Total: " + total);
        System.out.println("Largest: " + largest);
    }
}