abstract class Shape {

    abstract double getPerimeter();

    abstract double getArea();
}
class Triangle extends Shape {
    private final double a, b, c;


    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    /**
     * @return perimeter
     */
    @Override
    double getPerimeter() {
        return a + b + c;
    }

    /**
     * @return area
     */
    @Override
    double getArea() {

        double s = getPerimeter() / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}

class Rectangle extends Shape {
    private final double a, b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    /**
     * @return perimeter
     */
    @Override
    double getPerimeter() {
        return a * 2 + b * 2;
    }

    /**
     * @return area
     */
    @Override
    double getArea() {
        return a * b;
    }
}

class Circle extends Shape {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    /**
     * @return circumference
     */
    @Override
    double getPerimeter() {
        return  2 * Math.PI * radius;
    }

    /**
     * @return area
     */
    @Override
    double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}