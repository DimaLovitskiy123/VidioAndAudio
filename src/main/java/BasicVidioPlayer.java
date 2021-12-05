public abstract class BasicVidioPlayer {
    protected Media video;

    public BasicVidioPlayer(Media video){
        this.video = video;
    }

    public void setVideo(Media video){
        this.video = video;
    }
}