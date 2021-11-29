package Encapsulation;

class A
{
	private int a;
	public int getAge() {
	return a+1;}
	
	public void setAge( int a) {
		this.a = a;
	}}

	public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 A obj =  new A();
 obj.setAge(12);
 System.out.println("Old age is 12 new age is " +obj.getAge());
 


	}

}
