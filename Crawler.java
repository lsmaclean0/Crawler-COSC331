package crawler;
import java.net.*;
import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

//Author: Luke MacLean
//Date:
//Assignment:

public class Crawler {

    //game Objects
    public static Object [] dungeon = new Object[10];
    public static Player player = new Player();
    public static Monster monster = new Monster();
    public static int PlayerLocation = 0;
    public static int MonsterLoc1;
    public static int MonsterLoc2;
    public static DatagramPacket packet;
    public static InetAddress address;
    public static byte[] a = new byte[1024];
    public static DatagramSocket socket;
    public static boolean Win = false;

    //new Scanner Object to get input from the user
    public static Scanner kyb = new Scanner(System.in);
    public static Object Direction;
    public static int NumSpaces;
    
    public static void main(String [] args) throws Exception {
        socket = new DatagramSocket(8950);
        System.out.println("Crawler server running...\n");
        try {
            //recieve request 
            packet = new DatagramPacket(a, a.length);
            socket.receive(packet);
            System.out.println("User Connected....\n");
            
            //clearig the dungeon
            for(int i = 0; i <= 9; i++){
                dungeon [i] = " ";
            }
            
            //setting up the dungeon
            dungeon [0] = player.toString();

            //populating the dungeon array with monsters
            MonsterLoc1 = NewMonster();
            dungeon [MonsterLoc1] = monster.toString();
            MonsterLoc2 = NewMonster();
            dungeon [MonsterLoc2] = monster.toString();
            
            //response
            //String game = Start();
            //a = game.getBytes();
            String game = Arrays.toString(dungeon);
            a = game.getBytes();
            address = packet.getAddress();
            int port = packet.getPort();
            packet = new DatagramPacket(a, a.length, address, port);
            socket.send(packet);
            
            //loop that stops the game when the player wins
            while(Win != true) {
                
                //for loop used to move the player around the dungeon
                while (PlayerLocation < 9) {
                    System.out.println("game started....");
                    int NumSpaces;
                    String move = "Enter the number of spaces you would like to move: ";
                    SendPacket(move);
                    int p = (int) GetPacket();
                    
                    NumSpaces = p;
                    int sum = PlayerLocation + NumSpaces;

                    if(sum > 9) {
                        System.out.println("Please enter a number, x, such that x + PlayerLocation <=9 ");
                        NumSpaces = 0;
                }

                //removing the Player icon from the board
                dungeon [PlayerLocation] = " ";

                //loops that checks each spot in the dungeon for a monster before moving the Player icon
                for(int i = 0; i <= NumSpaces; i++) {
                    int PL = PlayerLocation;
                    if((PlayerLocation+i) == MonsterLoc1) {
                        String attack;
                        System.out.println("You have encountered a Monster! ");
                        System.out.println("Enter A to attack");
                        attack = kyb.next();
                        if(attack.equalsIgnoreCase("a")){
                            System.out.println("You Defeated the Monster!");
                            continue;
                        } else {
                            System.out.println("You died. Better Luck Next Time");
                            System.exit(0);
                        }
                    }
                }


                PlayerLocation += NumSpaces;

                //Sets Win to true if the player reaches the end of the dungeon
                if(PlayerLocation == 9){
                    System.out.println("You win!");
                    Win = true;
                }


                //changing the location of the player on the board
                dungeon [PlayerLocation] = player.toString();
                System.out.println(Arrays.toString(dungeon));
                }
            }
            
            
            //sending the packet to the client 
            /*
            InetAddress address = packet.getAddress();
            int port = packet.getPort();
            packet = new DatagramPacket(a, a.length, address, port);
            socket.send(packet);
            */
            
        } finally {
            socket.close();
        }
    }
    
   
    
    
    /*
    helper method for Start(), generates a new location between 2 and 9
    for a monster
    */
    public static int NewMonster(){
        int r = (int) (Math.random() * (9 - 2 + 1) + 2);
        return r;
    }

    public static boolean CheckSum(){
        if(NumSpaces + PlayerLocation > 9){
                return false;
            }
        return true;
    }
    
   
    
    
    /**
     *
     * @param data
     * @throws IOException
     */
    public static void SendPacket(String data) throws IOException{
        packet = new DatagramPacket(a, a.length);
        socket.receive(packet);
        System.out.println("Client Request....\n");
        address = packet.getAddress();
        int port = packet.getPort();
        a = data.getBytes();
        packet = new DatagramPacket(a, a.length, address, port);
        socket.send(packet);
        System.out.println("Packet sent...\n" + packet.toString());
    }
    
    public static Object GetPacket() throws IOException{
        Object input = "move";
        a.equals(input);
        packet = new DatagramPacket(a, a.length);
        socket.send(packet);
        packet = new DatagramPacket(a, a.length);
        socket.receive(packet);
        System.out.println("Packet Recived...\n");
        return (Object) packet;
    }
   
}
