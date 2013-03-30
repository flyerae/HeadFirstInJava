package Cap2.Kit.Drum;

/**
 * Created with IntelliJ IDEA.
 * User: raluca.garba
 * Date: 2/25/13
 * Time: 6:13 PM
 * To change this template use File | Settings | File Templates.
 */
public class DrumKitTestDrive {
    public static void main(String[] args) {

        DrumKit d = new DrumKit();
        d.playSnare();
        d.snare = false;
        d.playTopHat();
        if (d.snare == true){
            d.playSnare();
        }
    }
}
