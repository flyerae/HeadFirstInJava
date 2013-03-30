package Cap3.Books;

/**
 * Created with IntelliJ IDEA.
 * User: raluca.garba
 * Date: 2/27/13
 * Time: 7:32 PM
 * To change this template use File | Settings | File Templates.
 */
public class BooksTestDrive {
    public static void main(String[] args) {

        Books[] myBooks = new Books[3];
        int x = 0;

        // Put some Books in array

        myBooks[0] = new Books();
        myBooks[1] = new Books();
        myBooks[2] = new Books();

        // A fost conditia sa compileze

        myBooks[0].title = "The Grapes of Java";
        myBooks[1].title = "The Java Gatsby";
        myBooks[2].title = "The Java Cookbook";
        myBooks[0].author = "bob";
        myBooks[1].author = "sue";
        myBooks[2].author = "ian";

        while (x < 3){
            System.out.print(myBooks[x].title);
            System.out.print(" by ");
            System.out.println(myBooks[x].author);
            x = x + 1;
        }

    }
}
