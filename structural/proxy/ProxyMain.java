package structural.proxy;

public class ProxyMain {

    private static final MyAnimeListProxy myAnimeListProxy = new MyAnimeListProxy();

    public static void main(String[] args) {
        var user = new User("Murtuza");
        loadHomePage();//no login
        loadHomePage(user);//after login
        //this 2 methods calls the topanime list twice
        //we could pass the mal as an argument in these methods:
//        var mal = new MyAnimeList();
//        var user = new User("Murtuza");
//        loadHomePage(mal);//no login
//        loadHomePage(user,mal);//after login
//        this will not call showTopAnime twice but only once
    }

    private static void loadHomePage() {
        System.out.println("Loading home page...");
        myAnimeListProxy.showTopAnime(null);
    }

    private static void loadHomePage(User user) {
        System.out.println("Loading home page...Welcome " + user.getName());
        myAnimeListProxy.showTopAnime(user);
    }
}
