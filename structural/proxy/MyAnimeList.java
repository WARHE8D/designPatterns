package structural.proxy;

public class MyAnimeList implements MyAnimeListHome {

    public MyAnimeList(User user) {
        showRecommendedAnime(user);
    }

    @Override
    public void showTopAnime(User user) {
        System.out.println("--------------------------");
        System.out.println("Showing top anime...");
        System.out.println("Steins;Gate");
        System.out.println("Monogatari");
        System.out.println("Oregairu");
        System.out.println("86");
        System.out.println("Laid-back camp");
        System.out.println("--------------------------");
    }

    private void showRecommendedAnime(User user) {
        if (user != null) {//access control
            System.out.println("--------------------------");
            System.out.println("Recomended for " + user.getName());
            System.out.println("Akudama Drive");
            System.out.println("Food for the soul");
            System.out.println("Code Geass");
            System.out.println("Hells paradise");
            System.out.println("--------------------------");
        }
    }
}
