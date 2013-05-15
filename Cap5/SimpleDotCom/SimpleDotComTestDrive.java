package Cap5.SimpleDotCom;

/**
 * Created with IntelliJ IDEA.
 * User: raluca.garba
 * Date: 5/3/13
 * Time: 6:51 PM
 * To change this template use File | Settings | File Templates.
 */
public class SimpleDotComTestDrive {
    public static void main(String[] args) {
        SimpleDotCom dot = new SimpleDotCom();
        int[] locations = {2,3,4};
        dot.setLocationCells(locations);
        String userGuess = "2";
        String result = dot.checkYourself(userGuess);
    }
}
