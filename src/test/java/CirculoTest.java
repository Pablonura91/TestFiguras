import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CirculoTest {

    @Test
    public void havingCircleRadiusNegativeThrowsAFigureElementNegativeException() {
        //Arrange
        double radius = -1.0;
        try {
            //Act
            Circulo circle = new Circulo(radius);
            //Assert
            Assertions.fail("Figure Element Negative Exception not thrown");
        } catch (FigureElementNegativeException ignored) {}
    }


    @Test
    public void calculateAreaWithPositiveRadiusOk() throws FigureElementNegativeException {
        //Arrange
        double radius = 5.0;
        //Act
        Circulo circle = new Circulo(radius);
        double result = circle.getArea();
        //Asserts
        Assertions.assertEquals(78.53981633974483, result, 0.01);
    }

    @Test
    public void calculatePerimeterWithPositiveRadiusOk() throws FigureElementNegativeException {
        //Arrange
        double radius = 5.0;
        //Act
        Circulo circle = new Circulo(radius);
        double result = circle.getPerimetro();
        //Asserts
        Assertions.assertEquals(31.41592653589793, result, 0.01);
    }

}
