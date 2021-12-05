public class VLCMediaPlayer extends BasicVidioPlayer implements VidioPlayer{


    public VLCMediaPlayer(Media video) {
        super(video);
    }

    public void playVidio() {
        System.out.println("Воспроизводится видео \n" + video);
    }
}
