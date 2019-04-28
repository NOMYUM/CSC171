Name: Angela Chung 
Net ID: 30612068 
Assignment: 14
lab section: MW 2 00 - 3 15 pm

QUESTION 1
A program that reads a string from the user, converts that string to an integer
using Integer.parseInt, increments that value and prints the result. Handle the
NumberFormatException to print an appropriate message if the user’s input is not
the decimal representation of a number.

QUESTION 2 
A program that reads a number, then a string, then another number from the user (all on one line). If the
string is “+” you it adds the two numbers and print the result. If it’s “-” it subtract them, and so on for
 “*”, “/”, and “%”. Catch both ArithmeticException and InputMismatchException to prevent crashes and print suitable 
(different) messages on bad input.

QUESTION 3
A program with a static method that takes a Scanner as argument and returns
the next integer read from the Scanner. If the user doesn’t enter a number, the program re-prompts and 
tries again. To do this, catch any InputMismatchException and use that in combination with a loop to re-prompt 
and re-read. Uses  Scanner.nextLine to skip the non-numeric input.

QUESTION 4
A program with a static method that takes a List of Objects and an integer index as parameters and returns 
the element in the List at the given index or null if there is no such element. This is by catching the
IndexOutOfBoundsException. 
 
QUESTION 5
A program that prompts the user for a filename and prints the contents of the file
to the console. If the file does not exist, print an informative message.