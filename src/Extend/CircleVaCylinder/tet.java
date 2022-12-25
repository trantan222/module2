package Extend.CircleVaCylinder;

import Extend.CircleVaCylinder.Circle;
import Extend.CircleVaCylinder.Cylinder;

public class tet {
    public static void main(String[] args) {
        Circle c = new Circle("Yellow",4);
        System.out.println("Hinh Tron : "+c.toString() );
        System.out.println("Dien tich : "+c.dienTich());
      Cylinder c2 = new Cylinder("Red",5,10);
        System.out.println("Hình Trụ : "+c2.toString());
        System.out.println("thể tích hình trụ : "+c2.theTich());
    }
}
