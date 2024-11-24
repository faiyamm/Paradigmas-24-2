package UNIDAD2.U2_E24;

public class Cuadrado extends Figura {
    private double base; // lado
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


    // constructor
    public Cuadrado() {
        this.base = 0;
        this.A = 0;
        this.P = 0;
    }

    public void area(){
        A = base * base;
    }

    public void perimetro(){
        P = 4 * base;
    }

    @Override
    public String toString() {
        return "Cuadrado [base=" + base + ", A=" + A + ", P=" + P + "]";
    }
}
