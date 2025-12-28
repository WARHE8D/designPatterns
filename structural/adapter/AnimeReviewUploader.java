package structural.adapter;

public class AnimeReviewUploader implements ReviewUploader {

    @Override
    public void upload() {
        System.out.println("Anime Review Uploader started...");
        System.out.println("Anime Review successfully uploaded!");
    }
}
