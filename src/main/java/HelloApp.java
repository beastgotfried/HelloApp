/**
 * HelloApp UC1-UC7: Display "Hello World", Multiple Names, or Default Message using String.join()
 *
 * UC1: Display "Hello World"
 * UC2: Accept a name as command-line argument and display "Hello, [name]!"
 * UC3: Display "Hello" with Command-Line Argument or Default Message using ternary operator
 * UC4: Display "Hello" with Multiple Command-Line Arguments or Default Message
 * UC5: Display "Hello" with Multiple Command-Line Arguments using Enhanced For Loop
 * UC6: Display "Hello" with Multiple Command-Line Arguments using substring to Remove Trailing Delimiter
 * UC7: Display "Hello" with Multiple Command-Line Arguments using String.join() Method or Default Message
 *
 * Description:
 * The app accepts zero or more command-line arguments and prints a greeting. It uses the 
 * String.join() method to efficiently concatenate multiple names with a specified delimiter.
 * If no arguments are provided, it displays the default greeting: "Hello, World!".
 *
 * @author Ankush Wadehra
 * @version 7.0.0
 */
public class HelloApp {

    /**
     * Main method - Entry point for the application
     *
     * This method serves as the entry point for program execution.
     * It reads command-line arguments and builds a comma-separated list of names.
     * Uses String.join() method for efficient concatenation without trailing characters.
     *
     * Usage:
     * java HelloApp                      - Displays "Hello, World!"
     * java HelloApp Alice                 - Displays "Hello, Alice!"
     * java HelloApp Alice Bob Charlie    - Displays "Hello, Alice, Bob, Charlie!"
     *
     * @param args Command-line arguments containing the user's names
     */
    public static void main(String[] args) {
        // Check if arguments are provided
        if (args.length == 0) {
            // Default message if no arguments are provided
            System.out.println("Hello, World!");
        } else {
            // Concatenate all names using String.join() with a specified delimiter
            // This replaces manual iteration and trailing character handling
            String names = String.join(", ", args);

            // Display the personalized greeting with all names
            System.out.println("Hello, " + names + "!");
        }
    }
}