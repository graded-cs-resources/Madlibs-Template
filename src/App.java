import java.util.Scanner;

public class App {
    
    private String userName;
    /**
     * This method is the primary driver method for your program.
     * It should primarily call other methods to do its work.
     */
    public void start() {
        userName = getUserName();
        printGreeting(userName);
        printInstructions();
        doMadlib();
    }
    
    // TODO: create all missing methods used by the start() method
    // You can create any other methods you need as well!
    
    
    public static void main(String[] args) throws Exception {
        new App().start();
    }
}
