package structural.adapter;

public class MangaReviewAdapter extends MangaReviewUploader
        implements ReviewUploader {

    //by extending MangaReviewUploader we dont need the construstor and can call uploadMangaReview directly
//    private final MangaReviewUploader mangaReviewUploader;
//
//    public MangaReviewAdapter() {
//        this.mangaReviewUploader = new MangaReviewUploader();
//    }

    //now we have the common overridden upload method calling the old mangauploader
    @Override
    public void upload() {
//        mangaReviewUploader.uploadMangaReview();
        uploadMangaReview();
    }

    @Override
    public void uploadMangaReview() {
        System.out.println("Manga Review Uploader started...");
        System.out.println("Manga Review successfully uploaded!");
    }
}
