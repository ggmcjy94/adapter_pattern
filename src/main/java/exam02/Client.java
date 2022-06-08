package exam02;

public class Client {

    public static void main(String[] args) {
        AudioPlayer mp3Player = new MP3();
        mp3Player.play("file.mp3");


        //MP3 인스턴스를 AudioPlayer 참조변수로 mp3Player 객체를 생성하였는데,
        //MP4 인스턴스에 어댑터를 사용하면 MP4도 mp3Player에서도 사용할 수 있게된다.
        mp3Player = new FormatAdapter(new MP4());
        mp3Player.play("file.mp4");

        mp3Player = new FormatAdapter(new MKV());
        mp3Player.play("file.mkv");
    }
}
