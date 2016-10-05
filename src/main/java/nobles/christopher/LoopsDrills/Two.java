package nobles.christopher.LoopsDrills;

/**
 * Created by christophernobles on 10/5/16.
 */
public class Two {
    public String oddNumbers(int input){
        String result = "";

        for(int i = 0; i<20; i++){
            if (i == 1)
                result += i + "\n";
            else {
                if (i % 2 == 1) {
                    result += i + "\n";
                }
            }
        }
        return result;
    }
}
