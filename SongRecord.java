/**
 * The SongRecord class contains information about an audio file including title, artist and time length.
 *
 * @author HivanshDhakne
 *  email: hivansh.dhakne@stonybrook.edu
 *  Stony Brook ID: 114591135
 */

public class SongRecord {
    private String title;
    private String artist;
    private int minutes;
    private int seconds;

//default constructor
    SongRecord() {
        title = "";
        artist = "";
        minutes = 0;
        seconds = 0;
    }


    public String getTitle() {
        return this.title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getArtist() {
        return this.artist;
    }
    public void setArtist(String artist) {
        this.artist = artist;
    }
    public int getMinutes() {
        return this.minutes;
    }
    public void setMinutes(int minutes) {
        if(minutes < 0) {
            throw new IllegalArgumentException("invalid value for minute(s)");
        }
        else {
            this.minutes = minutes;
        }
    }
    public int getSeconds() {
        return this.seconds;
    }
    public void setSeconds(int seconds) {
        if (seconds < 0 || seconds > 59) {
            throw new IllegalArgumentException("invalid value for seconds");
        }
        else {
            this.seconds = seconds;
        }
    }
    public String toString() {
        return String.format("%-21s%-26s%19s%06d", title, artist, minutes, seconds);
    }
}
