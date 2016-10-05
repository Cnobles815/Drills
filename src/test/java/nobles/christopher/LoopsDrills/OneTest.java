package nobles.christopher.LoopsDrills;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by christophernobles on 10/5/16.
 */
public class OneTest {

    @Test
    public void oneToTenTEST(){
        One one = new One();
        String expectedValue = "1" +
                "\n2" +
                "\n3" +
                "\n4" +
                "\n5" +
                "\n6" +
                "\n7" +
                "\n8" +
                "\n9" +
                "\n10\n";
        String actualValue = one.oneToTen(10);
        assertEquals("The value should be 10" , expectedValue, actualValue);



    }
}
