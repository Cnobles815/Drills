package nobles.christopher.LoopsDrills;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by christophernobles on 10/5/16.
 */
public class FourTest {
    @Test
    public void random4TEST(){
        Four four = new Four();
        String expectedValue = "4\n4\n4\n4\n";
        String actualValue = four.random4(4);
        assertEquals("The value should be" , expectedValue, actualValue);

    }
}
