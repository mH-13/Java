import java.io.FileWriter;
import java.io.IOException;

public class File {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("output.txt"); // Create a new file named output.txt
            writer.write("Hello, File!"); // Write to the file
            writer.close(); // Close the file
            System.out.println("File written successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred."); 
        }
    }
}
