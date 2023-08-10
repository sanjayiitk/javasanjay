class sum {
  int x, y;

  sum(int x, int y) {
    this.x = x;
    this.y = y;
  }

  final void display()             //finoverride.java:26: error: display() in sub cannot override display() in sum void display()
 
  {
	  
  System.out.println("sum is :"+(x+y));
  }
}

class sub extends sum 
{
  int  z;

  sub(int x, int y, int z)
  {
    super(x,y);
    this.z = z;
  }

  void display() {
    System.out.println("subtraction is " + ((y+z)-x));
  }
}

class finoverride {
  public static void main(String[] args) {
    sum s1 = new sum(10, 20);
    s1.display();
    sub s2 = new sub(10, 20, 5);
    s2.display();
  }
}