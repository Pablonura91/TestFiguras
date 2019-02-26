import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.awt.*;

public class RectanguloTest {
    @Test
    public void havingRectangleBaseNegativeOrEqualZeroThrowsAnIllegalArgumentException() {
        //Arrange
        double base = 0.0;
        double height = 2.0;
        try {
            //Act
            Rectangulo rectangulo = new Rectangulo(base, height);
            //Assert
            Assertions.fail("Height 0 doesn't throw exception.");
        } catch (IllegalArgumentException ignored) {}
    }

    @Test
    public void havingRectangleHeightNegativeOrEqualToZeroThrowsAnIllegalArgumentException() {
        //Arrange
        double base = 2.0;
        double height = 0.0;
        try {
            //Act
            Rectangulo rectangulo = new Rectangulo(base, height);
            //Assert
            Assertions.fail("Base 0 doesn't throw exception.");
        } catch (IllegalArgumentException ignored) {}
    }

    @Test
    public void calculateAreaWithPositiveSideOk() {
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
    public void calculatePerimeterWithPositiveSideOk()  {
        //Arrange
        double base = 1.0;
        double height = 5.0;
        //Act
        Rectangulo rectangulo = new Rectangulo(base, height);
        double result = rectangulo.getPerimetro();
        //Asserts
        Assertions.assertEquals(12.0, result);
    }

    @Test
    public void testOverridePerimeter() {
        //Arrange
        double base = Double.MAX_VALUE;
        double height = 1.0;
        try {
            //Act
            Rectangulo rectangulo = new Rectangulo(base,height);
            double result = rectangulo.getPerimetro();
            //Assertions
            Assertions.fail("Rectangulo's component double max  doesn't throw exception");
        }catch(ArithmeticException ignored) {}
    }

    @Test
    public void testOverrideArea() {
        //Arrange
        double base = Double.MAX_VALUE;
        double height = 2.0;
        try {
            //Act
            Rectangulo rectangulo = new Rectangulo(base,height);
            double result = rectangulo.getArea();
            //Assertions
            Assertions.fail("Rectangulo's component double max value doesn't throw exception");
        }catch(ArithmeticException ignored) {}
    }
}
