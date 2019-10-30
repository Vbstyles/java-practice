package scanner;
import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {
		
		Scanner a = new Scanner(System.in);
		
		System.out.println("Enter the Principal: ");
		
		int principal = a.nextInt();
		
		System.out.println("Enter the Rate of Interest: ");
		
		float rate = a.nextFloat();
		
		System.out.println("Enter the Time: ");
		
		float time = a.nextFloat();
		
		float SimpleInterest = principal * time * rate / 100;
		
		System.out.println("The Simple Interest is " +SimpleInterest);
		

	}

}