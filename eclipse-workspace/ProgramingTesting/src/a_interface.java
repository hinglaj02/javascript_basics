interface printable1
{
	void print();
}
public class a_interface implements printable1 {
public void print()
{
	System.out.println("hello");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
a_interface obj = new a_interface();
obj.print();
	}

}
