package Cap3.Triangle;

/**
 * Created with IntelliJ IDEA.
 * User: raluca.garba
 * Date: 2/27/13
 * Time: 8:46 PM
 * To change this template use File | Settings | File Templates.
 */
public class Triangle {
    double area;
    int height;
    int lenght;

    public static void main(String[] args) {

        int x = 0;
        Triangle[] ta = new Triangle[4];


        while (x < 4) {
            ta[x] = new Triangle();

            ta[x].height = (x + 1) * 2;
            ta[x].lenght = x + 4;
            System.out.print("triangle " + x + ", area ");
            System.out.println(" = " + ta[x].area);
            ta[x].setArea();
            x = x + 1;
        }
        int y = x;
        x = 27;
        Triangle t5 = ta[2];
        ta[2].area = 343;
        System.out.print("y = " + y);
        System.out.println(", t5 area = " + t5.area);

    }
    void setArea() {
        area = (height * lenght) / 2;

    }
}
