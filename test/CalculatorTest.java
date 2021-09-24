import org.junit.Assert;
import org.junit.jupiter.api.Test;

class CalculatorTest {

    @Test
    void testMultiply() {
        Calculator calculator = new Calculator();
        int expectedProduct = 5 * 5;
        int actualProduct = calculator.multiply(5,5);
        //We expect 25
        Assert.assertEquals(expectedProduct, actualProduct);
    }

    @Test
    void testDivision() {
        Calculator calculator = new Calculator();
        int expectedQuotient = 10 / 5;
        int actualQuotient = calculator.division(10, 5);
        //We expect 2
        Assert.assertEquals(expectedQuotient, actualQuotient);
    }

    @Test
    void testAddition() {
        Calculator calculator = new Calculator();
        int expectedSum = 10 + 5;
        int actualSum = calculator.add(10, 5);
        //We expect 15
        Assert.assertEquals(expectedSum, actualSum);
    }

    @Test
    void testSubtraction() {
        Calculator calculator = new Calculator();
        int expectedDifference = 10 - 5;
        int actualDifference = calculator.subtract(10, 5);
        //We expect 5
        Assert.assertEquals(expectedDifference, actualDifference);
    }
}
