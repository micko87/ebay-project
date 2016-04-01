/**
 *   File Name: RequestInput.java<br>
 *
 *   LastName, FirstName<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Mar 30, 2016
 *
 */

package com.sqa.MA.util.helpers;

import java.util.Scanner;

/**
 * RequestInput //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author LastName, FirstName
 * @version 1.0.0
 * @since 1.0
 *
 */
public class RequestInput {

	private static Scanner scanner;

	// Get a char value from the user
	public static char getChar(String question) {
		return 0;
	}

	// Get a char value from the user, must be an acceptable value
	public static char getChar(String question, char... c) {
		return 0;
	}

	// Get a double value from the user
	public static double getDouble(String question) {
		return 0;
	}

	// Get a int from the user, must be in acceptable range value
	public static int getInt(String question, int... acceptableNumber) {
		String input = null;
		int resultValue;
		boolean validInt = false;
		scanner = new Scanner(System.in);
		while (true) {
			try {
				System.out.println(question);
				input = scanner.nextLine();
				resultValue = Integer.parseInt(input);
				for (int i = 0; i < acceptableNumber.length; i++) {
					if (resultValue != acceptableNumber[i]) {
						validInt = true;
					}
				}
				if (!validInt) {
					throw new InvalidAcceptableNumberException();
				}
				return resultValue;

			} catch (NumberFormatException e) {
				System.out.println("You have not provided a valid interger type (" + input + ")");

			} catch (InvalidAcceptableNumberException e) {
				System.out.println("You have not provided an acceptable valid number (" + input + ")");
			}
		}
	}

	// Get a String from the user, must be an acceptable value
	public static String getString(String question, String... s) {
		String input;
		String resultValue;
		scanner = new Scanner(System.in);
		System.out.print(question);
		input = scanner.nextLine();
		resultValue = input;
		return resultValue;
	}

	// Create your own helper method that you may find useful

}
