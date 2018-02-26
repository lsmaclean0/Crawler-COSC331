"# Dungeon Crawler" 
Dungeon Crawler is a very simple dungeon crawler style game where the user (Player) navigates through a dungeon. Within the dungeon the player will encounter Monsters trying to prevent them from reaching the emnd of the dungeon. THe player will battle each monster 

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. See deployment for notes on how to deploy the project on a live system.

### Prerequisites

You must have these installed on your system to run the game
* NetBeans IDE - Development Environment 
* Java (V7) or later - Language the game is written in 


### Installing 

A step by step series of examples that tell you have to get a development env running

1. Open the Netbeans IDE and crate a new project named "Dungeon Crawler" 
    * you can save this wherever you would like, I used "C:\Users\Luke\Desktop" as an example 
  
2. Open the Crawler.java file in the IDE and click run, the little green arrow in the toolbar at the top

## Running the Game

After Clciling on the Run icon 
  * this will open a console window displaying an Array of size 10 with a "P" icon at the first index of the array 
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
