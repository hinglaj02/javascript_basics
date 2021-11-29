

abstract class Shape23
{
	abstract void circle();
	abstract void square();
	
}

class Circle23 extends Shape23
{

	@Override
	void circle() {
		// TODO Auto-generated method stub
		System.out.println("this is circle");
	}

}

class Square23 extends Shape23
{
	void square()
	{
		System.out.println("This square");
	}

	@Override
	void circle() {
		// TODO Auto-generated method stub
		
	}
}

	
	
public class abs_shape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Shape23 s1 = new Circle23();
s1.circle();
Shape23 s2 = new Square23();
s2.square();
	}

}
