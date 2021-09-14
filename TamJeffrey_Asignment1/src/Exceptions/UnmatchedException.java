package Exceptions;
/**
 * Assignment 1 PasswordCheckerUtility
 * 9/14/2021
 * CMSC 204
 * CRN: 23452
 * @author Jeffrey Tam
 * 
 * This class sends an invaild message of matching passwords
 */
public class UnmatchedException extends Exception{

	public UnmatchedException() {
		
		
		super("The passwords do not match");

		
	}
	
	
}
