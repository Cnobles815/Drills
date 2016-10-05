package nobles.christopher.LoopsDrills;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by christophernobles on 10/5/16.
 */
public class FiveTest {
    @Test
    public void evenX(){
        Five five = new Five();
        String expectedValue = "2\n4\n6\n8\n10\n12\n14\n16\n18\n20\n";
        String actualValue = five.evenX(20);
        assertEquals("The value should be" , expectedValue, actualValue);
    }
}
