import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CompareOperationTest {
    private Comparador comparador = new Comparador();

    @Test
    public void ifFirstFigureAreaIsGreaterThanSecondOneReturnOne() throws FigureElementNegativeException {
        //Arrange
        Circulo circulo = new Circulo(10);
        Rectangulo rectangulo = new Rectangulo(10, 20);
        //Act
        int result = comparador.compararArea(circulo, rectangulo);
        //Asserts
        Assertions.assertEquals(1, result);
    }

    @Test
    public void ifFirstFigureAreaIsLowerThanSecondOneReturnNegativeOne() throws FigureElementNegativeException {
        //Arrange
        Rectangulo rectangulo = new Rectangulo(10, 20);
        Cuadrado cuadrado = new Cuadrado(40);
        //Act
        int result = comparador.compararArea(rectangulo, cuadrado);
        //Asserts
        Assertions.assertEquals(-1, result);
    }

    @Test
    public void ifFirstFigurePerimeterIsGreaterThanSecondOneReturnOne() throws FigureElementNegativeException {
        //Arrange
        Circulo circulo = new Circulo(10);
        Rectangulo rectangulo = new Rectangulo(10, 20);
        //Act
        int result = comparador.compararPerimetros(circulo, rectangulo);
        //Asserts
        Assertions.assertEquals(1, result);
    }

    @Test
    public void ifFirstFigurePerimeterIsLowerThanSecondOneReturnIntegerNegativeOne() throws FigureElementNegativeException {
        //Arrange
        Rectangulo rectangulo = new Rectangulo(10, 20);
        Cuadrado cuadrado = new Cuadrado(40);
        //Act
        int result = comparador.compararPerimetros(rectangulo, cuadrado);
        //Asserts
        Assertions.assertEquals(-1, result);
    }

    @Test
    public void ifFirstFigureAreaIsEqualToSecondOneReturnZero() throws FigureElementNegativeException {
        //Arrange
        Rectangulo rectangulo = new Rectangulo(800, 2);
        Cuadrado cuadrado = new Cuadrado(40);
        //Act
        int result = comparador.compararArea(rectangulo, cuadrado);
        //Asserts
        Assertions.assertEquals(0, result);
    }

    @Test
    public void ifFirstFigurePerimeterIsEqualToSecondOneItShouldReturnIntegerZero() throws FigureElementNegativeException {
        //Arrange
        Rectangulo rectangulo = new Rectangulo(40, 40);
        Cuadrado cuadrado = new Cuadrado(40);
        //Act
        int result = comparador.compararPerimetros(rectangulo, cuadrado);
        //Asserts
        Assertions.assertEquals(0, result);
    }

}
