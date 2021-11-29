package Polymorphism;

class A
{
	void test() { System.out.println("Animal");}}

class D extends A {
	void test() { System.out.println("Dog");
}
void test1()
{System.out.println("Bard");}

}
public class riding2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A a = new A();
		A b = new D();
		D c = new D();// because test2 mehtod is not present in class A 
		a.test();
		b.test();
		c.test1();
	

	}

}
