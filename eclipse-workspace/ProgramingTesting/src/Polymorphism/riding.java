package Polymorphism;

class X
{
	void a()
	{System.out.println("class x");}
	
}

class Y extends X
{
	void a()
	{System.out.println("class y");}
	
	}

public class riding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
X x = new X();
X y = new Y();//up casting
x.a();
y.a();
	}

}
