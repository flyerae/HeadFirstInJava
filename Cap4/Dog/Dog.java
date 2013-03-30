package Cap4.Dog;

/**
 * Created with IntelliJ IDEA.
 * User: raluca.garba
 * Date: 2/27/13
 * Time: 10:11 PM
 * To change this template use File | Settings | File Templates.
 */
public class Dog {
    int size;
    String name;

    void bark() {
        if (size > 60) {
            System.out.println("Woof! Woof!");
        } else if (size > 14) {
            System.out.println("Ruff! Ruff!");
        } else {
            System.out.println("Yip! Yip!");
        }
    }
}
