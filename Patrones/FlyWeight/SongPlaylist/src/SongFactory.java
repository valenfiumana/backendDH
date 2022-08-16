import java.util.HashMap;

public class SongFactory {
    private static final HashMap<String, Song> SONG_MAP = new HashMap<>();
    public Song getSong(String name) {
        Song s = null;
        /* If an object has already been
           created simply return its reference */
        if (SONG_MAP.containsKey(name))
            s = SONG_MAP.get(name);
        else {
            s = new Song();
            // Once created insert it into the HashMap
            SONG_MAP.put(name, s);
        }
        return s;
    }
}
