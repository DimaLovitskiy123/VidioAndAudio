public class Computer {

    private AudioPlayer audioPlayer;
    private VidioPlayer videoPlayer;

    Computer(VidioPlayer videoPlayer) {
        this.videoPlayer = videoPlayer;
    }

    public Computer(AudioPlayer audioPlayer) {
        this.audioPlayer = audioPlayer;
    }

    public Computer(AudioPlayer audioPlayer, VidioPlayer videoPlayer) {
        this.audioPlayer = audioPlayer;
        this.videoPlayer = videoPlayer;
    }

    public void startAudioPlayer() {
        audioPlayer.playAudio();
    }

    public void startVideoPlayer() {
        videoPlayer.playVidio();
    }
}
