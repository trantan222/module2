package Access_modifier;

public class Circle {
    private double radius = 1;
    private String color = "Red";

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    public double getArea() {
        return radius;
    }

    public Circle() {
    }

    public static void main(String[] args) {
        Circle c = new Circle(1);
        System.out.println(c.getRadius());
    }
}
