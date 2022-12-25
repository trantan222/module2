package InterfaceVaABS.Trien_khai_interface.resize;

import InterfaceVaABS.Trien_khai_interface.resize.Resizeable;
import InterfaceVaABS.Trien_khai_interface.resize.Shape;

public class Square extends Shape implements Resizeable {
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

    @Override
    public String toString() {
        return super.toString()+ ", Square{" +
                "doDai=" + doDai +
                '}';
    }
    @Override
    public void resize(double percent) {
       this.doDai += this.doDai * percent;
    }
}
