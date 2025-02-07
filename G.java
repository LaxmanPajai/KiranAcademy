//3) write a program to square of number from 10 to 44;
package loops;

public class G {
	
	    public static void main(String[] args) {
	        // Using for loop
	        System.out.println("Using for loop:");
	        for (int i = 10; i <= 44; i++) {
	            System.out.println("Square of " + i + " = " + (i * i));
	        }
	        System.out.println();

	        // Using while loop
	        System.out.println("Using while loop:");
	        int j = 10;
	        while (j <= 44) {
	            System.out.println("Square of " + j + " = " + (j * j));
	            j++;
	        }
	        System.out.println();

	        // Using do-while loop
	        System.out.println("Using do-while loop:");
	        int k = 10;
	        do {
	            System.out.println("Square of " + k + " = " + (k * k));
	            k++;
	        } while (k <= 44);
	    }
	}



