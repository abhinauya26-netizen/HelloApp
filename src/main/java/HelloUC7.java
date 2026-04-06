public class HelloUC7 {
    public static void main(String[] args) {

        String greeting;

        // Check if no arguments are provided
        if (args.length == 0) {
            greeting = "Hello, World!";
        } else {
            // Join all arguments with ", "
            String names = String.join(", ", args);
            greeting = "Hello, " + names + "!";
        }

        // Display the greeting
        System.out.println(greeting);
    }
}