package Cap1.Methods;

/**
 * Created with IntelliJ IDEA.
 * User: raluca.garba
 * Date: 2/21/13
 * Time: 9:17 PM
 * To change this template use File | Settings | File Templates.
 */
public class Methods {


    public static void main(String[] args) {

        // do something = statements: declarations, assignments, methods calls

        int x = 3;
        String name = "Dirk";
        x = x * 17;
        System.out.println("x is " + x);
        double d = Math.random();

        // do something again and again = loops: for and while

        while (x > 12){
            x = x-1;
        }
        for (x = 0; x < 10; x = x + 1){
            System.out.println("x is now " + x);
        }

        // Do something under this condition = Branching: if/else tests

        if (x == 10){
            System.out.println("x must be 10");
        }  else {
            System.out.println("x isn't 10");
        }
        if ((x > 3) & (name.equals("Dirk"))){
            System.out.println("Gently");
        }
        System.out.println("this line runs no matter what");

        int y = 4; //asign 4 to y
        while (y > 3){
            //loop code will run because
            //y is greater than 3
            y = y - 1; //or we'd loop forever
        }
        int z = 27; // asig n27 to z
        while (z == 17){
            //loop code will not run because
            // z is not equal to 17
        }
        int a = 1;
        System.out.println("Before the Loop");
        while (a < 4) {
            System.out.println("In the Loop");
            System.out.println("Value of the a is " + a);
            a = a + 1;
            }
        System.out.println("This is after the loop");

    }






}
