package crawler;

// Author: Luke MacLean
// Description:

public class Monster
{

    public Object Monster;

    /*
    Constructor, Assigns an Icon, *, to the Monster feild 
    */
    public Monster(){
        Monster = "*";
    }

    /*
    Overrides Javas to string method
    */
    @Override
    public String toString(){
        return Monster.toString();
    }



}
