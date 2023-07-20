import java.util.Scanner;
class input 
{
	public static void main(String[] args)
	{
		Scanner x= new Scanner(System.in);
		System.out.print("Enter your name: ");
		String s=x.nextLine();
		
		System.out.println("entered  string is:"+s);
		
		System.out.print("enter integer ");
		int a=x.nextInt();
		System.out.println(a);
		
		System.out.print("Enter float variable ");
		float b=x.nextFloat();
		System.out.println(b);
	}
}	
		