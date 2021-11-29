package Method;
class A
{
	public void method() {
		System.out.println("no arguments");
	}
	 public void method(int i)
	 {
		 System.out.println("single argument"+i);
		 
	 }
	 public void method(int i, int z) { System.out.println(i +""+z);}
}
public class example1 {
	
	public static void main(String args[])
	{
		A obj = new A();
		A obj1 = new A();
		A obj2 = new A();
		obj.method();
		obj1.method(2);
	obj2.method(3,3);	
	}

}
