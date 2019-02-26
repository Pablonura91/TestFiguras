import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CuadradoTest {
    @Test
    public void havingSquareSideNegativeOrEqualToZeroThrowsAnIllegalArgumentException() {
        //Arrange
        double side = 0.0;
        try {
            //Act
            Cuadrado cuadrado = new Cuadrado(side);
            //Assert
            Assertions.fail("Figure Element Negative Exception not thrown");
        } catch (IllegalArgumentException ignored) {}
    }
    @Test
    public void calculateAreaWithPositiveSideOk()  {
        //Arrange
        double side = 5.0;
        //Act
        Cuadrado cuadrado = new Cuadrado(side);
        double result = cuadrado.getArea();
        //Asserts
        Assertions.assertEquals(25.0, result);
    }

    @Test
    public void calculatePerimeterWithPositiveSideOk()  {
        //Arrange
        double side = 5.0;
        //Act
        Cuadrado cuadrado = new Cuadrado(side);
        double result = cuadrado.getPerimetro();
        //Asserts
        Assertions.assertEquals(20.0, result);
    }

    @Test
    public void testOverrideArea() {
        //Arrange
        double side= Double.MAX_VALUE;
        try {
            //Act
            Cuadrado cuadrado = new Cuadrado(side);
            double result = cuadrado.getArea();
            //Assertions
            Assertions.fail("Side Maxim double value doesn't throw exception");
        }catch(ArithmeticException ignored) {}
    }

    @Test
    public void testOverridePerimeter() {
        //Arrange
        double side = Double.MAX_VALUE;
        try {
            //Act
            Cuadrado cuadrado = new Cuadrado(side);
            double result = cuadrado.getPerimetro();
            //Assertions
            Assertions.fail("Side Maxim double value doesn't throw exception");
        }catch(ArithmeticException ignored) {}
    }
}
