package structural.proxy;

public class MyAnimeListProxy implements MyAnimeListHome {

    private MyAnimeListHome myAnimeListHome;

    @Override
    public void showTopAnime(User user) {
        if (myAnimeListHome == null) {// creates only once
            myAnimeListHome = new MyAnimeList(user);
        }
        myAnimeListHome.showTopAnime(user);
    }
}
