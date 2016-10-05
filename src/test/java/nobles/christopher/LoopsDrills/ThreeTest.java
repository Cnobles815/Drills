package nobles.christopher.LoopsDrills;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by christophernobles on 10/5/16.
 */
public class ThreeTest {

    @Test
    public void squaresTEST(){
        Three three = new Three();
        String expectedValue = "1\n4\n9\n16\n25\n36\n49\n64\n81\n100\n";
        String actualValue = three.squares(100);
        assertEquals("The value should be" , expectedValue, actualValue);

    }

}
