package Cap4.Dog.ElectricGuitar;

/**
 * Created with IntelliJ IDEA.
 * User: raluca.garba
 * Date: 3/5/13
 * Time: 10:49 PM
 * To change this template use File | Settings | File Templates.
 */
public class ElectricGuitar {

    String brand;
    int numOfPickups;
    boolean rockStarUsesIt;

    String getBrand() {
        return brand;
    }

    void setBrand(String aBrand) {
        brand = aBrand;
    }

    int getNumOfPickups() {
        return numOfPickups;
    }

    void setNumOfPickups(int num) {
        numOfPickups = num;
    }

    boolean getRockStarUsesIt() {
        return rockStarUsesIt;
    }

    void setRockStarUsesIt(boolean yesOrNo) {
        rockStarUsesIt = yesOrNo;
    }


}
