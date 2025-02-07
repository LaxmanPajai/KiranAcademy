//2. write a program to print number from 44 to 22 - used for,while and do while loop

package loops;

public class B {
	
	    public static void main(String[] args) {
	        // Using for loop
	        System.out.println("Using for loop:");
	        for (int i = 44; i >= 22; i--) {
	            System.out.print(i + " ");
	        }
	        System.out.println("\n");

	        // Using while loop
	        System.out.println("Using while loop:");
	        int j = 44;
	        while (j >= 22) {
	            System.out.print(j + " ");
	            j--;
	        }
	        System.out.println("\n");

	        // Using do-while loop
	        System.out.println("Using do-while loop:");
	        int k = 44;
	        do {
	            System.out.print(k + " ");
	            k--;
	        } while (k >= 22);
	        System.out.println();
	    }
	}

