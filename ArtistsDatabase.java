import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ArtistsDatabase extends AlbumsDatabase{
    private String[] artists = {"My Chemical Romance" , "Taylor Swift"};
    ArrayList<String> albums = new ArrayList<String>(); 
    ArrayList<String> album1Songs = new ArrayList<String>();
    ArrayList<String> album2Songs = new ArrayList<String>();
    ArrayList<String> finalAlbumSongs = new ArrayList<String>();

    String artist, album;
    int trackNo = 0;
    private int choice = 0, albumSize = 0;

    private String finalArtist, finalAlbum;
    public int finalTrackNo;

    public void artist1(){
        albums.add("The Black Parade");
        theBlackParadeAlbum();
        albums.add("Three Cheers For Sweet Revenge");
        threeCheersForSweetRevengeAlbum();
        for(int i = 0 ; i < theBlackParade.size() ; i++){
            album1Songs.add(theBlackParade.get(i));
        }
        for(int i = 0 ; i < threeCheersForSweetRevenge.size() ; i++){
            album2Songs.add(threeCheersForSweetRevenge.get(i));
        }
    }

    public void artist2(){
        albums.add("Speak Now (Taylor's Version)");
        speakNowAlbum();
        albums.add("Lover");
        loverAlbum();
        for(int i = 0 ; i < speakNow.size() ; i++){
            album1Songs.add(speakNow.get(i));
        }
        for(int i = 0 ; i < lover.size() ; i++){
            album2Songs.add(lover.get(i));
        }
    }

    public void viewAlbums(){
        System.out.println("Albums: ");
        try{
            for(int i = 0 ; i < albums.size() ; i++){
                System.out.println((i + 1) + ". " + albums.get(i));
                Thread.sleep(500);
            }
        }
        catch(Exception e){

        } 
    }

    public void selectAlbum(){
        if(choice == 1){
            System.out.println("Songs: ");
            artist1();
            artist = "My Chemical Romance";
            album = "The Black Parade";
            setAlbumSize(album1Songs.size());
            try{
                for(int i = 0; i < album1Songs.size(); i++) {
                    finalAlbumSongs.add(album1Songs.get(i));
                    System.out.println((i + 1) + ". " + album1Songs.get(i) + " - " + artist);
                    Thread.sleep(200);
                }
            }
            catch(Exception e){

            }
        }
        else if(choice == 2){
            System.out.println("Songs: ");
            artist1();
            artist = "My Chemical Romance";
            album = "Three Cheers For Sweet Revenge";
            setAlbumSize(album1Songs.size());
            try{
                for(int i = 0; i < album2Songs.size(); i++) {
                    finalAlbumSongs.add(album2Songs.get(i));
                    System.out.println((i + 1) + ". " + album2Songs.get(i) + " - " + artist);
                    Thread.sleep(200);
                }
            }
            catch(Exception e){

            }
        }
        else if(choice == 3){
            System.out.println("Songs: ");
            artist2();
            artist = "Taylor Swift";
            album = "Speak Now (Taylor's Version)";
            setAlbumSize(album1Songs.size());
            try{
                for(int i = 0; i < album1Songs.size(); i++) {
                    finalAlbumSongs.add(album1Songs.get(i));
                    System.out.println((i + 1) + ". " + album1Songs.get(i) + " - " + artist);
                    Thread.sleep(200);
                }
            }
            catch(Exception e){

            }
        }
        else if(choice == 4){
            System.out.println("Songs: ");
            artist2();
            artist = "Taylor Swift";
            album = "Lover";
            setAlbumSize(album1Songs.size());
            try{
                for(int i = 0; i < album2Songs.size(); i++) {
                    finalAlbumSongs.add(album2Songs.get(i));
                    System.out.println((i + 1) + ". " + album2Songs.get(i) + " - " + artist);
                    Thread.sleep(200);
                }
            }
            catch(Exception e){

            }
        }
        else{
            System.out.println("Not in the Option! Try again!");
            System.out.print("Input: ");
            intErrorTrapping();
            selectAlbum();
        }
    }

    public void intErrorTrapping(){
        Scanner sc = new Scanner(System.in);
        try {
            choice = sc.nextInt();
            if(choice < 1 || choice > 2){
                throw new InputMismatchException();
            }
        } catch (InputMismatchException e) {
            System.out.println("Not in the Option! Try again");
            System.out.print("Input: ");
            sc.nextLine();
            intErrorTrapping();
        }
    }

    public void selectSong(){
        if(choice < 1 || choice > albumSize){
            System.out.println("Not in the Option! Try again!");
        }
        else{
            finalPrint fp = new finalPrint();
            finalArtist = artist;
            finalAlbum = album;
            fp.assignVariables(finalArtist, finalAlbum);
            finalTrackNo = choice;
            System.out.println("\n\n------------\nTitle: " + finalAlbumSongs.get(finalTrackNo - 1) + "\nTrack Number: " + finalTrackNo);
            fp.display();
        }
    }

    //Getter
    public String[] getArtists(){
        return artists;
    }

    //Setter
    public void setArtists(String[] pubartists){
        this.artists = pubartists;
    }

    public int getChoice(){
        return choice;
    }

    public void setChoice(int choice){
        this.choice = choice;
    }

    public int getAlbumSize(){
        return albumSize;
    }

    public void setAlbumSize(int albumSize){
        this.albumSize = albumSize;
    }

    public String getAlbum(){
        return finalAlbum;
    }

    public String getArtist(){
        return finalArtist;
    }

    public void setAlbumArtist(String album, String artist){
        this.finalAlbum = album;
        this.finalArtist = artist;
    }
}