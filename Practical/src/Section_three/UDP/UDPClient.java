package Section_three.UDP;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class UDPClient {
    public static void main(String[] args) {
        String serverAddress = "localhost"; 
        int serverPort = 12345; 

        try (DatagramSocket clientSocket = new DatagramSocket();
             Scanner scanner = new Scanner(System.in)) {
            InetAddress serverIP = InetAddress.getByName(serverAddress);

            byte[] sendBuffer;
            byte[] receiveBuffer = new byte[1024];

            while (true) {
                
                System.out.print("Enter your message : ");
                String message = scanner.nextLine();



                sendBuffer = message.getBytes();
                DatagramPacket sendPacket = new DatagramPacket(sendBuffer, sendBuffer.length, serverIP, serverPort);
                clientSocket.send(sendPacket);

                DatagramPacket receivePacket = new DatagramPacket(receiveBuffer, receiveBuffer.length);
                clientSocket.receive(receivePacket);
                String serverResponse = new String(receivePacket.getData(), 0, receivePacket.getLength());
                System.out.println("Server response: " + serverResponse);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

