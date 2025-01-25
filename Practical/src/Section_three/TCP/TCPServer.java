package Section_three.TCP;

import java.io.*;
import java.net.*;

public class TCPServer {
    public static void main(String[] args) {
        int portNumber = 12345;

        try (ServerSocket serverSocket = new ServerSocket(portNumber)) {
            System.out.println("Server is running...");

            while (true) {
                try (Socket clientSocket = serverSocket.accept();
                     PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
                     BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()))) {

                    String inputLine;
                    while ((inputLine = in.readLine()) != null) {
                        System.out.println("Received: " + inputLine); // Log client message
                        out.println("Echo: " + inputLine); // Echo the message back
                    }
                } catch (IOException e) {
                    System.out.println("Exception caught when trying to listen on port " + portNumber);
                    e.printStackTrace();
                }
            }
        } catch (IOException e) {
            System.out.println("Could not listen on port " + portNumber);
            e.printStackTrace();
        }
    }
}
