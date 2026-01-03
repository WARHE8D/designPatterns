package behavioral.state;

public class PauseState implements MediaPlayerState {


    @Override
    public void pressedButton(MediaPlayer mediaPlayer) {
        mediaPlayer.play();
        mediaPlayer.setState(new PlayState());

    }
}
