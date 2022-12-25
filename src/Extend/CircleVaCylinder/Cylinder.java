package Extend.CircleVaCylinder;

import Extend.CircleVaCylinder.Circle;

public class Cylinder extends Circle {
    private double height;

    public Cylinder(String color, double radius,double height) {
        super(color, radius);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double theTich(){
        return this.height * this.radius * this.radius * 3.14;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                ", height=" + height +
                ", radius ="+this.getRadius()+
                " , color = "+this.getColor()+ '}';
    }
}
