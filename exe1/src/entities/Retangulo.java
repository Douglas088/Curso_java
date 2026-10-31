package entities;

public class Retangulo {
    double b;
    double h;

    public Retangulo(double b, double h) {
        this.b = b;
        this.h = h;
    }

    public double area() {
        double a = b * h;
        return a;
    }

    public double perimetro() {
        double p = 2 * (b + h);
        return p;
    }

    public double diagonal() {
        double d = Math.sqrt(Math.pow(b,2) + Math.pow(h,2));
        return d;
    }


}
