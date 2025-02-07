//2. write a program to print number from 44 to 22 - used for,while and do while loop

package loops;

public class B {
	
	    public static void main(String[] args) {
	       
	        System.out.println("Using for loop:");
	        for (int i = 44; i >= 22; i--) {
	            System.out.print( " ");
	        }
	        System.out.println("\n");

	       
	        System.out.println("Using while loop:");
	        int j = 44;
	        while (j >= 22) {
	            System.out.print( " ");
	            j--;
	        }
	        System.out.println("");

	      
	        System.out.println("Using do-while loop:");
	        int k = 44;
	        do {
	            System.out.print(k + " ");
	            k--;
	        } while (k >= 22);
	        System.out.println();
	    }
	}

