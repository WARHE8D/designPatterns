package creational.singleton;

public class ImagePrinter {

    void printImg() {
//        var printSpooler = new PrintSpooler();
        //reuses the same instance if already created or make a new one if null
        var printSpooler = PrintSpooler.getInstance();
        printSpooler.print();
    }
}
