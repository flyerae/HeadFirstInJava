package Cap4.Clock;

/**
 * Created with IntelliJ IDEA.
 * User: raluca.garba
 * Date: 3/13/13
 * Time: 5:12 PM
 * To change this template use File | Settings | File Templates.
 */
public class ClockTestDrive {
    public static void main(String[] args) {
        Clock c = new Clock();
        c.setTime("12:45");
        String tod = c.getTime();
        System.out.println("time " + tod);
    }
}
