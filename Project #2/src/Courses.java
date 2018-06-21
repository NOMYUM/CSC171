/*import java.util.Random;
*/

public class Courses extends Project {

	// method: holes 1-18 and their respected yards and par for Genesee Valley Park North Course
	public int nopecourse() {
		System.out.println("\nYou are playing at Genesee Valley Park North Course.");
		System.out.println("- - - - - - - - - - - - - - - - -");

		for (int i = 0; i <= 18; i++) { // for loop: assigns yard and par for each hole
			System.out.println("Hole " + (i + 1));

			int[] yard = { 530, 305, 331, 201, 500, 226, 409, 410, 229, 433, 363, 174, 545, 419, 512, 410, 320, 170 };
			int[] par = { 5, 4, 4, 3, 5, 3, 4, 4, 3, 4, 4, 3, 5, 4, 5, 4, 4, 3 };
			userpar += hole(null, yard[i], par[i]);

			System.out.println("Your total score is: " + userpar + "\n");
			sent(userpar);

			if (quit.equalsIgnoreCase("q")) { // if statement: breaks loop when player enters 0 for power
				break;
			}
		}
		return userpar;
	}

	// method: holes 1-18 and their respected yards and par for The Old Course at St. Andrews
	public int nevercourse() {
		System.out.println("\nYou are playing at  The Old Course at St. Andrews.");
		System.out.println("- - - - - - - - - - - - - - - - -");

		for (int i = 0; i <= 18; i++) { // for loop: assigns yard and par for each hole
			System.out.println("Hole " + (i + 1));

			String[] name = { "Burn", "Dyke", "Cartgate(Out)", "Ginger Beer", "Hole O'Cross(Out)", "Heathery(Out)",
					"High(Out)", "Short", "End", "Bobby Jones", "High(In)", "Heathery(In)", "Hole O'Cross(In)", "Long",
					"Cartage (In)", "Corner of the Dyke, Road", "Tom Morris" };
			int[] yard = { 376, 453, 397, 480, 568, 412, 371, 175, 352, 386, 174, 348, 465, 618, 455, 423, 495, 357 };
			int[] par = { 4, 4, 4, 4, 5, 4, 4, 3, 4, 4, 3, 4, 4, 5, 4, 4, 4, 4 };
			userpar += hole(name[i], yard[i], par[i]);

			System.out.println("Your total score is: " + userpar + "\n");
			sent(userpar);

			if (quit.equalsIgnoreCase("q")) { // if statement: breaks loop when player enters 0 for power
				break;
			}
		}
		return userpar;
	}

	// method: yard and par for each hole
	public int hole(String name, int yard, int par) {
		int distance = yard;
		int stroke = 0;

		/*
		 * Random rands = new Random(); //this is for when the ball is in the water or
		 * in the bunker int water1 = rands.nextInt(125) + 85; int bunk1 =
		 * rands.nextInt(275) + 225;
		 */

		System.out.println(yard + " yards, par " + par + ".");

		while (Math.abs(distance * 3) > 1) { // while loop: player keeps trying until the ball is in the hole or within 1 foot of the hole
			if (distance > 20) { // if-else-if statement: tells player how far they are from the ball and whether it went over or not
				System.out.println("Your ball is " + distance + " yards from the hole.");
				System.out.println("\nThis is stroke " + (stroke + 1));
				distance = fairway(stroke, distance);
			} else if (Math.abs(distance) > 20) {
				distance = Math.abs(distance);
				System.out.println("Your ball went past the hole and is " + distance + " yards from the hole.");
				System.out.println("\nThis is stroke " + (stroke + 1));
				distance = fairway(stroke, distance);

				/*
				 * } else if (distance - bunk1 < 300) { System.out.print("Your ball is " +
				 * distance + " feet from the hole."); System.out.println("\nThis is stroke " +
				 * (stroke+1)); distance = bunker(distance);
				 * 
				 * } else if (Math.abs(distance) - water1 < 30) {
				 * System.out.print("Your ball is in the water!");
				 * System.out.println("\nThis is stroke " + (stroke+1));
				 */

			} else if (distance < 20 && distance > 1) {
				System.out.println("Your ball is " + distance * 3 + " feet from the hole.");
				System.out.println("\nThis is stroke " + (stroke + 1));
				distance = green(distance);
			} else {
				distance = Math.abs(distance);
				System.out.println("Your ball went past the hole and is " + distance * 3 + " feet from the hole.");
				System.out.println("\nThis is stroke " + (stroke + 1));
				distance = green(distance);
			}

			if (quit.equals("q")) { // lets the player quit the round --> leaves method
				return userpar;
			}

			stroke += 1;
			userpar = stroke - par;
		}

		System.out.println("It's in the hole!\n");
		System.out.println("- - - - - - - - - - - - - - - - -");

		if (userpar == 0) { // if statement: prints par if the player has par or prints score if they do not have par
			String score = "par";
			System.out.println("Your score on this hole is : " + score);
		} else {
			int score = userpar;
			System.out.println("Your score on this hole is: " + score);
		}
		return userpar;
	}

	// method: when ball is within 20 yards (60 feet) of the hole, it will switch the clubs to a putter
	public int green(int distance) {
		System.out.println("\nYou are in the green and using the putter.");
		System.out.print("Putt power [1-10]: ");

		int power = sad.nextInt();
		return distance = Clubs.putter(power, distance);
	}

	/*
	 * //method when the ball is in the bunker, it will switch clubs to wedge public
	 * int bunker(int distance) {
	 * System.out.println("\nYou are in the bunker and using the wedge.");
	 * 
	 * System.out.print("Wedge power [1-10]: "); int power = sad.nextInt();
	 * 
	 * return distance = Clubs.wedge(distance, power); }
	 */

	/*
	 * //method: when ball falls in water but still uses clubs public int water(int
	 * stroke, int distance) { if (stroke == 0) { //if-else statement: tells the
	 * player whether they are at tee or in the fairway
	 * System.out.println("\nYou went back to your previous position.");
	 * System.out.print("Choose your club [1-10]: "); int club = sad.nextInt();
	 * 
	 * System.out.print("Power [1-10]: "); int power = sad.nextInt();
	 * 
	 * return distance = Clubs.clubChoice(club, power, distance); } }
	 */

	// method: every shot taken with clubs
	public int fairway(int stroke, int distance) {
		if (stroke == 0) { // if-else statement: tells the player whether they are at tee or in the fairway
			System.out.println("\nYou are at the tee.");
		} else {
			System.out.println("\nYou are in the fairway.");
		}

		System.out.print("Choose your club [1-10]: ");
		int club = sad.nextInt();

		System.out.print("Power [1-10]: ");
		int power = sad.nextInt();

		return distance = Clubs.clubChoice(club, power, distance);
	}
}