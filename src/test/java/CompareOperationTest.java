import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CompareOperationTest {
    @Test
    public void ifFirstFigureAreaIsGreaterThanSecondOneReturnNumberGreaterThanZero() {
        //Arrange
        Figura s1 = mock(Figura.class);
        Figura s2 = mock(Figura.class);

        when(s1.getArea()).thenReturn(10.0);
        when(s2.getArea()).thenReturn(1.0);

        //Act
        double value = Comparador.compararArea(s1,s2);
        //Asserts
        Assertions.assertTrue(value > 0);
    }

    @Test
    public void ifFirstFigureAreaIsLowerThanSecondOneReturnNumberNegative() {
        //Arrange
        Figura s1 = mock(Figura.class);
        Figura s2 = mock(Figura.class);

        when(s1.getArea()).thenReturn(1.0);
        when(s2.getArea()).thenReturn(10.0);

        //Act
        double value = Comparador.compararArea(s1,s2);
        //Asserts
        Assertions.assertTrue(value < 0);
    }


    @Test
    public void ifFirstFigureAreaIsEqualToSecondOneReturnZero() {
        //Arrange
        Figura s1 = mock(Figura.class);
        Figura s2 = mock(Figura.class);

        when(s1.getArea()).thenReturn(10.0);
        when(s2.getArea()).thenReturn(10.0);

        //Act
        double value = Comparador.compararArea(s1,s2);
        //Asserts
        Assertions.assertTrue(value == 0);
    }


    @Test
    public void ifFirstFigurePerimeterIsGreaterThanSecondOneReturnNumberGreaterThanZero()  {
        //Arrange
        Figura s1 = mock(Figura.class);
        Figura s2 = mock(Figura.class);

        when(s1.getPerimetro()).thenReturn(10.0);
        when(s2.getPerimetro()).thenReturn(1.0);

        //Act
        double value = Comparador.compararPerimetro(s1,s2);
        //Asserts
        Assertions.assertTrue(value > 0);
    }

    @Test
    public void ifFirstFigurePerimeterIsLowerThanSecondOneReturnNegativeNumber() {
        //Arrange
        Figura s1 = mock(Figura.class);
        Figura s2 = mock(Figura.class);

        when(s1.getPerimetro()).thenReturn(1.0);
        when(s2.getPerimetro()).thenReturn(10.0);

        //Act
        double value = Comparador.compararPerimetro(s1,s2);

        //Asserts
        Assertions.assertTrue(value < 0);
    }


    @Test
    public void ifFirstFigurePerimeterIsEqualToSecondOneReturnNumberZero() {
        //Arrange
        Figura s1 = mock(Figura.class);
        Figura s2 = mock(Figura.class);

        when(s1.getPerimetro()).thenReturn(10.0);
        when(s2.getPerimetro()).thenReturn(10.0);

        //Act
        double value = Comparador.compararPerimetro(s1,s2);
        //Asserts
        Assertions.assertTrue(value == 0);
    }
}
