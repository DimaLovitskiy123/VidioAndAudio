import java.util.List;

public abstract class BasicAudioPlayer {
    protected String name;
    protected int duration;
    protected Format format;

    private List<Media> songs;

    public BasicAudioPlayer(List<Media> songs){
        this.songs = songs;
    }

    public BasicAudioPlayer(String name, int duration, Format format) {
        this.name = name;
        this.duration = duration;
        this.format = format;
    }

    public String getName() {
        return name;
    }

    public int getDuration() {
        return duration;
    }

    public Format getFormat() {
        return format;
    }
}
