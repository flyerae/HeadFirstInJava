package Cap3.HeapQuizz;

/**
 * Created with IntelliJ IDEA.
 * User: raluca.garba
 * Date: 2/27/13
 * Time: 9:15 PM
 * To change this template use File | Settings | File Templates.
 */
public class HeapQuizz {
    int id = 0;

    public static void main(String[] args) {
        int x = 0;
        HeapQuizz[] hq = new HeapQuizz[5];
        while (x < 3){
            hq[x]= new HeapQuizz();
            hq[x].id = x;
            x = x + 1;
        }
        hq[3] = hq[1];
        hq[4] = hq[1];
        hq[3] = null;
        hq[4] = hq[0];
        hq[0] = hq[3];
        hq[3] = hq[2];
        hq[2] = hq[0];
        // do stuff

    }

}
