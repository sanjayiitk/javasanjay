class box 
{
    int l,b;
    int i,j;

    box(int l,int b)
    {
        this.l=l;
        this.b=b;
    }
    int dispaly1()
    {
        return l*b;
    }

    box(int l,int b,int i,int j)
    {
        this(l,b);
        this.i=i;
        this.j=j;

    }
    int dispaly2()
    {
        return i*j;
    }
    
}

public class cons 
{
    public static void main(String[] args) 
	{
        box x = new box(5, 5);        
        System.out.println(x.dispaly1());
		
        box y = new box(5, 10, 5, 7);
        System.out.println(y.dispaly2());
    }

}
