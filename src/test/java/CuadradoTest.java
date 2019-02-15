import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CuadradoTest {
    @Test
    public void havingSquareSideNegativeThrowsAFigureElementNegativeException() {
        //Arrange
        double side = -1.0;
        //Act
        Cuadrado square = new Cuadrado(side);
        //Assert
        Assertions.fail();
    }
    @Test
    public void calculateAreaWithPositiveSideOk() {
        //Arrange
        double side = 5.0;
        //Act
        Cuadrado square = new Cuadrado(side);
        double result = square.getArea();
        //Asserts
        Assertions.assertEquals(25.0, result);
    }

    @Test
    public void calculatePerimeterWithPositiveSideOk() {
        //Arrange
        double side = 5.0;
        //Act
        Cuadrado square = new Cuadrado(side);
        double result = square.getPerimetro();
        //Asserts
        Assertions.assertEquals(20.0, result);
    }
}
