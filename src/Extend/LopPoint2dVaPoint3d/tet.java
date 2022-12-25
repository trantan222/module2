package Extend.LopPoint2dVaPoint3d;

import java.util.Arrays;

public class tet {
    public static void main(String[] args) {
        Point2d p1 = new Point2d();
        Point3d p2 = new Point3d(3f,5f,8f);
        System.out.println(Arrays.toString(p1.getXY()));
        System.out.println(p2.toString());
        System.out.println(p1.toString());
        System.out.println(Arrays.toString(p2.getXYZ()));
    }
}
