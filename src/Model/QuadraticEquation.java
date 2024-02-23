package Model;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;
    
    private Double[] roots; // Sử dụng Double để có thể chứa giá trị null
    private double delta;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.roots = solve();
        this.delta = calculateDelta();
    }

    private double calculateDelta() {
        return b * b - 4 * a * c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
        this.roots = solve(); // Recalculate roots when a changes
        this.delta = calculateDelta(); // Recalculate delta when a changes
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
        this.roots = solve(); // Recalculate roots when b changes
        this.delta = calculateDelta(); // Recalculate delta when b changes
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
        this.roots = solve(); // Recalculate roots when c changes
        this.delta = calculateDelta(); // Recalculate delta when c changes
    }

    public Double[] getRoots() {
        return roots;
    }

    public double getDelta() {
        return delta;
    }

    private Double[] solve() {
        double delta = calculateDelta();

        if (delta > 0) {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            return new Double[]{x1, x2};
        } else if (delta == 0) {
            double x = -b / (2 * a);
            return new Double[]{x};
        } else {
            return new Double[0];
        }
    }
}
