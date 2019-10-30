package loops;
import java.util.Scanner;
public class fibonacci {

	public static void main(String[] args) {
		
		int a,b,n,i,f=0;
		
	Scanner z = new Scanner(System.in);
	
	System.out.println("Enter The Number Of Terms Of The Fibonacci Series:");
	
		n = z.nextInt();
		
		a=0;
		b=1;
		
		System.out.print(a+", " );
		System.out.print(b+", ");
		
		for(i = 0 ; i <= n-2 ; i++)
		{
			f = a + b;
			
			System.out.print(f + ", ");
			
			a = b;
			b = f;
		}
		

	}

}
