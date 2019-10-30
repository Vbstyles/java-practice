package conditionalStatements;
import java.util.Scanner;

public class greatest {

	public static void main(String[] args) {
		
		Scanner z = new Scanner(System.in);
		
		System.out.println("Enter the First Number:");
		
		int a = z.nextInt();
		
		System.out.println("Enter the Second Number:");
		
		int b = z.nextInt();
		
		System.out.println("Enter the Third Number:");
		
		int c = z.nextInt();
		
		if (a>b) {
			
			if (a>c) {
				System.out.println(a +" is the Greatest Number");
			}
			
			else {
				System.out.println(c +" is the Greatest Number");
				}
		}
	
		else if (b>a) {
			
			if (b>c) {
				System.out.println(b +" is the Greatest Number");
			}
			else {
				System.out.println(c +" is the Greatest Number");
			}
			
		}
		
		else {
			System.out.println(" 2 Numbers are of same value");
		}

	}

}