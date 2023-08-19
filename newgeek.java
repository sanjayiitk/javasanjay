package p2;
import p1.*;

class newgeek
{
public static void main(String[] args)
{
geek obj= new geek();// accessing class geek from package p1
obj.display();
// newgeek.java:9: error: display() is not public in geek; cannot be accessed from outside package obj.display();
}
}