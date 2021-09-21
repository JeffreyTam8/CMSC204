/**
 * Jeffrey Tam
 * 9/20/2021
 * CMSC 204
 * CRN: 23452
 */

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradebookTester {

	GradeBook g1;
	GradeBook g2;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		
		g1 = new GradeBook(5);	//Grade book 1
		g1.addScore(10.0);
		g1.addScore(20.0);
		g1.addScore(30.0);
		g1.addScore(40.0);
		g1.addScore(50.0);
		
		g2 = new GradeBook(5);	//Grade book 2
		g2.addScore(75.0);
		g2.addScore(85.0);
		g2.addScore(95.0);
		g2.addScore(100.0);
		
	}

	@AfterEach
	void tearDown() throws Exception {
		
		g1 = null;
		g2 = null;
		
	}

	/**
	 * Test if the scores did add to the grade book by using the toString method
	 */
	@Test
	void testAddScore() {
		
		assertEquals("10.0 20.0 30.0 40.0 50.0 ", g1.toString());	//Test grade book 1
		assertEquals("75.0 85.0 95.0 100.0 ", g2.toString());		//Test grade book 2
	}
	
	/**
	 * Test if the scores added up 
	 */
	@Test
	void testSum() {
		
		assertEquals(150.0 , g1.sum()); //Test grade book 1 sum
		assertEquals(355.0, g2.sum());	//Test grade book 2 sum
		
	}
	
	/**
	 * Test to see the lowest score in the grade book
	 */
	@Test
	void testMinimum() {
	
		assertEquals(10.0, g1.minimum()); //Test grade book 1 minimum
		assertEquals(75.0, g2.minimum());	//Test grade book 2 minimum
		
	}

	/**
	 * Test the final score of the grade book by using the finalScore method in GradeBook
	 */
	@Test
	void testFinalScore() {

		assertEquals(140.0, g1.finalScore());	//Test grade book 1 final score
		assertEquals(280.0, g2.finalScore());	//Test grade book 2 final score
		
	}
}
