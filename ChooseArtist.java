import java.util.*;

public class ChooseArtist extends ViewArtists {
    private int choice = 0;
    public String artist;

    public void chooseArtist(){
        artistScan();
        System.out.print("Input: ");
    }

    public void selectionOfArtist(){
        if(getChoice() == 1){
            this.artist = "My Chemical Romance";
            artist1();
            viewAlbums();
        }
        else if(getChoice() == 2){
            this.artist = "Taylor Swift";
            artist2();
            viewAlbums();
        }
        else{
            System.out.print(getChoice() + " is not in choices! Try again\nInput: ");
            intErrorTrapping();
            selectionOfArtist();
        }
    }

    public void intErrorTrapping(){
        Scanner sc = new Scanner(System.in);
        try {
            choice = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Input is only integers! Try again");
            System.out.print("Input: ");
            sc.nextLine();
            intErrorTrapping();
        }
    }
    
    public int getChoice(){
        return choice;
    }

    public void setChoice(int choice){
        this.choice = choice;
    }
}
