public class Circulo extends Figura{
    private Double radio;
    
    public Circulo(double radio) throws FigureElementNegativeException {
        if(radio > 0) this.radio = radio;
        else {
            throw new FigureElementNegativeException("Circulo's radio cannot be a negative number");
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
