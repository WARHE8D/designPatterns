package structural.adapter;

public class AdapterMain {
    public static void main(String[] args) {
        System.out.println("Submit your anime/manga review");
        var anime = new AnimeReviewUploader();
        var portal = new MyAnimeListPortal(anime);//anime review
        portal.uploadReview();


//        var mangareviewUploader = new MangaReviewUploader();
//        var portal1 = new MyAnimeListPortal(mangareviewUploader);//see this; this wont work coz
        // MangaReviewUploader has its own legacy code that i didnt wanna touch
        //so we rather call the adapter here and use its upload method

        var mangaReviewAdapter = new MangaReviewAdapter();
        var portal1 = new MyAnimeListPortal(mangaReviewAdapter);
        portal1.uploadReview();//this is the overridden method from ReviewUploader interface
    }
}
