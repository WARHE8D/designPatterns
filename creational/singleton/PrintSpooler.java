package creational.singleton;

// enums are thread safe
public enum PrintSpooler {
    INSTANCE;

    private PrintSpooler() {
    }

    public static PrintSpooler getInstance() {
        return INSTANCE;
    }

    void print() {
        System.out.println("printing...");
    }
}

/// /this class allows multiple instances
/// /to convert it to singleton
/// /1 make the class final, which does not allow the class to be extended
//public final class PrintSpooler {
//
//    //2 explicitly create ctor to be private instead of default public
//    // this stops calling print() in other classes
//    private PrintSpooler(){}
//
//    //3 create instance of the class
//    private static PrintSpooler INSTANCE = new PrintSpooler();//static coz only 1 instance be created
//
//    //to access INSTANCE we create a public static method
//    public static PrintSpooler getInstance(){
//        //INSTANCE is never null as we already created INSTANCE above but wrote just for understanding
//        if(INSTANCE == null){
//            INSTANCE = new PrintSpooler();//only creates for the first time getting called
//        }
//        return INSTANCE;
//    }
//
//    void print(){
//        System.out.println("Printing...");
//    }
//}
