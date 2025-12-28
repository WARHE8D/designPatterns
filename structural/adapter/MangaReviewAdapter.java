package structural.adapter;

public class MangaReviewAdapter implements ReviewUploader {

    private final MangaReviewUploader mangaReviewUploader;

    public MangaReviewAdapter() {
        this.mangaReviewUploader = new MangaReviewUploader();
    }

    //now we have the common overridden upload method calling the old mangauploader
    @Override
    public void upload() {
        mangaReviewUploader.uploadMangaReview();
    }
}
