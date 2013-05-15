package Cap5.SimpleDotCom;

/**
 * Created with IntelliJ IDEA.
 * User: raluca.garba
 * Date: 5/3/13
 * Time: 6:52 PM
 * To change this template use File | Settings | File Templates.
 */
public class SimpleDotCom {
    int[] locationCells;
    int numOfHits = 0;

    public void setLocationCells(int[] locs){
        locationCells = locs;
    }

    public String checkYourself(String stringGuess){
        int guess = Integer.parseInt(stringGuess);
        String result = "miss";
        for (int cell:locationCells){
            if (guess == cell){
                result = "hit";
                numOfHits++;
                break;
            }
        }   // out of the loop

        if (numOfHits == locationCells.length){
            result = "kill";
        }
        System.out.println(result);
        return result;
    }   // close method
}       //close class
