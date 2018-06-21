
public class Clubs extends Project {

	// Method: chose the club when play is at tee or on fairway
	public static int clubChoice(int club, int power, int distance) {
		if (power == 0) { // if statement: when the player quits the game, no new distance is calculated
			quit = "q";
			return distance;
		}

		int mean = 0;
		int std = 0;
		switch (club) { // switch-case statements: assigns mean and std according to each club
		case 1: // driver
			mean = 230;
			std = 30;
			break;
		case 2: // 3-wood
			mean = 215;
			std = 20;
			break;
		case 3: // 3-iron
			mean = 180;
			std = 20;
			break;
		case 4: // 4-iron
			mean = 170;
			std = 17;
			break;
		case 5: // 5-iron
			mean = 155;
			std = 15;
			break;
		case 6: // 6-iron
			mean = 145;
			std = 15;
			break;
		case 7: // 7-iron
			mean = 135;
			std = 15;
			break;
		case 8: // 8-iron
			mean = 125;
			std = 15;
			break;
		case 9: // 9-iron
			mean = 110;
			std = 10;
			break;
		case 10: // wedge
			mean = 50;
			std = 10;
			break;
		default:
			System.out.println("This club does not exist.");
			break;
		}

		if (power > 10) { // if statement: does not let the player enter an invalid power
			System.out.println("You do have this kind of power.");
			return distance;
		}

		int strokeDistance = nextDistance(mean, std, power); // calculates the distance of the shot
		System.out.println("You hit the ball " + strokeDistance + " yards.");
		distance -= strokeDistance; // subtracts the distance remaining
		return distance;
	}

	/*
	 * //Method: chose the wedge when they are in the bunker public static int wedge
	 * (int power, int distance) { if (power == 0) { //if statement: when the player
	 * quits the game, no new distance is calculated quit = "q"; return distance; }
	 * 
	 * int mean = 0; int std = 0; switch (power) { //switch-case statements: assigns
	 * mean and std according for wedge case 1: mean = 50; std = 10; break; default:
	 * System.out.println("You do not have this kind of power."); break; }
	 * 
	 * if (power > 10) { //if statement: does not let the player enter an invalid
	 * power System.out.println("You do have this kind of power."); return distance;
	 * }
	 * 
	 * int strokeDistance = nextDistance(mean, std, power); //calculates the
	 * distance of the shot System.out.println("You hit the ball " + strokeDistance
	 * + " yards."); distance -= strokeDistance; //subtracts the distance remaining
	 * return distance; }
	 */

	// Method: skips clubs and uses the putter
	public static int putter(int power, int distance) {
		distance *= 3; // converts distance to feet
		int mean = 0;
		int std = 0;

		switch (power) { // switch-case statements: depending what strength is used, that value is used to calculate the distance of the shot
		case 0: // when player enters zero, assigns "q"
			quit = "q";
			break;
		case 1:
			mean = 1;
			std = 1;
			break;
		case 2:
			mean = 2;
			std = 1;
			break;
		case 3:
			mean = 4;
			std = 2;
			break;
		case 4:
			mean = 8;
			std = 2;
			break;
		case 5:
			mean = 12;
			std = 3;
			break;
		case 6:
			mean = 16;
			std = 3;
			break;
		case 7:
			mean = 20;
			std = 4;
			break;
		case 8:
			mean = 25;
			std = 4;
			break;
		case 9:
			mean = 30;
			std = 5;
			break;
		case 10:
			mean = 40;
			std = 5;
			break;
		default:
			System.out.println("You do not have this kind of power.");
			break;
		}

		if (quit.equals("q")) { // if statement: when 0 entered for strength, ends the method
			return userpar;
		}

		int strokeDistance = nextDistance(mean, std, power); // calculates the distance of the shot
		System.out.println("You hit the ball " + strokeDistance + " feet.");
		distance -= strokeDistance; // subtracts the distance remaining
		distance /= 3; // converts distance back to yards.

		return distance;
	}

	// method: calculate the distance of the shot. Including from already existing code
	public static int nextDistance(int mean, int std, int power) {
		double mean_adj = mean * power / 10.0;
		double std_adj = std * power / 10.0;
		int strokeDistance;

		do {
			double val = (rand.nextGaussian() * std_adj) + mean_adj;
			strokeDistance = (int) val;
		} while (strokeDistance < 0);

		return strokeDistance;
	}
}