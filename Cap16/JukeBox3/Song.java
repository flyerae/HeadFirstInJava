package Cap16.JukeBox3;

/**
 * Created with IntelliJ IDEA.
 * User: raluca.garba
 * Date: 7/5/13
 * Time: 4:27 PM
 */

public class Song {
    // four instance variables for the four song attributes in the file

    String title;
    String artist;
    String rating;
    String bpm;

    // the variables are are set in the constructor when the new Song is created

    Song(String t, String a, String r, String b){
        title = t;
        artist = a;
        rating = r;
        bpm = b;
    } // end constructor

    // the getter methods for the four attributes

    public String getTitle(){
        return title;
    }
    public String getArtist(){
        return artist;
    }
    public String getRating(){
        return rating;
    }
    public String getBpm(){
        return bpm;
    }
    // override the toString() method to print something more readable than the identifier code
    public String toString(){
        return (title + " : " + artist);
    }
}
