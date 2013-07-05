package Cap16.JukeBox3;

/**
 * Created with IntelliJ IDEA.
 * User: raluca.garba
 * Date: 7/5/13
 * Time: 4:26 PM
 */

/*
    SongListMore.txt
Pink Moon/Nick Drake/5/80
Somersault/Zero 7/4/84
Shiva Moon/Prem Joshua/6/20
Circles/BT/5/110
Deep Channel/Afro Celts/4/120
Passenger/Headmix/4/100
Listen/Tahiti 80/5/90
 */

import java.util.*;
import java.io.*;

public class JukeBox3 {

    ArrayList<Song> songList = new ArrayList<Song>();

    public static void main(String[] args) {
        new JukeBox3().go();
    }
    class ArtistCompare implements Comparator<Song>{
        public int compare(Song one, Song two){
            return one.getArtist().compareTo(two.getArtist());
        }

    }
    class TitleCompare implements Comparator<Song>{
        public int compare(Song one, Song two){
            return one.getTitle().compareTo(two.getTitle());
        }

    }
    public void go(){
        getSongs();
        System.out.println(songList);

        TitleCompare titleCompare = new TitleCompare();
        ArtistCompare artistCompare = new ArtistCompare();
        Collections.sort(songList, artistCompare);
        System.out.println(songList);
        Collections.sort(songList, titleCompare);
        System.out.println(songList);
    }




    void getSongs(){
        try {
            File file = new File("SongListMore.txt");
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
}
