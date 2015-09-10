/* Name:       Dan Wilder
 * Class:      CMP SCI 2261 - E01
 * Due Date:   22 September 2014
 */

public class PrimeNumberList {
	
  /* This class uses the Sieve of Eratosthenes algorithm for 
   * for generating all prime numbers up to a given limit then
   * stores the result in an array to be accessed by the user.
   */
			 
  private int[] data;    // Storage for prime numbers
  
/*****************************************************************************/
  
  public PrimeNumberList() {
	  
    // Default constructor -> Stores only the first prime number, 2
			  
    data = new int[1];
    data[0] = 2;
  }
  
/*****************************************************************************/
		  
  public PrimeNumberList(int upperLimit) {
		  
    boolean[] isComposite = new boolean[upperLimit + 1];
	  /* Array to keep track of which numbers are composite. 
	   * The boolean value at an index represents whether the
	   * numerical value of that index is composite. 
	   * Default initialization sets all to false. 
	   */
			  
    // Sieve of Eratosthenes: --> Identify composite numbers
	for (int p = 2; p*p <= upperLimit; p++) {
      if (isComposite[p] == false) {
    	
	    // If p is prime, mark multiples of it as composite
		for (int multiple = p; p*multiple <= upperLimit; multiple++) {
		  isComposite[p*multiple] = true;
		}
      }
    }
	
    // Count the primes
	int numPrime = 0;
    for (int i = 2; i <= upperLimit; i++) {
      if (isComposite[i] == false)
        numPrime++;
	} 
		    
	// Create and store the primes into member attribute 'data'
	data = new int[numPrime];
	int index = 0;
	for (int i = 2; i <= upperLimit; i++) {
	  if (isComposite[i] == false) {
	    data[index] = i;
	    index++;
	  }
	}
		    
  } 
  
/*****************************************************************************/	 
  
  public int length() {
    return data.length;
  }
  
/*****************************************************************************/ 
  
  public int getValue(int index) {
    return data[index];
  }
  
/*****************************************************************************/

}
