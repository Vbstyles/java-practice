package loops;
import java.util.Scanner;
public class power {

	public static void main(String[] args) {
		
		System.out.println("Enter The Number:");
		
		int a,i,n,r;
		
		Scanner z = new Scanner(System.in);
		
		n = z.nextInt();
		 
		System.out.println("Enter The Power:");
		
		a = z.nextInt();
		
		r=1;
		
		for (i=a;i>0;i--)
		{
			r = n*r;
			
		}
		
		System.out.println("The Output Is " + r);
		
	}
	
}
