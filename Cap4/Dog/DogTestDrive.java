package Cap4.Dog;

/**
 * Created with IntelliJ IDEA.
 * User: raluca.garba
 * Date: 2/27/13
 * Time: 10:12 PM
 * To change this template use File | Settings | File Templates.
 */
public class DogTestDrive {
    public static void main(String[] args) {

        Dog one = new Dog();
        one.size = 70;
        Dog two = new Dog();
        two.size = 8;
        Dog three = new Dog();
        three.size = 35;

        one.bark();
        two.bark();
        three.bark();
    }
}
