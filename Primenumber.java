import java.util.*;

public class Primenumber {

	public static int isPrime(int n)
	{
		int flag=1;
		if (n==0||n==1)
		{
				flag=0;
			return flag;
		}

		if (n==2) 
		{
		
			return flag;
		}

		for (int i=2; i<=n;i++) /// problem here 
			{
			
			if (n%i==0)
		      {
				 flag=0;
				return flag;
			  }
			  
		    }

          return flag;
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter lower bound of the interval: ");
		int lower = sc.nextInt();

		System.out.print("\nEnter upper bound of the interval: ");
		int upper = sc.nextInt();

		System.out.printf("\nPrime numbers between %d and %d are: ", lower, upper);

		
	        int i=3;
			if (isPrime(i)==1) 
			{
				System.out.print(i + " ");
			}
		
	}
}
