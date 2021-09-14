package Exceptions;
/**
 * Assignment 1 PasswordCheckerUtility
 * 9/14/2021
 * CMSC 204
 * CRN: 23452
 * @author Jeffrey Tam
 * 
 * This class sends an invaild message of weak passwords
 */
public class WeakPasswordException extends Exception{

	public WeakPasswordException() {
		
		super("The password is OK but weak - it contains fewer than 10 characters");
		
	}
	
}
