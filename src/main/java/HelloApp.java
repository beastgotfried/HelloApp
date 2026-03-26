/**
 * HelloApp UC1-UC6: Display "Hello World", Multiple Names, or Default Message using substring()
 *
 * UC1: Display "Hello World"
 * UC2: Accept a name as command-line argument and display "Hello, [name]!"
 * UC3: Display "Hello" with Command-Line Argument or Default Message using ternary operator
 * UC4: Display "Hello" with Multiple Command-Line Arguments or Default Message
 * UC5: Display "Hello" with Multiple Command-Line Arguments using Enhanced For Loop
 * UC6: Display "Hello" with Multiple Command-Line Arguments using substring to Remove Trailing Delimiter
 *
 * Description:
 * The app accepts zero or more command-line arguments and prints a greeting. It uses an
 * enhanced for loop to process multiple names and the substring method to remove the 
 * trailing delimiter. If no arguments are provided, it displays "Hello, World!".
 *
 * @author Ankush Wadehra
 * @version 6.0.0
 */
public class HelloApp {

    /**
     * Main method - Entry point for the application
     *
     * This method serves as the entry point for program execution.
     * It reads command-line arguments and builds a comma-separated list of names.
     * Uses an enhanced for loop to append names and a trailing delimiter, then 
     * removes the trailing delimiter using substring() after construction.
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
            StringBuilder nameBuilder = new StringBuilder();
            for (String name : args) {
                // Append each name followed by a comma and space
                nameBuilder.append(name).append(", ");
            }
            
            // Remove the trailing delimiter using substring()
            // Always check length > 0 before calling substring() to avoid errors
            String names = "";
            if (nameBuilder.length() > 0) {
                names = nameBuilder.substring(0, nameBuilder.length() - 2);
            }
            
            // Display the personalized greeting with all names
            System.out.println("Hello, " + names + "!");
        }
    }
}