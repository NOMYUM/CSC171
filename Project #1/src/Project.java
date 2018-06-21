/*Name: Angela Chung
 * Net ID: 30612068 
 * Assignment: project #1
 * lab section: MW 2 00 - 3 15 pm 
 * I did not copy code from anyone on this assignment
 */


import java.util.Scanner;
import java.util.Random;


public class Project {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("       TTY Projectile Game V1.02 "); //intro
		System.out.println("       Enter 0 for either speed or angle to QUIT the game");

		int score = 50;  //initial score
		double speed0 = 0; //initial values 
		double angle0 = 0;
		int count = 1; //round 

		Random distancer=new Random(); //random variable for the distance of the wall
		double distance=distancer.nextInt(70) + 50;

		Random heightr=new Random(); //random variable for the height of the wall
		double height=heightr.nextInt(60) + 35;

		System.out.println(" "); //space

		do {

			long startTime; //start time
			long endTime;   //end time
			double time;    //time difference
			startTime = System.currentTimeMillis(); 

			System.out.println("ROUND : " + count );
			System.out.println("Enter the speed");
			double speed=scan.nextInt();
			speed0= speed;                         //speed scanned

			System.out.println("Enter the angle");	
			double angle=scan.nextInt();
			angle0= angle;                        // angle scanned 

			if ( speed !=0 && angle !=0) {  // not to show the loop when 0 0 are entered for speed and angle


				System.out.println("----------------------------");

				endTime = System.currentTimeMillis();
				time = (endTime - startTime) / 1000.0; // milisec to sec
				distance = distance - (3 * time ); //wall velocity


				if ( distance > 0) { //to stop the wall at 0

					double point = distance * Math.tan(Math.toRadians(angle)) - ( 9.8 * distance * distance) / ( 2 * (speed * Math.cos(Math.toRadians(angle))) * (speed *  Math.cos(Math.toRadians(angle))));
					System.out.println("\nElapsed Time is: " + time );
					System.out.println("height of the wall is: " +  height );
					System.out.println("distance of the wall is: " + distance);
					System.out.println("Your ball hit: " + point);
					System.out.println(" ");


					if ( point >= height ) { // if and else statements to score each round

						if ( (point - height ) <=10 ) { 
							System.out.println(" You made it over!!"); 
							score = score + 4;
						}
						else if ( (point - height) > 10 ) {
							System.out.println("There is plenty of room left.");
							score = score + 2;
						}
					}else if ( height > point ) {
						if  ( (height - point) <= 9 ){
							System.out.println("It's not quite over...");
							score = score - 1;
						}
						else if ( (height - point) > 9) {
							System.out.println("not even close");
							score = score - 3;
						}

					}

					Random intror = new Random(); // random sentences for Extra cred 1
					int intro = intror.nextInt(8) + 1 ; 

					switch ( intro ) { 

					case 1 : System.out.println("THE BALL FELL INTO THE LAVA... WEIRDLY IT DIDN'T MELT");
					break;
					case 2 : System.out.println("THE DOG IS PLAYING WITH THE BALL. TAKE THE BALL");
					break;
					case 3 : System.out.println("THE BALL HIT SOMEONE IN THE HEAD. SHAME ON YOU");
					break;
					case 4 : System.out.println("HOLD YOUR BREATH WHEN YOU LAUNCH THE BALL");
					break;
					case 5 : System.out.println("THE BALL IS VERY DIRTY... CLEAN IT");
					break;
					case 6 : System.out.println("TODAY IS THE DAY YOU WILL WIN... HOPEFULLY");
					break;
					case 7 : System.out.println("IT IS COLD TODAY. WEAR SOME GLOVES");
					break;
					case 8 : System.out.println("YOU SHOULD EAT SOME FOOD BEFORE YOU LAUNCH THE BALL");
					break;


					}
					count++;   // to count the rounds
				}else {  //when the wall reaches 0
					speed0 = 0;
					angle0 = 0;
					System.out.println(" The wall has reached to you "); }
			}  
			
			System.out.println(" ");
			System.out.println("Your score is " + score);




			System.out.println("----------------------------");






		} while ( speed0 !=0 && angle0 !=0 );

		System.out.println("GAME OVER");
		System.out.println("Thank you for playing!");

		scan.close();





	}

}