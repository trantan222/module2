package lop_va_doi_tuong_trongJAVA;

public class XaydunglopQuadraticEquation {
    private double a;
    private double b;
    private double c;
    private double delta,r1,r2,r ;


    public XaydunglopQuadraticEquation(double a, double b,double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public XaydunglopQuadraticEquation() {

    }

    public double getA() {
        return a;
    }
    public double getB(){
        return b;
    }
    public double getC(){
        return c;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

    public void setA(double a){
        this.a = a;
    }
    public double getDiscriminant(){
        delta = Math.pow(this.b,2) - 4*this.a* this.c;
        return delta;
    }
    public double getRoot1(){
        r1 = (-this.b + Math.sqrt(Math.pow(this.b,2) - 4*this.a* this.c))/ 2*this.a;
        return r1;
    }
    public double getRoot2(){
        r2 = (-this.b - Math.sqrt(Math.pow(this.b,2) - 4*this.a* this.c))/ 2*this.a;
        return r2;
    }
    public double getRoot0(){
        r = -this.b/(this.a*2);
        return r;
    }
    public static void main(String[] args) {
        XaydunglopQuadraticEquation x = new XaydunglopQuadraticEquation(1,2,3);
        if(x.getDiscriminant() > 0){
            System.out.println("x1 :"+x.getRoot1());
            System.out.println("x2 :"+x.getRoot2());
        }else if(x.getDiscriminant() ==0){
            System.out.println("x1 = x2 = "+x.getRoot0());
        }else {
            System.out.println("The equation has no roots");
        }

    }
}
