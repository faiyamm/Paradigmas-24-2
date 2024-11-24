package UNIDAD2.U2_E24;

public abstract class Figura {
    private double H; // altura
    private double Base; // base o radio de la figura
    private double A; // área
    private double P; // perímetro

    // obtener altura
    public double getH() {
        return H;
    }

    // asignar altura
    public void setH(double h) {
        H = h;
    }

    // obtener base
    public double getBase() {
        return Base;
    }

    // asignar base
    public void setBase(double base) {
        Base = base;
    }

    // obtener área
    public double getA() {
        return A;
    }

    // asignar área
    public void setA(double a) {
        A = a;
    }

    // obtener perímetro
    public double getP() {
        return P;
    }

    // asignar perímetro
    public void setP(double p) {
        P = p;
    }

    // constructor por defecto
    public Figura() {
        this.H = 0;
        this.Base = 0;
        this.A = 0;
        this.P = 0;
    }

    // calcular área (definición en clases hijas)
    public void area() {
    }

    // calcular perímetro (definición en clases hijas)
    public void perimetro() {
    }
}
