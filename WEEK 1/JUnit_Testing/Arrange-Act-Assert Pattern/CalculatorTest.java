import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void setUp() {
        // Arrange - initialize test fixture
        calculator = new Calculator();
        System.out.println("Setting up Calculator object...");
    }

    @After
    public void tearDown() {
        // Teardown - clean up after test
        calculator = null;
        System.out.println("Tearing down Calculator object...");
    }

    @Test
    public void testAddition() {
        // Act
        int result = calculator.add(5, 3);

        // Assert
        assertEquals(8, result);
    }

    @Test
    public void testSubtraction() {
        int result = calculator.subtract(10, 4);
        assertEquals(6, result);
    }

    @Test
    public void testMultiplication() {
        int result = calculator.multiply(3, 4);
        assertEquals(12, result);
    }

    @Test
    public void testDivision() {
        int result = calculator.divide(20, 5);
        assertEquals(4, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDivideByZero() {
        calculator.divide(10, 0);
    }
}
