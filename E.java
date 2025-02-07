//1) write a program to count even number from 111 to 212;

package loops;

public class E {

	    public static void main(String[] args) {
	        int count = 0;

	        // Using for loop
	        System.out.println("Using for loop:");
	        for (int i = 111; i <= 212; i++) {
	            if (i % 2 == 0) {  // Check if number is even
	                count++;
	            }
	        }
	        System.out.println("Total even numbers: " + count + "\n");

	        // Using while loop
	        System.out.println("Using while loop:");
	        count = 0;
	        int j = 111;
	        while (j <= 212) {
	            if (j % 2 == 0) {
	                count++;
	            }
	            j++;
	        }
	        System.out.println("Total even numbers: " + count + "\n");

	        // Using do-while loop
	        System.out.println("Using do-while loop:");
	        count = 0;
	        int k = 111;
	        do {
	            if (k % 2 == 0) {
	                count++;
	            }
	            k++;
	        } while (k <= 212);
	        System.out.println("Total even numbers: " + count);
	    }
	}


