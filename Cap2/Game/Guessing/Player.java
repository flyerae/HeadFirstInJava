package Cap2.Game.Guessing;

/**
 * Created with IntelliJ IDEA.
 * User: raluca.garba
 * Date: 2/25/13
 * Time: 4:45 PM
 * To change this template use File | Settings | File Templates.
 */
public class Player {
    int number = 0; //where the guess goes

    public void guess (){
        number = (int) (Math.random() * 10);
        System.out.println("I'm guessing " + number);
    }
}
