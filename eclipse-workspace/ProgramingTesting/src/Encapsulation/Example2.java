package Encapsulation;

class Detail1{
	private int a;
	private String b;
	private long c;
	
	public int setA() { return a;}
	public void getA(int a) {this.a =a;}
	
	public String setB() { return b; }
	public String getB(String b) { return this.b=b; }
	
	public long setC() {return c;}
	public void getC(long c) {this.c=c;}
	
	
	
	}
	

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Detail1 obj = new Detail1();
obj.setA(34);
obj.setB("AAAA");
obj.setC(3432L);

System.out.println(obj.getA()+""+obj.getB()+"  "+obj.getC());
	}

}
