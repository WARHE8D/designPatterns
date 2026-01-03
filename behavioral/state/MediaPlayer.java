package behavioral.state;

public class MediaPlayer {
    private MediaPlayerState state;

    public void setState(MediaPlayerState state) {
        this.state = state;
    }

    public MediaPlayer() {
        this.state = new PauseState();
    }

    public void pressedButton() {
        state.pressedButton(this);
    }

    public void play() {
        System.out.println("Paused");
        System.out.println("Now Displaying Play Button");
    }

    public void pause() {
        System.out.println("Now Playing");
        System.out.println("Displaying Pause Button");
    }
}
