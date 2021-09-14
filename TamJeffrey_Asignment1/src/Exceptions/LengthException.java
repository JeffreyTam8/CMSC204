package Exceptions;
/**
 * Assignment 1 PasswordCheckerUtility
 * 9/14/2021
 * CMSC 204
 * CRN: 23452
 * @author Jeffrey Tam
 * 
 * This class sends an invaild message of length
 */
public class LengthException extends Exception{

	
	public LengthException() {
		
		super("The password must be at least 6 characters long");
		
	}
	
}
