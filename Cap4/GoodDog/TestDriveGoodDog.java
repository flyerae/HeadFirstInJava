package Cap4.GoodDog;

/**
 * Created with IntelliJ IDEA.
 * User: raluca.garba
 * Date: 3/5/13
 * Time: 11:17 PM
 * To change this template use File | Settings | File Templates.
 */
public class TestDriveGoodDog {
    public static void main(String[] args) {

        GoodDog one = new GoodDog();
        one.setSize(70);
        GoodDog two = new GoodDog();
        two.setSize(8);
        System.out.println("Dog one: " + one.getSize());
        System.out.println("Dog two: " + two.getSize());
        one.bark();
        two.bark();
    }
}
