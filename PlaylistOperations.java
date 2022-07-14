import java.util.Scanner;
public class PlaylistOperations {
    public static void main(String[] args) throws FullPlaylistException {
        Playlist p = new Playlist();
        Scanner in = new Scanner(System.in);
        String menu = "A) Add Song \n" +
                "B) Print Songs by Artist \n" +
                "G) Get Song \n" +
                "R) Remove Song \n" +
                "P) Print All Songs \n" +
                "S) Size \n" +
                "Q) Quit \n" +
                " \n" + "Select a menu option: ";
        System.out.print(menu);
        String selection = in.nextLine();
        selection = selection.toUpperCase();
        boolean successfulInput = false;



        while(!(selection.equals("Q"))) {
            selection = in.nextLine();
            selection = selection.toUpperCase();
            if (!selection.equals("A") || !selection.equals("B") || !selection.equals("G")
                    || !selection.equals("R") || !selection.equals("P") || !selection.equals("S")
                    || !selection.equals("Q")) {
                System.out.print("Not a valid selection. Try again.");
            }
            else if(selection.equals("A")) {
                System.out.print("Adding a song.");
                System.out.print("Enter the song Title");
                String t = in.nextLine();
                System.out.print("Enter the song Artist");
                String a = in.nextLine();
                System.out.print("Enter the song length(minutes)");
                int m = in.nextInt();
                System.out.print("Enter the song length(seconds)");
                int s = in.nextInt();
                System.out.print("Enter the position");
                int ps = in.nextInt();
                p.addSong(new SongRecord(t,a,m,s),ps);
                System.out.print("Song Added:" + t + " by " + a);


            }
            else if(selection.equals("B")) {
                System.out.print("Printing Songs by Artist.");
                System.out.print("Please enter Artist name.");
                p.getSongsByArtist(p, in.nextLine());
            }
            else if(selection.equals("G")) {
                System.out.print("Getting a specific song from the playlist.");
                System.out.print("Please enter position of the song.");
                p.getSong(in.nextInt());
            }
            else if(selection.equals("R")) {
                System.out.print("Removing a specific song from the playlist.");
                System.out.print("Please enter position of the song.");
                p.removeSong(in.nextInt());
            }
            else if(selection.equals("P")) {
                System.out.print("Printing playlist.");
                p.printAllSongs();
            }
            else if(selection.equals("S")) {
                System.out.print("Getting size of the playlist.");
                p.size();
            }


            System.out.print(menu);

            selection = in.nextLine();
            selection = selection.toUpperCase();
        }
        if (selection.equals("Q")){
            System.out.print("Quitting program.");
        }

    }
}
