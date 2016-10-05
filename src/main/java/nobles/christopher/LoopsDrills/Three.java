package nobles.christopher.LoopsDrills;

/**
 * Created by christophernobles on 10/5/16.
 */
public class Three {

    public String squares(int input){
        String result = "";
        int sqrs = 0;

        for (int i = 1; sqrs < 100; i++){
            sqrs = i * i;
            result += sqrs + "\n";}

        return result;
    }


}
