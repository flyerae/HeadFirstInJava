package Cap16.SortMountains;

/**
 * Created with IntelliJ IDEA.
 * User: raluca.garba
 * Date: 7/5/13
 * Time: 7:50 PM
 */

import java.util.*;
import java.io.*;

public class SortMountains {
    LinkedList<Mountain> mtn = new LinkedList<Mountain>();

    class NameCompare implements Comparator<Mountain>{
        public int compare(Mountain one, Mountain two){
            return one.name.compareTo(two.name);
        }
    }// close inner class

    class HeightCompare implements Comparator<Mountain>{
        public int compare(Mountain one, Mountain two){
            return (one.height - two.height);
        }
    } // close inner class

    public static void main(String[] args) {
        new SortMountains().go();
    }

    public void go(){
        mtn.add(new Mountain("Longs", 14255));
        mtn.add(new Mountain("Elbert", 14433));
        mtn.add(new Mountain("Maroon", 14156));
        mtn.add(new Mountain("Castle", 14265));

        System.out.println("as entered:\n" + mtn);
        NameCompare nc = new NameCompare();
        Collections.sort(mtn, nc);
        System.out.println("by name\n" + mtn);
        HeightCompare hc = new HeightCompare();
        Collections.sort(mtn, hc);
        System.out.println("by height\n" + mtn);
    }
}

class Mountain {
    String name;
    int height;

    Mountain(String n, int h){
        name = n;
        height = h;
    } // end constructor
    public String toString(){
        return (name + " " + height);
    } // end toString() overridden method
}


