public class Cuadrado extends Figura {
    private Double base;

    public Cuadrado(double base) throws FigureElementNegativeException {
        if (base > 0) this.base = base;
        else {
            throw new FigureElementNegativeException("Cuadrado's base cannot be a negative number");
        }
    }

    @Override
    public double getArea() {
        return Math.pow(base, 2);
    }

    @Override
    public double getPerimetro() {
        return base * 4;
    }
}
