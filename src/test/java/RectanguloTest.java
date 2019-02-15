import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RectanguloTest {
    @Test
    public void havingRectangleBaseNegativeThrowsAFigureElementNegativeException() {
        //Arrange
        double base = -1.0;
        double height = 5.0;
        //Act
        Rectangulo rectangle = new Rectangulo(base, height);
        //Assert
        Assertions.fail();
    }

    @Test
    public void havingRectanguloHeightNegativeThrowsAFigureElementNegativeException() {
        //Arrange
        double base = 1.0;
        double height = -5.0;
        //Act
        Rectangulo rectangle = new Rectangulo(base, height);
        //Assert
        Assertions.fail();
    }

    @Test
    public void calculateAreaWithPositiveSideOk() {
        //Arrange
        double base = 1.0;
        double height = 5.0;
        //Act
        Rectangulo rectangle = new Rectangulo(base, height);
        double result = rectangle.getArea();
        //Asserts
        Assertions.assertEquals(5.0, result);
    }

    @Test
    public void calculatePerimeterWithPositiveSideOk() {
        //Arrange
        double base = 1.0;
        double height = 5.0;
        //Act
        Rectangulo rectangle = new Rectangulo(base, height);
        double result = rectangle.getPerimetro();
        //Asserts
        Assertions.assertEquals(12.0, result);
    }
}
