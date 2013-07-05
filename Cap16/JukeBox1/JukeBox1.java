package Cap16.JukeBox1;

/**
 * Created with IntelliJ IDEA.
 * User: raluca.garba
 * Date: 7/5/13
 * Time: 4:04 PM
 */
 /*
    SongList.txt
Pink Moon/Nick Drake
Somersault/Zero 7
Shiva Moon/Prem Joshua
Circles/BT
Deep Channel/Afro Celts
Passenger/Headmix
Listen/Tahiti 80
  */
import java.util.*;
import java.io.*;

// getting all the songs by parsing the list with songs and artists
// put them in an ArrayList
// sort songs by name

public class JukeBox1 {
    // create an ArrayList of Strings to store the songs
    ArrayList<String> songList = new ArrayList<String>();

    public static void main(String[] args) {
        new JukeBox1().go();
    } // end main

    public void go(){
        // the method that start loading the file and then print the content of songList ArrayList

        getSongs();
        System.out.println(songList);
        // call the static Collection sort() method, then print the list again
        Collections.sort(songList);
        System.out.println(songList);
    } // end go

    void getSongs(){
        // read the file and call addSong() method for each line
        try {
            File file = new File("SongList.txt");
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line = null;
            while ((line = reader.readLine()) != null){
                addSong(line);
            }  // end while
        } catch (Exception ex){ex.printStackTrace();}
    } // end getSongs

    // parse the song list and break the lines, using split() method, into tokens
    // add song title to the songList ArrayList

    void addSong(String lineToParse){

        String [] tokens = lineToParse.split("/");
        songList.add(tokens[0]);
        // we only want the song title, so add only first token to the songList
    }  // end addSong
}  // end class
