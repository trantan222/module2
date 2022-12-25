package Extend.LopPoint2dVaPoint3d;

public class Point2d {
    private  float x,y = 0.0f;
//    public float arr [] = new float[2];
    public Point2d() {
    }

    public Point2d(float x,float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    public void setXY(float x,float y){
        this.x = x;
        this.y =y;
    }
    //*
    public float[] getXY() {
        float arr[] = new float[2];
        arr[0] = this.x;
        arr[1] = this.y;
       return arr;
    }
    @Override
    public String toString() {
        return "Point2d{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
