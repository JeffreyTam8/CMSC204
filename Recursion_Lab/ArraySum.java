/**
 * This class contains a recursion method that calculates the sum of the given array
 * 9/21/2021
 * CMSC 204
 * CRN: 23452
 * @author Jeffrey Tam
 *
 */
public class ArraySum {

	
	/**
	 * This method takes the index of the argument to find the value of the array, by
	 * using the method itself. It stops using its own method when the method searches 
	 * the first index of the array. 
	 * @param a
	 * @param index
	 * @return The current index of the array or the current index of the array plus the sum of the
	 * previous array
	 */
	public int sumOfArray(Integer[] a, int index) {
		
		if(index == 0) {
			
			return a[index];
			
		}else {
		
			return a[index] + sumOfArray(a, index - 1);			
			
		}
		
	}
}
