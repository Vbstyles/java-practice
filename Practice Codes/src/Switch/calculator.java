package Switch;
import java.util.Scanner;
public class calculator {

	public static void main(String[] args) {
		int a,b,d;
		
		Scanner z = new Scanner(System.in);
		
		System.out.println("Enter The First Number:");
		
		a = z.nextInt();
		
		System.out.println("Enter The Second Number:");
		
		b= z.nextInt();
		
		System.out.println("Enter The Number Of Arithematic Operator:");
		
		z.nextLine();
		
		char co = z.nextLine().charAt(0);
		
		switch (co) {
		
		case '+': 
			System.out.println(a+b);
			break;
			
		case '-':
			System.out.println(a-b);
			break;
			
		case '*':
			System.out.println(a*b);
			break;
			
		case '/':
			System.out.println(a/b);
			break;
			
			default:System.out.println("Wrong Choice Bitch ");
			
		}
		
	}

}
