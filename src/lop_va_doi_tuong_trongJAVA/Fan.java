package lop_va_doi_tuong_trongJAVA;

public class Fan {
    public  static final int SLOW = 1;
    public  static final int MEDIUM = 2;
    public  static final int FAST = 3;
    private int speed ;
    private boolean on;
    private double radius;
    private String color;
    public Fan(){

    }
    public Fan(int speed,boolean on,double radius,String color){
        this.speed = SLOW;
        this.on = false;
        this.radius = 5;
        this.color = "blue";
    }

    public String getColor() {
        return color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public String toStringFanisOn() {
        return "Fan is on{" +
                "speed=" + this.speed +
                ", on=" + this.on +
                ", radius=" + this.radius +
                '}';
    }

    public String toStringFanisOff() {
        return "Fan is off{" +
                " color=" + this.color +
                ", radius=" + this.radius +
                '}';
    }

    public static void main(String[] args) {
        Fan f1 = new Fan();
        f1.setSpeed(FAST);
        f1.setOn(true);
        f1.setRadius(10);
        f1.setColor("Yellow");
        System.out.println(f1.toStringFanisOn());
        Fan f2 = new Fan(MEDIUM,false,5,"Blue");
        f1.setSpeed(MEDIUM);
        f1.setOn(false);
        f1.setRadius(5);
        f1.setColor("Blue");
        System.out.println(f2.toStringFanisOff());
    }
}
