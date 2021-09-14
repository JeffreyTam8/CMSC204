package Exceptions;
/**
 * Assignment 1 PasswordCheckerUtility
 * 9/14/2021
 * CMSC 204
 * CRN: 23452
 * @author Jeffrey Tam
 * 
 * This class sends an invaild message of sequence
 */
public class InvalidSequenceException extends Exception{

	
	public InvalidSequenceException() {
		
		super("The password cannot contain more than two of the same character in sequence");
		
	}
	
}
