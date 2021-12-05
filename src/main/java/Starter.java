import java.util.ArrayList;
import java.util.List;

public class Starter {
    public static void main(String[] args) {

        Media gameOfThrones = new Media("Game of thrones", 72*60, Format.mp4);
        Computer computer = new Computer(new Aimp(getSongs()),new VLCMediaPlayer(gameOfThrones));

        computer.startAudioPlayer();
        //computer.startVideoPlayer();


    }

    private static List<Media> getSongs(){
        List<Media> result = new ArrayList();
        result.add(new Media("YOU_CARRY_ME_RIVRER",4, Format.mp3));
        result.add(new Media("BIRCH_TREES", 3, Format.mp3));
        result.add(new Media("BAD_WEATHER", 5, Format.mp3));
        result.add(new Media("COWS33",4, Format.mp3));
        return result;
    }
}
