package application;
/**
 * Assignment 1 PasswordCheckerStudent_Test
 * 9/14/2021
 * CMSC 204
 * CRN: 23452
 * @author Jeffrey Tam
 * 
 * This class checks if passwords meet certain requirements
 * Passwords that do not meet requirements will return fail message
 */

import Exceptions.InvalidSequenceException;
import Exceptions.NoDigitException;
import Exceptions.NoLowerAlphaException;
import Exceptions.NoSpecialCharacterException;
import Exceptions.UnmatchedException;
import Exceptions.WeakPasswordException;
import Exceptions.LengthException;
import Exceptions.NoUpperAlphaException;

///////////////////////////////////////////////

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Assignment 1 PasswordCheckerStudent 
 * This is a junit test that test passwords that are invaild are invalid 
 * And Passwords that are vaild are valid, based on functions in the PasswordCheckerUtility
 * 
 * 9/14/2021
 * CMSC 204
 * CRN: 23452
 * @author Jeffrey Tam
 */
public class PasswordCheckerSTUDENT_Test {

	@Before
	public void setUp() throws Exception {
		
	}

	@After
	public void tearDown() throws Exception {
	
	}

	/**
	 * Test if the password is less than 6 characters long.
	 * This test should throw a LengthException for second case.
	 */
	@Test
	public void testIsValidPasswordTooShort() throws LengthException
	{
		String acceptPassword = "Triangle3/\\";
		String unacceptedPassword = "RRs!1";
		try {
			assertTrue(PasswordCheckerUtility.isValidLength(acceptPassword));
			assertFalse(PasswordCheckerUtility.isValidLength(unacceptedPassword));
		}catch (LengthException e) {
			
			
		}
		

	}
	
	/**
	 * Test if the password has at least one uppercase alpha character
	 * This test should throw a NoUpperAlphaException for second case
	 */
	@Test
	public void testIsValidPasswordNoUpperAlpha() throws NoUpperAlphaException
	{
		String acceptPassword = "Triangle3/\\";
		String unacceptedPassword = "rrstlnehdgo1!";
		try {
			assertTrue(PasswordCheckerUtility.hasUpperAlpha(acceptPassword));
			assertFalse(PasswordCheckerUtility.hasUpperAlpha(unacceptedPassword));
		}catch (NoUpperAlphaException e) {
			
			
		}
	}
	
	/**
	 * Test if the password has at least one lowercase alpha character
	 * This test should throw a NoLowerAlphaException for second case
	 */
	@Test
	public void testIsValidPasswordNoLowerAlpha() throws NoLowerAlphaException
	{
		String acceptPassword = "Triangle3/\\";
		String unacceptedPassword = "RRSTLNEHDGO1!";
		
		try {
			assertTrue(PasswordCheckerUtility.hasLowerAlpha(acceptPassword));
			assertFalse(PasswordCheckerUtility.hasLowerAlpha(unacceptedPassword));
		}catch (NoLowerAlphaException e) {
			
			
		}
	}
	/**
	 * Test if the password has more than 2 of the same character in sequence
	 * This test should throw a InvalidSequenceException for second case
	 */
	@Test
	public void testIsWeakPassword() throws WeakPasswordException
	{
		String acceptPassWord = "Triangle3/\\";
		String unacceptedPassword = "rrstlne1!";
		
		try {
			assertFalse(PasswordCheckerUtility.isWeakPassword(acceptPassWord));
			
		}catch (WeakPasswordException e) {
			assertTrue(PasswordCheckerUtility.isWeakPassword(unacceptedPassword));
			
		}
	}
	
	/**
	 * Test if the password has more than 2 of the same character in sequence
	 * This test should throw a InvalidSequenceException for second case
	 */
	@Test
	public void testIsValidPasswordInvalidSequence() throws InvalidSequenceException
	{
		
		String acceptedPassword = "Triangle3/\\";
		String unacceptedPassword = "RRRstlnehdgo1!";
		
		try {
			assertTrue(PasswordCheckerUtility.hasSameCharInSequence(acceptedPassword));
			
		}catch (InvalidSequenceException e) {
			
			assertFalse(PasswordCheckerUtility.hasSameCharInSequence(unacceptedPassword));
			
		}
	}
	
	/**
	 * Test if the password has at least one digit
	 * One test should throw a NoDigitException
	 */
	@Test
	public void testIsValidPasswordNoDigit() throws NoDigitException
	{
		
		String acceptedPassword = "Triangle3/\\";
		String unacceptedPassword = "RRstlnehdgo!";
		
		try {
			assertTrue(PasswordCheckerUtility.hasDigit(acceptedPassword));
			assertFalse(PasswordCheckerUtility.hasDigit(unacceptedPassword));
		}catch (NoDigitException e) {
			
			
		}
	}
	
	/**
	 * Test correct passwords
	 * This test should not throw an exception
	 * @throws InvalidSequenceException 
	 * @throws NoSpecialCharacterException 
	 * @throws NoDigitException 
	 * @throws NoLowerAlphaException 
	 * @throws NoUpperAlphaException 
	 * @throws LengthException 
	 */
	@Test
	public void testIsValidPasswordSuccessful() throws LengthException, NoUpperAlphaException, NoLowerAlphaException, NoDigitException, NoSpecialCharacterException, InvalidSequenceException
	{
		assertTrue(PasswordCheckerUtility.isValidPassword("Triangle3/\\"));
	}
	
	/**
	 * Test the invalidPasswords method
	 * Check the results of the ArrayList of Strings returned by the validPasswords method
	 */
	@Test
	public void testInvalidPasswords() {
		
		ArrayList<String> passwords = new ArrayList<String>();
		
		passwords.add("Triangle3/\\");
		passwords.add("RRs!1");
		passwords.add("rrstlnehdgo1!");
		passwords.add("RRSTLNEHDGO1!");
		passwords.add("RRRstlnehdgo1!");
		passwords.add("RRstlnehdgo1");
		
		ArrayList<String> results = new ArrayList<String>(PasswordCheckerUtility.getInvalidPasswords(passwords));
		
		assertEquals(results.get(0), "RRs!1 -> The password must be at least 6 characters long");
		assertEquals(results.get(1), "rrstlnehdgo1! -> The password must contain at least one uppercase alphabetic character");
		assertEquals(results.get(2), "RRSTLNEHDGO1! -> The password must contain at least one lower case alphabetic character");
		assertEquals(results.get(3), "RRRstlnehdgo1! -> The password cannot contain more than two of the same character in sequence");
		assertEquals(results.get(4), "RRstlnehdgo1 -> The password must contain at least one special character");
	}
	
	/**
	 * Test if the password is less than 6 characters long.
	 * This test should throw a LengthException for second case.
	 */
	@Test
	public void testIsValidPasswordNoSpecialCharacters() throws NoSpecialCharacterException
	{
		String acceptedPassword = "Triangle3/\\";
		String unacceptedPassword = "RRstlnehdgo1";
		
		try {
			assertTrue(PasswordCheckerUtility.hasSpecialChar(acceptedPassword));
			assertFalse(PasswordCheckerUtility.hasSpecialChar(unacceptedPassword));
		}catch (NoSpecialCharacterException e) {
			
			
		}
		

	}
	
}
