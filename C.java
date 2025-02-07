//3. write a program to print number from 55 to 88, increment number by 3

package loops;

public class C {

	
	
	    public static void main(String[] args) {
	        // Using for loop
	        System.out.println("Using for loop:");
	        for (int i = 55; i <= 88; i += 3) {
	            System.out.print(i + " ");
	        }
	        System.out.println("\n");

	        // Using while loop
	        System.out.println("Using while loop:");
	        int j = 55;
	        while (j <= 88) {
	            System.out.print(j + " ");
	            j += 3;
	        }
	        System.out.println("\n");

	        // Using do-while loop
	        System.out.println("Using do-while loop:");
	        int k = 55;
	        do {
	            System.out.print(k + " ");
	            k += 3;
	        } while (k <= 88);
	        System.out.println();
	    }
	}


