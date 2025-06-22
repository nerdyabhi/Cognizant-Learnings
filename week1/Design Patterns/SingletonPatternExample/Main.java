
public class Main {

    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        logger1.log("Logging from logger1");

        Logger logger2 = Logger.getInstance();
        logger2.log("Logging from logger2");

        if (logger1 == logger2) {
            System.out.println("Only one Logger instance exists.");
        } else {
            System.out.println("Class 1 is not equal to class 2 , hence failed ");
        }
    }
}

// Output : 
// java Main
// Logger Initialized.
// [LOG] Logging from logger1
// [LOG] Logging from logger2
// Only one Logger instance exists.
