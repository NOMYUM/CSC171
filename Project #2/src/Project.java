
/*Name: Angela Chung
 * Net ID: achung13 
 * Assignment Number: project #2
 * lab section: MW 2 00 - 3 15 pm 
 * I did not copy code from anyone on this assignment
 */

import java.util.Random;
import java.util.Scanner;

public class Project {
	protected static String quit = "temporary";
	protected static Scanner sad = new Scanner(System.in);
	protected static Random rand = new Random();
	protected static int userpar = 0;

	public static void main(String[] args) {

		// Introduction
		System.out.println("                      Welcome to TTY Golf!");
		System.out.println("                      - - - - - - - - - - ");
		System.out.println(
				"\nFor each shot other than putting, the player will select a club (a number 1–10): \n   1 is a driver\n   2 is a 3-wood\n   3 is a 3-iron\n   4 is a 4-iron\n   and so on ending with 10 representing a wedge.");
		System.out.println("When on the green, you will use a putter.");
		System.out.println("The power with which to hit the ball (also a number 1–10)");
		System.out.println("Enter 0 for power to quit the game");

		// while loop: player chooses 0-2 depending what golf course they want to play
		// or want to quit
		while (!quit.equalsIgnoreCase("q")) {
			System.out.println(
					"\nPlease select a course or quit: \n1. Genesee Valley Park North Course\n2. The Old Course at St. Andrews\n0. QUIT");
			System.out.print("Your choice [0-2]: ");
			int course = sad.nextInt();
			userpar = 0;
			int inputValid = 1;

			switch (course) { // switch-case-break statements: to quit or continue playing
			case 0:
				quit = "q";
				inputValid = 0;
				break;
			case 1:
				Courses course1 = new Courses();
				userpar = course1.nopecourse();
				System.out.println("Your final score for the round is: " + userpar + "\n");
				break;
			case 2:
				Courses course2 = new Courses();
				userpar = course2.nevercourse();
				System.out.println("Your final score for the round is: " + userpar + "\n");
				break;
			default:
				System.out.println("This option does not exist");
				inputValid = 0;
				break;
			}
			sent(userpar);

			while (inputValid != 0) { // while loop: does not let the player enter something invalid
				System.out.print("Would you like to play another round [Y/N]: ");
				quit = sad.next();

				if (quit.equalsIgnoreCase("Y")) {
					inputValid = 0;
				} else if (quit.equalsIgnoreCase("N")) {
					inputValid = 0;
				} else {
					System.out.println("\nThis option does not exist");
					inputValid = 1;
				}
			}
		}
		System.out.println("\nThank you for playing!");
	}

	// Method: creates random sentences depending whether you get par or not
	public static void sent(int par) {
		int sent = rand.nextInt(2);
		switch (sent) { // switch-case-break statements: creates random sentences
		case 0:
			if (par == 0) { // if-else-if statement: depending whether you get par or not
				System.out.println("WOW, YOU GOT PAR!\n");
				System.out.println("- - - - - - - - - - - - - - - - -");
			} else if (par < 0) {
				System.out.println("EH, YOU COULD DO BETTER\n");
			} else {
				System.out.println("YOU'LL GET PAR EVENTUALLY\n");
			}
			if (par == -1) {
				System.out.println("YOU GOT BIRDIE");
				System.out.println("- - - - - - - - - - - - - - - - -");
			} else if (par == -2) {
				System.out.println("YOU GOT EAGLE");
				System.out.println("- - - - - - - - - - - - - - - - -");
			} else if (par == 1) {
				System.out.println("YOU GOT BOOGEY");
				System.out.println("- - - - - - - - - - - - - - - - -");
			} else if (par == 2) {
				System.out.println("YOU GOT DOUBLE BOGGEY");
				System.out.println("- - - - - - - - - - - - - - - - -");
			}
			break;
		case 1:
			if (par == 0) { // if-else-if statement: depending whether you get par or not
				System.out.println("WOOHOO!! NONE OVER\n");
				System.out.println("- - - - - - - - - - - - - - - - -");
			} else if (par < 0) {
				System.out.println("*SYMPATHETIC GOLF CLAP*\n");
			} else {
				System.out.println("MEDIOCRE GOLFING SKILLS\n");
			}
			if (par == -1) {
				System.out.println("YOU GOT BIRDIE\n");
				System.out.println("- - - - - - - - - - - - - - - - -");
			} else if (par == -2) {
				System.out.println("YOU GOT EAGLE\n");
				System.out.println("- - - - - - - - - - - - - - - - -");
			} else if (par == 1) {
				System.out.println("YOU GOT BOOGEY\n");
				System.out.println("- - - - - - - - - - - - - - - - -");
			} else if (par == 2) {
				System.out.println("YOU GOT DOUBLE BOGGEY\n");
				System.out.println("- - - - - - - - - - - - - - - - -");
			}
			break;
		case 2:
			if (par == 0) { // if-else-if statement: depending whether you get par or not
				System.out.println("BETTER THAN A PRO GOLFER\n");
				System.out.println("- - - - - - - - - - - - - - - - -");
			} else if (par < 0) {
				System.out.println("IT'S OKAY IF YOU SUCK AT GOLF\n");
			} else {
				System.out.println("YAY! YOU'RE AVERAGE!\n");
			}
			if (par == -1) {
				System.out.println("YOU GOT BIRDIE\n");
				System.out.println("- - - - - - - - - - - - - - - - -");
			} else if (par == -2) {
				System.out.println("YOU GOT EAGLE\n");
				System.out.println("- - - - - - - - - - - - - - - - -");
			} else if (par == 1) {
				System.out.println("YOU GOT BOOGEY\n");
				System.out.println("- - - - - - - - - - - - - - - - -");
			} else if (par == 2) {
				System.out.println("YOU GOT DOUBLE BOGGEY\n");
				System.out.println("- - - - - - - - - - - - - - - - -");
			}
			break;
		}
	}
}