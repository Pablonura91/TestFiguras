public class Cuadrado implements Figura {
    private Double base;

    public Cuadrado(double base) {
        if (base <= 0) throw new IllegalArgumentException("");
        this.base = base;

    }

    public double getArea() {
        double area = Math.pow(base, 2);
        if (area == Double.POSITIVE_INFINITY) throw new ArithmeticException("Double Overflow");
        return area;
    }

    public double getPerimetro() {
        double perimeter = base * 4;
        if (perimeter == Double.POSITIVE_INFINITY) throw new ArithmeticException("Double Overflow");
        return perimeter;
    }
}
