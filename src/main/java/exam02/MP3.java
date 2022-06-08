package exam02;

public class MP3 implements AudioPlayer{
    @Override
    public void play(String fileName) {
        System.out.println("Playing MP3 File : " + fileName );
    }
}
