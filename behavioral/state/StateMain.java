package behavioral.state;

public class StateMain {
    public static void main(String[] args) {
        var mediaPlayer = new MediaPlayer();
        mediaPlayer.pressedButton();
        System.out.println("-------------------");
        mediaPlayer.pressedButton();

    }
}
