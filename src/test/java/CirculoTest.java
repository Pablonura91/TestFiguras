import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CirculoTest {
    
    @Test
    public void havingCirculoRadiusNegativeThrowsAFigureElementNegativeException() {
        //Arrange
        double radio = -1.0;
        //Act
        Circulo circle = new Circulo(radio);
        //Assert
        Assertions.fail();
    }
    @Test
    public void calculateAreaWithPositiveRadiusOk() {
        //Arrange
        double radio = 5.0;
        //Act
        Circulo circle = new Circulo(radio);
        double result = circle.getArea();
        //Asserts
        Assertions.assertEquals(78.53981633974483, result, 0.01);
    }

    @Test
    public void calculatePerimeterWithPositiveRadiusOk() {
        //Arrange
        double radio = 5.0;
        //Act
        Circulo circle = new Circulo(radio);
        double result = circle.getPerimetro();
        //Asserts
        Assertions.assertEquals(62.83185307179586, result, 0.01);
    }
}
