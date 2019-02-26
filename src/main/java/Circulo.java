public class Circulo implements Figura {
    private Double radio;

    public Circulo(double radio)  {
        if(radio <= 0) throw new IllegalArgumentException("Radius can't be zero or smaller");
        this.radio = radio;
    }

    public double getArea() {
        double area = Math.PI * (Math.pow(radio, 2));
        if (area == Double.POSITIVE_INFINITY) throw new ArithmeticException("Double overflow");
        return area;
    }

    public double getPerimetro() {
        double perimeter = 2 * Math.PI * radio;
        if(perimeter == Double.POSITIVE_INFINITY) throw new ArithmeticException("Double Overflow");
        return perimeter;
    }
}
