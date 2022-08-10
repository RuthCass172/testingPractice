import org.junit.Assert;
import org.junit.jupiter.api.DisplayName;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

class CalculatorTest {
    //@InjectMocks annotation is used to create and inject the mock object
    @InjectMocks
    Calculator mathApplication = new Calculator();

    //@Mock annotation is used to create the mock object to be injected
    @Mock
    Calculator calc;

    @DisplayName("Add two numbers")
    @org.junit.jupiter.api.Test
    void add() {
        assertEquals(4, calc.add(2, 2));
    }

    @org.junit.jupiter.api.Test
    void multiply() {
        // assertAll executes all regard;ess if some fail
        assertAll(() -> assertEquals(4, Calculator.multiply(2, 2)),
                () -> assertEquals(-4, Calculator.multiply(2, -2)),
                () -> assertEquals(4, Calculator.multiply(-2, -2)),
                () -> assertEquals(0, Calculator.multiply(1, 0)));
    }
}