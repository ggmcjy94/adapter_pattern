package exam02;

public class MKV implements VideoPlayer{
    @Override
    public void play(String fileName) {
        System.out.println("Playing MKV File : " + fileName );
    }
}
