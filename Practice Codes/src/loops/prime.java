package loops;

public class prime {
public static void main(String[] args) {
	
	int a=0,b,c,d,i,n;
	
	System.out.println("The Prime Numbers From 1 to 100 are :");
	
	for (i=2;i<=100;i++)
	{a=0;
		for (n=2;n<i;n++)
		{
			if(i%n == 0)
			{
				a++;
			}
			
		}
		if(a==0)
			System.out.println(i);
	}
	
}

}
