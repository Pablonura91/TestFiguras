import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CompareOperationTest {
    @Test
    public void testAddingByZeroDoesNothing(){
        //Arrange
        Comparador io = new Comparador();
        //Act
        int r = io.compararArea(new Circulo(2.0, 3.0), new Cuadrado(4.0, 5.0));
        int r2 = io.compararPerimetros(new Circulo(2.0, 3.0), new Cuadrado(4.0, 5.0));

        //Assert
        Assertions.assertEquals(1, r);
    }

}
