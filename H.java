// write a program to cube of number from 51 to 21;

package loops;

public class H {
	
	    public static void main(String[] args) {
	        // Using for loop
	        System.out.println("Using for loop:");
	        for (int i = 51; i >= 21; i--) {
	            System.out.println("Cube of " + i + " = " + (i * i * i));
	        }
	        System.out.println();

	        // Using while loop
	        System.out.println("Using while loop:");
	        int j = 51;
	        while (j >= 21) {
	            System.out.println("Cube of " + j + " = " + (j * j * j));
	            j--;
	        }
	        System.out.println();

	        // Using do-while loop
	        System.out.println("Using do-while loop:");
	        int k = 51;
	        do {
	            System.out.println("Cube of " + k + " = " + (k * k * k));
	            k--;
	        } while (k >= 21);
	    }
	}


