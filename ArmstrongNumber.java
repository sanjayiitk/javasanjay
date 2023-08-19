import java.lang.Math;
import java.util.*;
public class ArmstrongNumber 
{
	
	
	// Function to calculate order of the number
    static int order(int x)
    {
        int n = 0;
        while (x>0) 
		{
            n++;
            x = x / 10;
        }
        return n;      // return order of given number 
    }
	
	
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number ");
		int n = sc.nextInt();
		int temp = n;
		int p = 0;    // variable for sum of number enter 
		int order1=0;    // intialize order variable 

         order1=order(temp);        // call order function to calculate order of number enter

		while (n > 0)
			{
			int rem = n % 10;
			p=p+((int)Math.pow(rem,order1)); // use type casting as number pow return double     
			n = n / 10;
		    }

		
		if (temp == p) 
		{
			System.out.println("Yes. It is Armstrong No.");
		}
		else 
		{
			System.out.println(
				"No. It is not an Armstrong Number");
		}
	}
}
