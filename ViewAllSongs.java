public class ViewAllSongs extends AlbumsDatabase {
    public void showAll() {
        theBlackParadeAlbum();
        threeCheersForSweetRevengeAlbum();
        speakNowAlbum();
        loverAlbum();
        System.out.println("Songs: ");
        try {
            for (int i = 0; i < theBlackParade.size(); i++) {
                System.out.println((i + 1) + ". " + theBlackParade.get(i) + " - My Chemical Romance");
                Thread.sleep(200);
            }
            int total = theBlackParade.size();
            for (int i = 0; i < threeCheersForSweetRevenge.size(); i++) {
                System.out.println(
                        (total + (i + 1)) + ". " + threeCheersForSweetRevenge.get(i) + " - My Chemical Romance");
                        Thread.sleep(200);
            }
            total += threeCheersForSweetRevenge.size();
            for (int i = 0; i < speakNow.size(); i++) {
                System.out.println((total + (i + 1)) + ". " + speakNow.get(i) + " - Taylor Swift");
                Thread.sleep(200);
            }
            total += speakNow.size();
            for (int i = 0; i < lover.size(); i++) {
                System.out.println((total + (i + 1)) + ". " + lover.get(i) + " - Taylor Swift");
                Thread.sleep(200);
            }
        } catch (Exception e) {

        }

    }
}
