package Encapsulation;

class Detail{
	private int r;
	private String n;
	private float fee;
	
	Detail( int r, String n, float fee){
		this.r=r;
		this.n=n;
		this.fee=fee;
	}
	void display() {System.out.println(r+" "+n+ "  "+fee );}
	
}
public class example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Detail obj = new Detail(12,"hello",2000f);
Detail obj1 =  new Detail(13, "hello1", 300f);
obj.display();
obj1.display();
	}

}
