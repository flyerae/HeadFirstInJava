package Cap1.Methods;

/**
 * Created with IntelliJ IDEA.
 * User: raluca.garba
 * Date: 2/21/13
 * Time: 10:20 PM
 * To change this template use File | Settings | File Templates.
 */
public class BeerSong {
    public static void main(String[] args) {
        int beerNum = 99;
        String word = "bottles";

       /* while (beerNum > 0){

            if (beerNum == 1){
               word = "bottle"; //singular
            }
            System.out.println(beerNum + " " + word + " of beer on the wall");
            System.out.println(beerNum + " " + word + " of beer");
            System.out.println("Take one down");
            System.out.println("Pass it around");
            beerNum = beerNum - 1;

            if (beerNum > 0){
             System.out.println(beerNum + " " + word + " of beer on the wall");
            }     else {
                System.out.println("No more botles of beer on the wall");
            }     // end else
        }     // end while loop*/
        while (beerNum > 0) {
            if (beerNum > 1) {
                System.out.println(beerNum + " " + word + " of beer on the wall");
                System.out.println(beerNum + " " + word + " of beer");
                System.out.println("Take one down");
                System.out.println("Pass it around");
                beerNum = beerNum - 1;
            } else if (beerNum == 1) {
                word = "bottle";
                System.out.println(beerNum + " " + word + " of beer on the wall");
                System.out.println(beerNum + " " + word + " of beer");
                System.out.println("Take one down");
                System.out.println("Pass it around");
                beerNum = beerNum - 1;
            } else {
                System.out.println("No more botles of beer on the wall");
            }
        }
    }      // end main method
}          // end class
