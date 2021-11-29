package Polymorphism;

class c1
{
	void show() {System.out.println("Show1");}
}

class c2 extends c1
{ 
	void show() {System.out.println("show2");}
}
public class ridding4 extends c2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
c1 obj = new ridding4();
System.out.println(obj);
obj.show();
	}

}
