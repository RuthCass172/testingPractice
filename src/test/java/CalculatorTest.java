import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @DisplayName("Add two numbers")
    @org.junit.jupiter.api.Test
    void add() {
        assertEquals(4, Calculator.add(2, 2));
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