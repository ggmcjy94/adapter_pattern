package exam02;

public class MP4 implements VideoPlayer{
    @Override
    public void play(String fileName) {
        System.out.println("Playing MP4 File : " + fileName );
    }
}
