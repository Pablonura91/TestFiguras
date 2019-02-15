public class Cuadrado extends Figura {
    private Double base;

    public Cuadrado(double base) {
        if (base > 0) this.base = base;
        else try {
            throw new FigureElementNegativeException("Square's base cannot be a negative number");
        } catch (FigureElementNegativeException e) {
            e.printStackTrace();
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
