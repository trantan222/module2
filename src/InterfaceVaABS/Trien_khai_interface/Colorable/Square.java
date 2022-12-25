package InterfaceVaABS.Trien_khai_interface.Colorable;

public class Square extends Shape implements Colorable {
    private double doDai;

    public Square() {
    }

    public Square(double doDai) {
        this.doDai = doDai;
    }

    public Square(String color, boolean filled, double doDai) {
        super(color, filled);
        this.doDai = doDai;
    }

    public double getDoDai() {
        return doDai;
    }

    public void setDoDai(double doDai) {
        this.doDai = doDai;
    }


    public String toString() {
        return super.toString()+ ", Square{" +
                "doDai=" + doDai +
                '}';
    }
    @Override
    public void howToColor() {
        System.out.println("Color all four sides..");
    }
}
