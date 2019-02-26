import java.awt.*;

public class Comparador {
    public static double compararArea(Figura figura1, Figura figura2) {
        return figura1.getArea() - figura2.getArea();
    }

    public static double compararPerimetro(Figura figura1, Figura figura2) {
        return figura1.getPerimetro() - figura2.getPerimetro();
    }
}
