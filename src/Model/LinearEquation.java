package Model;

public class LinearEquation {
    private double a;
    private double b;

    public LinearEquation(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double solve() {
        if (a != 0) {
            return -b / a;
        } else {
            return Double.NaN;
        }
    }
    
}
