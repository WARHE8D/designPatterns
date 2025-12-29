package structural.facade;

public abstract class EncryptFacade {
    public static void encrypt() {
        System.out.println("some service to validate input strings....");
        System.out.println("Some other service to fetch values from database...");
        System.out.println("Some service to update the given values in database....");
        System.out.println("Calling encryption service.....");
        System.out.println("returning encrypted values");
        //yes im too lazy to write an actual service pls
    }
}
