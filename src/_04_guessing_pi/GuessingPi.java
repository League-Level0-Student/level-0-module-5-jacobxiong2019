package _04_guessing_pi;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 0
 */

import javax.swing.JOptionPane;

public class GuessingPi {
	// 1. Make a main method and make sure your program can run
	public static void main(String[] args) {
		
	
		// 2. Make a String variable to hold the value of Pi.
		String pi = "3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421"
				+ "170679821480865132823066470938446095505822317253594081284811174502841027019385211055596446229489549"
				+ "303819644288109756659334461284756482337867831652712019091456485669234603486104543266482133936072602"
				+ "49141273724587006606315588174881520";
		//    Get the first few digits from http://www.piday.org/million/.

		// 3. Print out the first 3 digits of Pi to the console.
				System.out.println(pi.charAt(0)+ "" + pi.charAt(1) + "" + pi.charAt(2) + "" + pi.charAt(3));
		//    The first value is "pi.charAt(0)", the second is "pi.charAt(1)", etc.
		//    Run your program to see how this works.

		// 9. If you want to give the user more than one chance to guess,
		//    put a for loop around steps 4-8.

			// 4. Create a for loop that will step through each digit of pi (steps 5-8)
				for(int i = 0; i < pi.length(); i++)
				{
			//    NOTE: The number of digits in your string will be
			//       yourStringVariable.length()

				// 5. Ask the user for the NEXT digit of pi.
				String nextDigit = JOptionPane.showInputDialog("Type the next digit of PI");
				// 6. Compare the user's input to the next digit of your pi variable 
				//    (look at step 3 for a clue).
				//    HINT: use charAt(0) to get 1st char of user input String 
				if(nextDigit.equals(pi.charAt(i)+""))
				{
					JOptionPane.showMessageDialog(null, "Correct!");
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Incorrect");
					break;
				}
					// 7. If they are correct, print out "correct".

					// 8. If they are not, print out "incorrect" and tell them
					//    to start over. Use 'break;' to break out of the loop.
				}
	}
}


