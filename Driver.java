/* Name:       Dan Wilder
 * Class:      CMP SCI 2261 - E01
 * Due Date:   22 September 2014
 */

public class Driver {
  public static void main(String[] args){
		     
    int upperLimit = Integer.parseInt(args[0]);
    int count = 0;
    	
    // Ordered list of prime numbers between 2 - UPPER_LIMIT
	PrimeNumberList primes = new PrimeNumberList(upperLimit);
	      
        System.out.println("\nCalculating twin primes:\n");
	// Loop over each element in the list of prime numbers
	for(int i = 1; i < primes.length(); i++) {
	  if (primes.getValue(i) - primes.getValue(i-1) == 2) {
	    ++count;  
	    String output = "(" + primes.getValue(i-1) + ", " + primes.getValue(i) + ")";
            System.out.println(output);
	  }
	}
	
	System.out.println("\n\nUpper Limit: " + upperLimit);
	System.out.println("\nNumber of Primes: " + primes.length());
        System.out.println("\nNumber of twin prime pairs: " + count);
	System.out.println("\nPrime Density: " + (float)primes.length() / upperLimit);
  }
}
