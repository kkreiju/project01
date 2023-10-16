public class ViewArtists extends ArtistsDatabase{
    private String[] artists = getArtists();
    public void artistScan(){
        System.out.println("Artists: ");
        try{
            for(int i = 0 ; i < artists.length ; i++){
                System.out.println((i + 1) + ". " + artists[i]);
                Thread.sleep(500);
            }
        }
        catch(Exception e){

        }
    }
}
