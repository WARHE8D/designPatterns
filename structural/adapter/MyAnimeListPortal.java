package structural.adapter;

public class MyAnimeListPortal {

    private final ReviewUploader reviewUploader;

    public MyAnimeListPortal(ReviewUploader reviewUploader) {
        this.reviewUploader = reviewUploader;
    }

    public void uploadReview() {
        reviewUploader.upload();
    }
}

