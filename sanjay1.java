final class  sanjay  // class sanjay begin
{
void display()
 {
System.out.print("i am in sanjay class");
 }
}    // class sanjay end 

class sanjay1 extends sanjay   //cannot inherit from final sanjay
{
public static void main(String[] args)
{
	sanjay a=new sanjay();
	a.display();
}
}