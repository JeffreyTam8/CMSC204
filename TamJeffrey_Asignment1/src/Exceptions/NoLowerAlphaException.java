package Exceptions;
/**
 * Assignment 1 PasswordCheckerUtility
 * 9/14/2021
 * CMSC 204
 * CRN: 23452
 * @author Jeffrey Tam
 * 
 * This class sends an invaild message of lower case letter
 */
public class NoLowerAlphaException extends Exception{

	
	public NoLowerAlphaException() {
		
		super("The password must contain at least one lower case alphabetic character");
		
	}
}
