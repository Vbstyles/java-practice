package loops;
import java.util.Scanner;
public class ForLoops {

	public static void main(String[] args) {
		int i,n,f=1;
		
		Scanner z = new Scanner(System.in);
		
		System.out.println("Enter The Number Whose Factorial You Want To Determine:");
		
		n = z.nextInt();
		
		for( i=n ; i>0 ; i--)
		{
			f = f*i;
		}
		
		System.out.println("The Factorial Of "+n+" is " +f);

	}

}