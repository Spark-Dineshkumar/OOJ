abstract class Shape {
    int l = 2;
    int b = 3;

    abstract void printArea();
}

class Rectangle extends Shape {
    void printArea() {
        System.out.println("Area of rectangle is: " + (l * b));
    }
}

class Triangle extends Shape {
    void printArea() {
        System.out.println("Area of Triangle is: " + (l * b) / 2);
    }
}

class Circle extends Shape {
    void printArea() {
        System.out.println("Area of Circle is: " + (3.14 * l * l));
    }
}

public class Run {
    public static void main(String[] args) {
        Shape r = new Rectangle();
        r.printArea();

        Shape t = new Triangle();
        t.printArea();

        Shape c = new Circle();
        c.printArea();
    }
}