package Cap2.Echo;

/**
 * Created with IntelliJ IDEA.
 * User: raluca.garba
 * Date: 2/25/13
 * Time: 6:29 PM
 * To change this template use File | Settings | File Templates.
 */
public class EchoTestDrive {
    public static void main(String[] args) {

       Echo e1 = new Echo();
       Echo e2 = e1;

        int x = 0;
        while (x < 4){
            e1.hello();
            e1.count = e1.count + 1;
            if (x == 3){
                e2.count = e2.count + 1;
            }
            if (x > 0){
                e2.count = e2.count + e1.count;
            }
            x = x + 1;
        }
        System.out.println(e2.count);
    }
}
