/**
 * The SongRecord class contains information about an audio file including title, artist and time length.
 *
 * @author HivanshDhakne
 *  email: hivansh.dhakne@stonybrook.edu
 *  Stony Brook ID: 114591135
 */

public class Playlist extends SongRecord implements Cloneable {
    static final int MAX = 50;
    SongRecord s[];
    public int currentSize;

    public Playlist() {
        s = new SongRecord[MAX];
        currentSize = 0;
    }

    public Object Clone() {
        Object newObject = new Playlist();
        return newObject;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SongRecord)) {
            return false;
        }
        SongRecord a = (SongRecord) obj;
        return


    }


    public int size() {
        return currentSize;
    }



    public void addSong(SongRecord song, int position) throws FullPlaylistException {
        try {
            if (position < 0 || position > currentSize)
                throw new IllegalArgumentException();
            if (currentSize == MAX)
                throw new FullPlaylistException();
            for (int x = currentSize; x >= position; x--)
                s[x + 1] = s[x];
            s[position] = song;
            currentSize++;
        } catch (IllegalArgumentException) {
            System.out.println("position is not within valid range");
        } catch (FullPlaylistException) {
            System.out.println("The Playlist is full, no more songs can be added.");
        }
    }


    public void removeSong(int position) {
        try {
            if (position < 0 || position > currentSize)
                throw new IllegalArgumentException();
            for (int x = position; x < currentSize; x++)
                s[x] = s[x + 1];
            currentSize--;
        } catch (IllegalArgumentException) {
            System.out.println("position is not within valid range.");
        }
    }


    public SongRecord getSong(int position) {
        try {
            if (position < 0 || position > currentSize)
                throw new IllegalArgumentException();
        } catch (IllegalArgumentException ie) {
            System.out.println("position is not within valid range.");
        }
        return s[position];
    }


    public void printAllSongs() {
        {
            for(int x = 0; x < currentSize; x++)
                System.out.print(s[x]);
        }
    }


}
