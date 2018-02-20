package crawler;

// Author: Luke MacLean
// Description: Creates a new Player Object to be moved around the dungeon 

public class Player 
{

    Object Player;
    
    /*
    constructor sets Player to "P"
    */
    public Player(){
        Player = "P";
    }
    
    @Override
    public String toString(){
        return Player.toString();
    }
}