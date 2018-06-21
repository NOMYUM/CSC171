Name: Angela Chung
Net ID: 30612068
Assignment: project #2
lab section: MW 2 00 - 3 15 pm

There will be an introduction of the game, telling the player which numbers are the clubs, which numbers 
are the strengths, that when they are on the green they will use a putter, and to enter 0 for power to
quit the game.

There will be an option to quit the game or choose one of two courses.

After choosing a course, it will tell the player what hole they are playing and the par and how many yards the ball is from the hole.
The player will have to choose their club and power they want to hit the club. Also when the player is on the green,
the yards will switch to feet. 

"This is stroke..." keeps track of how many strokes it took to get into the hole. 
During the game, it will tell the player how far they hit the game and how much distance they have left.
After getting the ball into the hole,it will give the player the score they have for that whole then it 
will give them the total score for the round.  

To quit the game during the round or while they are play a hole, the player is able to quit the game by
entering 0 for strength. 

After they quit, it will tell them their final score for the current round and then ask the player if they 
would like to another round. They have to say either "Y" or "N"

EXTRA CREDIT:
Did the terminology: birdie, boogey, eagle, etc.
The player can quit the game at the end of each round.
First tried to set bunker and water as the hazards on the holes, so we first used random integer to place random hazards 
on each holes. Setting those traps were fine, couldn't simply find how to go back to previous distance(water case) or force to
use putter(bunker case). For the water case, first tried to use the stroke distance in clubs.java(subtract stroke distance from current distance
to go back to previous distance before going to the water), but couldn't use the variable stroke distance in different class. For the bunker case, tried to
set other wedge method in clubs.java for case ball stuck in the bunker, but somehow it didn't work (the number for distance would come out negative
or it would give out distances like 2345).  
