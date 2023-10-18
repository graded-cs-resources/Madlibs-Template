import java.util.Scanner;

public class App {
    
    /**
     * This method is the primary driver method for your program.
     * It should primarily call other methods to do its work.
     * Do NOT edit this method until after you have fully satisfied the reqs for a 5
     */

    public void start() {
        String userName = getUserName();
        printGreeting(userName);
        printInstructions();
        doMadlib();
        System.out.println("hi");
    }
    
    /* Here you should create all missing methods used by the start() method
     * I have created the signature for ONE of the methods below.
     * You can create any other methods you need as well!
     */ 
    
    public void printInstructions() {
        
    }
    
  

    /* DO NOT TOUCH OR EDIT THE METHOD BELOW! ADD NO CODE BELOW THIS LINE */
    public static void main(String[] args) throws Exception {
        new App().start();
    }
}
