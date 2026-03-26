/**
 * HelloApp UC1-UC5: Display "Hello World", Multiple Names, or Default Message using Enhanced For Loop
 *
 * UC1: Display "Hello World"
 * UC2: Accept a name as command-line argument and display "Hello, [name]!"
 * UC3: Display "Hello" with Command-Line Argument or Default Message using ternary operator
 * UC4: Display "Hello" with Multiple Command-Line Arguments or Default Message
 * UC5: Display "Hello" with Multiple Command-Line Arguments using Enhanced For Loop or Default Message
 *
 * Description:
 * The app accepts zero or more command-line arguments and prints a greeting. It uses an
 * enhanced for loop (for-each loop) to process multiple names. If no arguments are provided,
 * it displays the default greeting: "Hello, World!".
 *
 * @author Ankush Wadehra
 * @version 5.0.0
 */
public class HelloApp {

    /**
     * Main method - Entry point for the application
     *
     * This method serves as the entry point for program execution.
     * It reads command-line arguments and builds a comma-separated list of names.
     * Use args.length == 0 to detect missing arguments.
     * Use for (String name : args) to iterate through all arguments.
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
            // Build the comma-separated list of names using StringBuilder
            StringBuilder namesList = new StringBuilder();
            for (String name : args) {
                // Add a comma and space if the StringBuilder is not empty
                if (namesList.length() > 0) {
                    namesList.append(", ");
                }
                namesList.append(name);
            }
            // Display the personalized greeting with all names
            System.out.println("Hello, " + namesList.toString() + "!");
        }
    }
}