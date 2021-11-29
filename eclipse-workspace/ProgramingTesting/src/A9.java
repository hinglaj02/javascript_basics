interface A8
{
	void print();
	
}

interface A7
{
	void show();
	
}
public class A9 implements A8, A7{

	public void print()
	{
		System.out.println("Class1");
	}
	
	public void show()
	{ System.out.println("Class2");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
A9 obj = new A9();
obj.print();
obj.show();
	}

}
