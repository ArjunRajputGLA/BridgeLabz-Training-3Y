public class Circle {
    double r;

    Circle(double r) {
        this.r = r;
    }

    void area() {
        System.out.printf("Area: %.4f\n", Math.PI * r * r);
    }

    void circumference() {
        System.out.printf("Circumference: %.4f\n", 2 * Math.PI * r);
    }

    public static void main(String[] args) {
        Circle c = new Circle(2.5);
        c.area();
        c.circumference();
    }
}
