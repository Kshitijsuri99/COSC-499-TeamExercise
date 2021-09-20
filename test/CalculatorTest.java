import org.junit.Assert;

class CalculatorTest {

    @org.junit.jupiter.api.Test
    void multiply() {
        Calculator calculator = new Calculator();
        int x = 5;
        int y = 5;
        int expectedProduct = 5 * 5;
        int actualProduct = calculator.multiply(5,5);
        //We expect 25
        Assert.assertEquals(expectedProduct, actualProduct);
    }
}