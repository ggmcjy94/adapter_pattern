package exam02;

public class FormatAdapter implements AudioPlayer{

    private VideoPlayer media;

    public FormatAdapter(VideoPlayer videoPlayer) {
        this.media = videoPlayer;
    }

    @Override
    public void play(String fileName) {
        System.out.println("Using Adapter : ");
        media.play(fileName);
    }
}
