package nobles.christopher.LoopsDrills;

/**
 * Created by christophernobles on 10/5/16.
 */
public class Five {

    public String evenX(int input){
        String result = "";
        for(int i = 2; i <= input; i++){
            if(i % 2 == 0){
                result += i + "\n";
            }
        }
        return result;

    }
}
