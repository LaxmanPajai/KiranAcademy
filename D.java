//4. write a program to print number from 11 to -33, decrement number by 4

package loops;

public class D {

	
	    public static void main(String[] args) {
	       
	        System.out.println("Using for loop:");
	        for (int i = 11; i >= -33; i -= 4) {
	            System.out.print(i + " ");
	        }
	        System.out.println("");

	     
	        System.out.println("Using while loop:");
	        int j = 11;
	        while (j >= -33) {
	            System.out.print(" ");
	            j -= 4;
	        }
	        System.out.println("");

	        
	        System.out.println("Using do-while loop:");
	        int k = 11;
	        do {
	            System.out.print(k + " ");
	            k -= 4;
	        } while (k >= -33);
	        System.out.println();
	    }
	}


