package Cap4.GoodDog;

/**
 * Created with IntelliJ IDEA.
 * User: raluca.garba
 * Date: 3/5/13
 * Time: 11:17 PM
 * To change this template use File | Settings | File Templates.
 */
public class GoodDog {

    //make the instance variable private

    private int size;

    // make the getter and setter methods public

    public int getSize() {
        return size;
    }

    public void setSize(int s) {
        size = s;
    }

    void bark() {
        if (size > 60) {
            System.out.println("Woof! Woof");
        } else if (size > 14) {
            System.out.println("Ruff! Ruff!");
        } else {
            System.out.println("Yip! Yip!");
        }
    }
}

