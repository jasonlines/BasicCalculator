import org.example.Calculator;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Assertions;

public class TestCalculator {
    @Test
    @DisplayName("Testing the addition method")
    public void testAddition() {
        int result = Calculator.addition(5, 4);
        Assertions.assertEquals(9, result);
    }

    @Test
    @DisplayName("Testing the subtraction method")
    public void testSubtraction(){
        int result = Calculator.subtraction(5,4);
        Assertions.assertEquals(1, result);
    }
    
    @Test
    @DisplayName("Testing the multiplicatoin method")
    public void testMultiplication(){
        int result = Calculator.multiplication(5,4);
        Assertions.assertEquals(20, result);
    }
    
}
