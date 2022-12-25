package Extend.CircleVaCylinder;

public class Circle {
    public double radius;
    public String color;

    public Circle(String color,double radius) {
        this.color = color;
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public double dienTich(){
        double dienTich = Math.pow(radius,2) * 3.14;
        return dienTich;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
}
