package behavioral.state;

public class PlayState implements MediaPlayerState {


    @Override
    public void pressedButton(MediaPlayer mediaPlayer) {
        mediaPlayer.pause();
        mediaPlayer.setState(new PauseState());

    }
}
