package Exceptions;
/**
 * Assignment 1 PasswordCheckerUtility
 * 9/14/2021
 * CMSC 204
 * CRN: 23452
 * @author Jeffrey Tam
 * 
 * This class sends an invaild message of digit
 */
public class NoDigitException extends Exception{

	public NoDigitException() {
		
		super("The password must contain at least one digit");
		
	}
}
