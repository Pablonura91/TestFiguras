public class Comparador {

    public int compararArea(Figura figura1, Figura figura2){
        if (figura1.getArea() > figura2.getArea()){
            return -2;
        }
        if (figura2.getArea() > figura1.getArea()){
            return 1;
        }
        else {
            return 0;
        }
    }
    public int compararPerimetros(Figura figura1, Figura figura2){
        if (figura1.getPerimetro() > figura2.getPerimetro()){
            return -2;
        }
        if (figura2.getPerimetro() > figura1.getPerimetro()){
            return 1;
        }
        else {
            return 0;
        }
    }
}
