public class Circulo extends Figura{
    private Double radio;
    public Circulo(double radio) {
        super();
        if(radio > 0) this.radio = radio;
        else try {
            throw new FigureElementNegativeException("Circle's radius cannot be a negative number");
        } catch (FigureElementNegativeException e) {
            e.printStackTrace();
        }
    }
    @Override
    public double getArea() {
        return Math.PI * (Math.pow(radio, 2));
    }

    @Override
    public double getPerimetro() {
        return 2 * Math.PI * radio;
    }
}
