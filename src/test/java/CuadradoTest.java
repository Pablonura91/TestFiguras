import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CuadradoTest {
    @Test
    public void havingSquareSideNegativeThrowsAFigureElementNegativeException() throws FigureElementNegativeException {
        //Arrange
        double side = -1.0;
        try {
            //Act
            Cuadrado cuadrado = new Cuadrado(side);
            //Assert
            Assertions.fail("Figure Element Negative Exception not thrown");
        } catch (FigureElementNegativeException ignored) {}
    }
    @Test
    public void calculateAreaWithPositiveSideOk() throws FigureElementNegativeException {
        //Arrange
        double side = 5.0;
        //Act
        Cuadrado cuadrado = new Cuadrado(side);
        double result = cuadrado.getArea();
        //Asserts
        Assertions.assertEquals(25.0, result);
    }

    @Test
    public void calculatePerimeterWithPositiveSideOk() throws FigureElementNegativeException {
        //Arrange
        double side = 5.0;
        //Act
        Cuadrado cuadrado = new Cuadrado(side);
        double result = cuadrado.getPerimetro();
        //Asserts
        Assertions.assertEquals(20.0, result);
    }
}
