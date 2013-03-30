package Cap3.Hobbits;

/**
 * Created with IntelliJ IDEA.
 * User: raluca.garba
 * Date: 2/27/13
 * Time: 7:40 PM
 * To change this template use File | Settings | File Templates.
 */
public class Hobbits {
    String name;

    public static void main(String[] args) {

        Hobbits[] h = new Hobbits[3];

        // int z = -1 si nu int z = 0 pentru ca array incepe cu elementul 0
        int z = -1;

        //while (z < 2) si nu while (z < 4) pentru ca array are doar 3 elemente in cazul nostru si nu poate depasi

        while (z < 2){
            z = z + 1;
            h[z] = new Hobbits();
            h[z].name = "bilbo";
            if (z == 1){
                h[z].name = "frodo";
            }
            if (z == 2){
                h[z].name = "sam";
            }
            System.out.print(h[z].name + " is a ");
            System.out.println("good Hobbit name");

        }
    }
}
