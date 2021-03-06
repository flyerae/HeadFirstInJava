package Cap5.SimpleDotCom;

/**
 * Created with IntelliJ IDEA.
 * User: raluca.garba
 * Date: 5/3/13
 * Time: 7:05 PM
 * To change this template use File | Settings | File Templates.
 */
public class Game {
    public static void main(String[] args) {
        int numOfGuesses = 0;
        GameHelper helper = new GameHelper();

        SimpleDotCom theDotCom = new SimpleDotCom();
        int randomNum = (int)(Math.random() * 5);

        int[] locations = {randomNum,randomNum+1,randomNum+2};
        theDotCom.setLocationCells(locations);
        boolean isAlive = true;

        while(isAlive == true){
            String guess = helper.getUserInput("enter a number");
            String result = theDotCom.checkYourself(guess);
            numOfGuesses++;
            if (result.equals("kill")){
                isAlive = false;
                System.out.println("You took " + numOfGuesses + " guesses");
            } //close if
        } //close while
    } // close main
} //close class
