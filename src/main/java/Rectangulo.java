public class Rectangulo extends Figura{
    private double base;
    private double altura;

    public Rectangulo(double base, double altura) throws FigureElementNegativeException {
        if (base > 0 && altura > 0) {
            this.base = base;
            this.altura = altura;
        }
        else {
            throw new FigureElementNegativeException("You cannot have a negative base or height in a rectangle");
        }
    }


    @Override
    public double getArea() {
        return base * altura;
    }

    @Override
    public double getPerimetro() {
        return 2 * (base + altura);
    }
}
