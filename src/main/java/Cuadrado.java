public class Cuadrado implements Figura {
    private Double base;

    public Cuadrado(double base) throws FigureElementNegativeException {
        if (base > 0) this.base = base;
        else {
            throw new FigureElementNegativeException("Cuadrado's base cannot be a negative number");
        }
    }

    public double getArea() {
        return Math.pow(base, 2);
    }

    public double getPerimetro() {
        return base * 4;
    }
}
