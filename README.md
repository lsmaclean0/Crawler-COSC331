## Dungeon Crawler
Dungeon Crawler is a very simple dungeon crawler style game where the user (Player) navigates through a dungeon. Within the dungeon the player will encounter Monsters trying to prevent them from reaching the emnd of the dungeon. The player will have to attack each monster they encounter to reach the end of the dungeon. 

## Getting Started

These instructions will get you a copy of the project up and running on your local machine.

### Prerequisites

You must have these installed on your system to run the game
* Java (V7) or later - Language the game is written in 


### Installing 

1. Download or clone a copy of the files to your Downloads folder of destination of your choice 

2. unzip the files to to the Desktop for easy access

3. open a new terminal window and naviagate to the desktop by typing "cd Desktop" 

4. You must compie each of the .java files using "javac <FileName>.java" in the terminal window 

5. next Open a new terminal window and change the directory to Desktop using the same insctructions as step 3

6. In the orignal termianl window type "java Crawler" to start he server
   * you should see "Server starting..." indicating that it started succesfully
   
7. in the second terminal window type "java CrawlerClient" to start the game
   * the game should launch and you should see an array of size 10 with a "P" icon and 1 or 2 "*" icons 

## Running the Game

  * the Array is a representation of the Dungeon the player is navigating 
  * The "P" icon represents the Players current location 
  * You will also notice one or two "*" icons in the dungeon, these represent Monsters 
      * each time you encounter a monster you will have to battle it or you will lose th game 
      * the location of each monster is randomly generated before the game begins 
  * you will be prompted to the enter the number of spaces you would like to move the Player within the dungeon, this is an interger and     the sum of the number of spaces you would like to move and the players current location must be less than 9
      * the Game will promt you to enter a new number if the sum is greater than 9
  * when you encounter a monster you will be promted to attack the monster, if you enter the wrong command you will lose and the game       will exit
  * When you rach the end of the dungeon you will win the game and "You win!" Should display in the console before the game exits 
  
## Built With

* NetBeans IDE - Development Environment (https://netbeans.org/)
* Java (V7) or later - Programming language (https://java.com/en/download/)

## Versioning

Version 1.0, check the edits branch for New commits containg info on updates to the program 

## Authors

* **Luke MacLean** - *Initial work* - (https://github.com/lsmaclean0)
