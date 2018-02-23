package crawler;
import java.util.*;

// Author: Luke MacLean
// Description:

public class Dungeon
{
    //declaring varables
    Object [] dungeon;
    Player player = new Player();
    Monster monster = new Monster();
    int PlayerLocation = 0;
    int MonsterLoc1;
    int MonsterLoc2;

    //new Scanner Object to get input from the user
    Scanner kyb = new Scanner(System.in);
    Object Direction;
    int NumSpaces;

    /**
    * Constructs a new Dungeon Object
    */
    public Dungeon() {
        dungeon = new Object[10];
    }


    public void Start() {

        boolean Win = false;

        for(int i = 0; i <= 9; i++){
          dungeon [i] = " ";
        }

        dungeon [0] = player.toString();

        //populating the dungeon array with monsters
        MonsterLoc1 = NewMonster();
        dungeon [MonsterLoc1] = monster.toString();
        MonsterLoc2 = NewMonster();
        dungeon [MonsterLoc2] = monster.toString();

        //loop that stops the game when the player wins
        while(Win != true) {

          //printing the dungeon to the console
          System.out.println(Arrays.toString(dungeon));

          //for loop used to move the player around the dungeon
          while (PlayerLocation < 9){

             int NumSpaces;
             System.out.println("Enter the number of spaces you would like to move: ");
             NumSpaces = kyb.nextInt();
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
               }
               else{
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
    }

    /**
     * returns true if the player is still in the dungeon
     * @return
     */
    /*
    helper method for Start(), generates a new location between 2 and 9
    for a monster
    */
    public int NewMonster(){
        int r = (int) (Math.random() * (9 - 2 + 1) + 2);
        return r;
    }

    public boolean CheckSum(){
        if(NumSpaces + PlayerLocation > 9){
                return false;
            }
        return true;
    }


}
