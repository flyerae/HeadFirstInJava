package Cap1.Methods;

/**
 * Created with IntelliJ IDEA.
 * User: raluca.garba
 * Date: 2/21/13
 * Time: 11:40 PM
 * To change this template use File | Settings | File Templates.
 */
public class Shuffle1 {
    public static void main(String[] args) {

        int x = 3;
        while (x > 0){
            if (x > 2){
                System.out.print("a");
            }
            x = x -1;
            System.out.print("-");

            if (x == 2){
                System.out.print("b c");
            }
            x = x - 1;
            System.out.print("-");

            if (x == 1){
                System.out.print("d");
                x = x - 1;
            }
        }
    }
}
