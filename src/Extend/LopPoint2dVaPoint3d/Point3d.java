package Extend.LopPoint2dVaPoint3d;

public class Point3d extends Point2d{
     private float z ;

    public Point3d() {
    }

    public Point3d(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    //*
    public void setXYZ(float x ,float y , float z){
         this.z = z;
         this.setX(x);
         this.setY(y);
    }
    public float[] getXYZ(){
        float arr[] = new float[3];
        arr[0] = this.getX();
        arr[1] = this.getY();
        arr[2] = this.z;
        return arr;
    }

    @Override
    public String toString() {
        return  super.toString()+"Point3d{" +
                "z=" + z +
                '}';
    }
}
