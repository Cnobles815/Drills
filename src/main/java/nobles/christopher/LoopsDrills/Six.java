package nobles.christopher.LoopsDrills;

/**
 * Created by christophernobles on 10/5/16.
 */
public class Six {
    public String powers(int input){
        String result = "";
        int twoBase = 2;
        for (int i = 0; i < input; i++){
            result += (int) Math.pow(twoBase, i) + "\n";
        }

        return result;

    }
}
