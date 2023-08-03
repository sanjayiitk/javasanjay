class a
{ 
void display()
	{
	System.out.println("first method");
	}
void display(int x)
	{
	System.out.println("second  method"+x);
	}
	void display(int x)
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
		a.display();
		a.display(10);
		a.display(10,10);
		double x=a.display(10.0,20.0);
		System.out.println(x);
	}
}

	
