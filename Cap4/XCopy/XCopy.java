package Cap4.XCopy;

/**
 * Created with IntelliJ IDEA.
 * User: raluca.garba
 * Date: 3/13/13
 * Time: 5:08 PM
 * To change this template use File | Settings | File Templates.
 */
public class XCopy {

    public static void main(String[] args) {

        int orig = 42;
        XCopy x = new XCopy();
        int y = x.go(orig);

        System.out.println(orig + " " + y);
    }
    int go (int arg){
        arg = arg * 2;
        return arg;
    }
}
