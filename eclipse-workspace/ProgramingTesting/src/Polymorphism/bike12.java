package Polymorphism;

// 	BASIC EXAMPLE OF OVERRIDING
class V
{
	public void run() { System.out.println("Run1");}
	
	}
class v1 extends V
{
	public void run() {System.out.println("Run2");}
	
}

public class bike12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
v1 objv = new v1();

objv.run();

	}

}
