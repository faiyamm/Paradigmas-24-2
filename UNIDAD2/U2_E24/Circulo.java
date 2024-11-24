package UNIDAD2.U2_E24;

public class Circulo extends Figura {
    private double base; // radio del círculo
    private double A; // area
    private double P; // perimetro


    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getA() {
        return A;
    }

    public void setA(double a) {
        A = a;
    }

    public double getP() {
        return P;
    }

    public void setP(double p) {
        P = p;
    }

    public Circulo(){
        this.base = 0;
        this.A = 0;
        this.P = 0;
    }

    public void area(){
        this.A = 3.1416 * (base * base);
    }

    public void perimetro(){
        this.P = 3.1416 * base * 2;
    }

    @Override
    public String toString() {
        return "Circulo [base=" + base + ", A=" + A + ", P=" + P + "]";
    }
}
