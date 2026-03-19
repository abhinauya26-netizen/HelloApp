/**
 * HelloApp.java – A simple Java application that greets the user by name if
 * provided as a command-line argument, or defaults to greeting "World" if no name is
 * given. This use case demonstrates how to handle optional command-line arguments and
 * provide default values in Java.
 *
 * UC 1: Display "Hello World" – The application should display the message
 * "Hello World" to the console when executed.
 * UC 2: Display User Name – The application should accept a user's name as
 * a command-line argument and display a personalized greeting.
 * UC 3: Provide Default Value – The application should display a default greeting
 * if no name is provided as a command-line argument.
 *
 * Usage: java HeloAp [name]
 * - If a name is provided, it will display "Hello, [Name]!"
 * - If no name is provided, it will display "Hello, World!"
 *
 * @author Developer Name
 * @version 3.0
 * @since UC1
 */

/**
 * Key Concepts:
 * 1. Default Values: Providing a fallback value when no input is given
 * 2. Command-line Arguments: Accessing user input via args[] parameter
 * 3. Conditional Statements: Using if to check conditions
 * 4. Boolean Logic: Using logical conditions to control flow
 * 5. Array Length: Checking the number of command-line arguments
 */

public class HeloAp {

    public static void main(String[] args) {

        // Default name
        String name = "World";

        // Check if a name is provided as a command-line argument
        if (args.length > 0) {
            name = args[0]; // Use the provided name
        }

        System.out.println("Hello, " + name + "!");
    }
}