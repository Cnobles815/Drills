package nobles.christopher.LoopsDrills;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


/**
 * Created by christophernobles on 10/5/16.
 */
public class TwoTest {

    @Test
    public void oddNumbersTEST(){
        Two two = new Two();
        String expectedValue = "1\n3\n5\n7\n9\n11\n13\n15\n17\n19\n";
        String actualValue = two.oddNumbers(20);
        assertEquals("The value should be" , expectedValue, actualValue);

    }


}
