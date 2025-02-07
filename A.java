//1.write a  java program to print number from 1 to 10 - used for,while and do while loop

package loops;

public class A 
	{
	    public static void main(String[] args) {
	        // Using for loop
	        System.out.println("Using for loop:");
	        for (int i = 1; i <= 10; i++) {
	            System.out.print(i + " ");
	        }
	        System.out.println("\n");

	        // Using while loop
	        System.out.println("Using while loop:");
	        int j = 1;
	        while (j <= 10) {
	            System.out.print(j + " ");
	            j++;
	        }
	        System.out.println("\n");

	        // Using do-while loop
	        System.out.println("Using do-while loop:");
	        int k = 1;
	        do {
	            System.out.print(k + " ");
	            k++;
	        } while (k <= 10);
	        System.out.println();
	    }
	}



