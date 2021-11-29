package Polymorphism;

class H
{
	public int k = 10;
	public void run(){System.out.println("class1");}
}
class h1 extends H { int k = 20;
public void run(){System.out.println("class2");}
}

public class ridding3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 H obj = new h1();
 System.out.println(obj);// address is printed
 System.out.println(obj.k);//data members cannot be overridden
	
	obj.run();// methods are overridden}

}}
