import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    private Calculator calculator;

    // Setup method
    @Before
    public void setUp() {
        calculator = new Calculator();
        System.out.println("Setup: Calculator object created.");
    }

    // Test using Arrange-Act-Assert (AAA)
    @Test
    public void testAdd() {

        // Arrange
        int a = 10;
        int b = 20;

        // Act
        int result = calculator.add(a, b);

        // Assert
        assertEquals(30, result);
    }

    // Teardown method
    @After
    public void tearDown() {
        System.out.println("Teardown: Test completed.");
    }
}
