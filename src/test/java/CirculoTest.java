import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CirculoTest {

    @Test
    public void havingCircleRadiusNegativeOrEqualToZeroThrowsAnIllegalArgumentException() {
        //Arrange
        double radius = 0.0;
        try {
            //Act
            Circulo circulo = new Circulo(radius);
            //Assert
            Assertions.fail("Radius 0 doesn't throw exception.");
        } catch (IllegalArgumentException ignored) {}
    }


    @Test
    public void calculateAreaWithPositiveRadiusOk() {
        //Arrange
        double radius = 2.0;
        //Act
        Circulo circulo = new Circulo(radius);
        double result = circulo.getArea();
        //Asserts
        Assertions.assertEquals(12.566370614359172, result, 0.01);
    }

    @Test
    public void calculatePerimeterWithPositiveRadiusOk() {
        //Arrange
        double radius = 2.0;
        //Act
        Circulo circulo = new Circulo(radius);
        double result = circulo.getPerimetro();
        //Asserts
        Assertions.assertEquals(12.566370614359172, result, 0.01);
    }

    @Test
    public void testOverrideArea() {
        //Arrange
        double radius = Double.MAX_VALUE;
        try {
            //Act
            Circulo circulo = new Circulo(radius);
            double result = circulo.getArea();
            //Assertions
            Assertions.fail("Radius Maxim double value doesn't throw exception");
        }catch(ArithmeticException ignored) {}
    }

    @Test
    public void testOverridePerimeter() {
        //Arrange
        double radius = Double.MAX_VALUE;
        try {
            //Act
            Circulo circulo = new Circulo(radius);
            double result = circulo.getPerimetro();
            //Assertions
            Assertions.fail("Radius Maxim double value doesn't throw exception");
        }catch(ArithmeticException ignored) {}
    }


}
