//2) write a program to count odd number from 12 to 45;

package loops;

public class F {
	
	    public static void main(String[] args) {
	        int count = 0;

	        // Using for loop
	        System.out.println("Using for loop:");
	        for (int i = 12; i <= 45; i++) {
	            if (i % 2 != 0) {  // Check if number is odd
	                count++;
	            }
	        }
	        System.out.println("Total odd numbers: " + count + "\n");

	        // Using while loop
	        System.out.println("Using while loop:");
	        count = 0;
	        int j = 12;
	        while (j <= 45) {
	            if (j % 2 != 0) {
	                count++;
	            }
	            j++;
	        }
	        System.out.println("Total odd numbers: " + count + "\n");

	        // Using do-while loop
	        System.out.println("Using do-while loop:");
	        count = 0;
	        int k = 12;
	        do {
	            if (k % 2 != 0) {
	                count++;
	            }
	            k++;
	        } while (k <= 45);
	        System.out.println("Total odd numbers: " + count);
	    }
	}


