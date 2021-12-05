import java.util.List;

public class Aimp extends BasicAudioPlayer implements AudioPlayer{

    private static final int MIN = 1000;
    private static final int MAX = 5000;

    private List<Media> songs;

    public Aimp(List<Media> songs) {
        super(songs);
        this.songs = songs;
    }

    public void playAudio() {
        /*for (int i = 0; i < songs.size(); i++) {
            System.out.println("Играет " + songs.get(i));
        }*/
        for (Media song : songs) {
            System.out.println("Играет " + song);
            for (int w = song.getDuration(); w > 0; w--){
                System.out.print(".");
                try {
                    //Thread.sleep(Utils.getRandom(MIN, MAX));
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println();
        }
    }

}
