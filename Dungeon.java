package crawler;
import java.util.*;

// Author: Luke MacLean
// Description:

public class Dungeon 
{
    //declaring varables 
    Object [] dungeon;
    Player player = new Player();
    Object [] Monster = new Object ['*'];
    Object PlayerLocation = 0;
    Object MonsterLoc1;
    Object MonsterLoc2;
    Object MonsterLoc3;
    
    public Dungeon(){
        dungeon = new Object[10];
    }
    
    public void Start(){
        
        //replacing all of null indicies in the Dungeon Array with blank spaces for easier viewing 
        for(int i = 0; i <= 9; i++){
            dungeon[i] = " ";
        }
        
        //setting player to the start of the dungeon, dungeon[0]
        dungeon [0] = player.toString();
        
        System.out.println(Arrays.toString(dungeon));
        
        
    }
    
    /*
    helper method for Start(), denerates a new location between 2 and 10 
    for a monster 
    */
    public Object NewMonster(){
        Random ran = new Random((10 - 2) + 2);
        return (Object) ran;
    }
    
        

}