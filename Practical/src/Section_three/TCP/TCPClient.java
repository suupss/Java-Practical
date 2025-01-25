package Section_three.TCP;
import java.io.*;
import java.net.*;
import java.util.Scanner;

public class TCPClient {
    public static void main(String[] args) {
        String hostName = "localhost"; // Host name
        int portNumber = 12345; // Port number

        try (Socket socket = new Socket(hostName, portNumber);
             PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
             Scanner in = new Scanner(socket.getInputStream());
             Scanner stdIn = new Scanner(System.in)) {

            String userInput;
            System.out.println("Connected to server. Type 'exit' to close the connection.");

            while (true) {
                System.out.print("Enter your message: "); // Prompt for input
                userInput = stdIn.nextLine();            // Read user input

                if ("exit".equalsIgnoreCase(userInput)) {
                    System.out.println("Closing connection...");
                    break; // Exit loop and close connection
                }

                out.println(userInput);                  // Send input to the server
                System.out.println("Server response: " + in.nextLine()); // Display server response
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
