package Exceptions;
/**
 * Assignment 1 PasswordCheckerUtility
 * 9/14/2021
 * CMSC 204
 * CRN: 23452
 * @author Jeffrey Tam
 * 
 * This class sends an invaild message of upper case letter
 */
public class NoUpperAlphaException extends Exception{

	
	public NoUpperAlphaException() {
		
		super("The password must contain at least one uppercase alphabetic character");
		
	}
}
