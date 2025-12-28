package structural.adapter;


//imagine this class being too old and some random old guy created this and left the company
//I dont wanna touch this code so i make an adapter class that can use this review upload method with our new
// and commonly used ReviewUploader interface
public class MangaReviewUploader {


    //note that this is not the overridden upload() from reviewUploader this is already existing static method just
    //for manage reviews
    public void uploadMangaReview() {
        System.out.println("Manga Review Uploader started...");
        System.out.println("Manga Review successfully uploaded!");
    }
}
