
import java.util.Scanner;

public class Triangle {
	
	public static void main (String args[]) {
		
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a base value");
		int base = input.nextInt();
		int evenOdd = 1;
		
		if (base % 2 == 0) {
			
			
		
			for (int i = 2; i<= base; i = i + 2) {
				for (int j = base-i; j>1; j=j-2) {
					System.out.print(" ");
				}
				for (int k = 1; k<=i; k++) {
					System.out.print("*");
				}
				System.out.println("");
			}
		
		} else {

			for (int i = 1; i<= base; i = i + 2) {
				for (int j = base-i; j>1; j=j-2) {
					System.out.print(" ");
				}
				for (int k = 1; k<=i; k++) {
					System.out.print("*");
				}
				System.out.println("");
			}
			
		}
	}
	
}
