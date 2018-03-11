

// Author: Luke MacLean

import java.io.*;
import java.net.*;

// Description:

public class CrawlerClient {

    private static int Port = 8950;


    public static DatagramSocket socket;

    /**
     * constructs a client by connecting the the server
     * @param serverAddress
     */
    public static void main(String [] args) throws SocketException, UnknownHostException, IOException {
      socket = new DatagramSocket();
      System.out.println("Searching for server...\n");
      while(true) {
        if(args.length != 1){
            System.out.println("Usage: CrawlerClient <hostName>");
            return;
        }

        //setting up a new request

        byte[] buf = new byte[1024];
        InetAddress add = InetAddress.getByName(args[0]);
        DatagramPacket packet = new DatagramPacket(buf, buf.length, add, 8950);
        socket.send(packet);

        //getting a response
        packet = new DatagramPacket(buf, buf.length);
        socket.receive(packet);
        System.out.println("Packet Recieved: ");

        //display to console
        String in = new String(packet.getData(), 0, packet.getLength());
        System.out.println("packet: "  + in.toString());


      }
      //socket.close();
    }
}
