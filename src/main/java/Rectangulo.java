public class Rectangulo implements Figura {
    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        if (base <= 0 || altura <= 0) throw new IllegalArgumentException("You cannot have any Rectangle's component equal or smaller than zero");
        this.base = base;
        this.altura = altura;
    }
    
    public double getArea() {
        double area = base * altura;
        if(area == Double.POSITIVE_INFINITY) throw new ArithmeticException("Double Overflow");
        return area;
    }

    public double getPerimetro() {
        double perimetro = 2*(base + altura);
        if(perimetro == Double.POSITIVE_INFINITY) throw new ArithmeticException("Double Overflow");
        return perimetro;
    }
}
