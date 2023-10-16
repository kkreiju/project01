import java.util.*;


class finalPrint{
    String artist, album;

    void assignVariables(String ar, String al){
        artist = ar;
        album = al;
    }

    void display(){
        System.out.println("Artist: " + artist + "\nAlbum: " + album);
    }
}

public class Main {
    static int choice = 0;
    static boolean exit = false;
    static Scanner sc = new Scanner(System.in);
    
    public static void intErrorTrapping() {
        try {
            choice = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Input is only integers! Try again");
            System.out.print("Input: ");
            sc.nextLine();
            intErrorTrapping();
        }
    }

    public static void chooseArtist() {
        ChooseArtist ca = new ChooseArtist();
        ArtistsDatabase ad = new ArtistsDatabase();
        System.out.print("Would you like to choose an artist?\n1. Yes\n2. No\nInput: ");
        intErrorTrapping();
        if (choice == 1) {
            ca.chooseArtist();
            intErrorTrapping();
            ca.setChoice(choice);
            ca.selectionOfArtist();
            System.out.print("Input: ");
            intErrorTrapping();
            if(ca.artist == "My Chemical Romance"){
                ad.setChoice(choice);
            }
            else{
                ad.setChoice(choice + 2);
            }
            ad.selectAlbum();
            System.out.print("Input: ");
            intErrorTrapping();
            ad.setChoice(choice);
            ad.selectSong();
        } else if (choice == 2) {
            // NOTHING!
        } else {
            System.out.println(choice + " is not in choices! Try again");
        }
    }

    public static void main(String[] args) {
        ViewArtists va = new ViewArtists();
        while (!exit) {
            System.out.println("------------");
            System.out.print("1. Choose a Song\n2. View Songs Database\n3. View Artists Database\n4. Exit\nInput: ");
            try {
                choice = sc.nextInt();
                System.out.println("------------");
                if (choice == 1) {
                    choice = 0;
                    va.artistScan();
                    chooseArtist();
                } else if (choice == 2) {
                    ViewAllSongs vas = new ViewAllSongs();
                    vas.showAll();
                } else if (choice == 3) {
                    va.artistScan();
                } else if (choice == 4) {
                    exit = true;
                    System.out.println("Program Terminated.");
                } else {
                    System.out.println(choice + " is not in choices! Try again");
                }
            } catch (InputMismatchException e) {
                System.out.println("Input is only integers! Try again");
                sc.nextLine();
            }

        }
    }
}
