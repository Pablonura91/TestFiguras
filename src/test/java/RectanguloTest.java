import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RectanguloTest {
    @Test
    public void havingRectangleBaseNegativeThrowsAFigureElementNegativeException() throws FigureElementNegativeException {
        //Arrange
        double base = -1.0;
        double height = 5.0;
        try {
            //Act
            Rectangulo rectangulo = new Rectangulo(base, height);
            //Assert
            Assertions.fail("Figure Element Negative Exception not thrown");
        } catch (FigureElementNegativeException ignored) {}
    }

    @Test
    public void havingRectangleHeightNegativeThrowsAFigureElementNegativeException() throws FigureElementNegativeException {
        //Arrange
        double base = 1.0;
        double height = -5.0;
        try {
            //Act
            Rectangulo rectangulo = new Rectangulo(base, height);
            //Assert
            Assertions.fail("Figure Element Negative Exception not thrown");
        } catch (FigureElementNegativeException ignored) {}
    }

    @Test
    public void calculateAreaWithPositiveSideOk() throws FigureElementNegativeException {
        //Arrange
        double base = 1.0;
        double height = 5.0;
        //Act
        Rectangulo rectangulo = new Rectangulo(base, height);
        double result = rectangulo.getArea();
        //Asserts
        Assertions.assertEquals(5.0, result);
    }

    @Test
    public void calculatePerimeterWithPositiveSideOk() throws FigureElementNegativeException {
        //Arrange
        double base = 1.0;
        double height = 5.0;
        //Act
        Rectangulo rectangulo = new Rectangulo(base, height);
        double result = rectangulo.getPerimetro();
        //Asserts
        Assertions.assertEquals(12.0, result);
    }
}
