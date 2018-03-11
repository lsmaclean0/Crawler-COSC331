package crawler;

// Author: Luke MacLean
// Description: Creates a new Player Object to be moved around the dungeon

public class Player {

    public Object Player;

    /*
    constructor sets Player to "P"
    */
    public Player(){
        Player = "P";
    }

    /*
    Overrides Javas to string method
    */
    @Override
    public String toString(){
        return Player.toString();
    }
}
