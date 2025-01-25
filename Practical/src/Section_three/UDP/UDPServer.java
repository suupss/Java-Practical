package Section_three.UDP;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPServer {
    public static void main(String[] args) {
        int port = 12345; 
        try (DatagramSocket serverSocket = new DatagramSocket(port)) {
            System.out.println("Server is running on port " + port);

            byte[] receiveBuffer = new byte[1024];
            byte[] sendBuffer;

            while (true) {
                // Receive data from the client
                DatagramPacket receivePacket = new DatagramPacket(receiveBuffer, receiveBuffer.length);
                serverSocket.receive(receivePacket);
                String clientMessage = new String(receivePacket.getData(), 0, receivePacket.getLength());
                System.out.println("Received from client: " + clientMessage);

               
                String response = "Acknowledgment: Received '" + clientMessage + "'";
                sendBuffer = response.getBytes();

               
                DatagramPacket sendPacket = new DatagramPacket(
                        sendBuffer,
                        sendBuffer.length,
                        receivePacket.getAddress(),
                        receivePacket.getPort()
                );
                serverSocket.send(sendPacket);
                System.out.println("Acknowledgment sent to client.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
