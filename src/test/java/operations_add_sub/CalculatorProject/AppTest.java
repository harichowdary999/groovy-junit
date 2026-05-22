package operations_add_sub.CalculatorProject;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    void testAdd(){

        App calc = new App();

        int result = calc.add(2,3);

        assertEquals(5,result);
    }

    @Test
    void testSubtract(){

        App calc = new App();

        int result = calc.subtract(2,3);

        assertEquals(-1,result);
    }
}