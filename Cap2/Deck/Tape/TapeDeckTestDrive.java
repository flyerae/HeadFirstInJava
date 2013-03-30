package Cap2.Deck.Tape;

/**
 * Created with IntelliJ IDEA.
 * User: raluca.garba
 * Date: 2/25/13
 * Time: 5:48 PM
 * To change this template use File | Settings | File Templates.
 */
public class TapeDeckTestDrive {
    public static void main(String[] args) {

        TapeDeck t = new TapeDeck();

        t.canRecord = true;
        t.playTape();

        if (t.canRecord == true){
            t.recordTape();
        }

    }
}
