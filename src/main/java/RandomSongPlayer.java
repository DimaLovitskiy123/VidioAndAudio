import java.util.List;

public class RandomSongPlayer extends BasicAudioPlayer implements AudioPlayer{

    private List<Media> songs;

    public RandomSongPlayer(List<Media> songs){
        super(songs);
        this.songs = songs;
    }

    public void playAudio() {
        System.out.println(songs.get(Utils.getRandom(0, songs.size() - 1)));
    }
}
