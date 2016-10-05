package nobles.christopher.LoopsDrills;
import java.util.Random;

/**
 * Created by christophernobles on 10/5/16.
 */
public class Four {
    public String random4(int input){
        String result = "";
        int random = (int) Math.random() * 10 + 1 ;

        for (int i = 0; i < input; i++ ){
            result += random + "\n";
        }
        return result;
    }

}
