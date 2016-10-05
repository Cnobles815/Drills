package nobles.christopher.LoopsDrills;

/**
 * Created by christophernobles on 10/5/16.
 */
public class One {

  public String oneToTen(int input){
    String response = "";
      for (int i = 1; i <= input; i++){
          response += i + "\n";
      }
      return response;
  }
}
