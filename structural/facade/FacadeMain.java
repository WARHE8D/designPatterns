package structural.facade;

public class FacadeMain {
    public static void main(String[] args) {
        EncryptFacade.encrypt();//thats it the client doesnt need to know the backend logic all it has to do is
        // pass arguments if any and call thee method
    }
}
