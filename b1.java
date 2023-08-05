class A  // method overloading 
{ 
void display()
	{
	System.out.println("first method");
	}
void display(int x)
	{
	System.out.println("second  method"+x);
	}
	void display(int x,int y)
	{
	System.out.println("third  method"+(x+y));
	}
double display(double x,double y)
	{
	return x+y;
	
	}
	
}


class b1
{
	public static void main(String[] args)
	{
		 A a1=new A();
		a1.display();
		a1.display(10);
		a1.display(10,10);
		double x=a1.display(10.0,20.0);
		System.out.println(x);
	}
}

	
