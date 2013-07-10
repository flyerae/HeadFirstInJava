package Cap16.JukeBox6;

/**
 * Created with IntelliJ IDEA.
 * User: raluca.garba
 * Date: 7/5/13
 * Time: 4:26 PM
 */

/*
    SongListBigger.txt
Pink Moon/Nick Drake/5/80
Somersault/Zero 7/4/84
Shiva Moon/Prem Joshua/6/20
Circles/BT/5/110
Deep Channel/Afro Celts/4/120
Passenger/Headmix/4/100
Listen/Tahiti 80/5/90
Listen/Tahiti 80/5/90
Listen/Tahiti 80/5/90
Circles/BT/5/110

 */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;


public class JukeBox6 {

    ArrayList<Song> songList = new ArrayList<Song>();

    public static void main(String[] args) {
        new JukeBox6().go();
    }

    public void go(){
        getSongs();
        System.out.println(songList);
        Collections.sort(songList);
        System.out.println(songList);

        // create a new HashSet parametrized to hold Songs

        HashSet<Song> songSet = new HashSet<Song>();
        // HashSet has a simple addAll() method that can take another collection and use it to populate the HashSet
        songSet.addAll(songList);
        System.out.println(songSet);
    }

    void getSongs(){
        try {
            File file = new File("SongListBigger.txt");
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line = null;
            while ((line = reader.readLine()) != null){
                addSong(line);
            }
        }  catch (Exception ex){ex.printStackTrace();}
    }

    void addSong(String lineToParse){
        String[] tokens = lineToParse.split("/");
        // create a new Song object using the four tokens, then add the Song to the list

        Song nextSong = new Song(tokens[0], tokens[1], tokens[2], tokens[3]);
        songList.add(nextSong);
    }
} // we still have the duplicates and we lost sort order when we put the list into HashSet cause we didn't call sort() again
