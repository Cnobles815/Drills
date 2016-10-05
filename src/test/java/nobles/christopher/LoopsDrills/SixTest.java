package nobles.christopher.LoopsDrills;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by christophernobles on 10/5/16.
 */
public class SixTest {

    @Test
    public void powersTEST(){
        Six six = new Six();
        String expectedValue = "1\n2\n4\n8\n";
        String actualValue = six.powers(4);
        assertEquals("The value should be" , expectedValue, actualValue);

    }
}
