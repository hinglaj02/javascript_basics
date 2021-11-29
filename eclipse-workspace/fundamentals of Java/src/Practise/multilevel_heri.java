package Practise;

class one
{
	public void print_while()
	{
		System.out.println("while1");
		}
	}

class two extends one
{
	public void print_for()
	{
		System.out.println("for");
		
	}
}
class three extends two
{
	public void print_while()
	{
		System.out.println("while3");
		
	}
}
	

public class multilevel_heri {
	
	public static void main(String args[]) {
		
	
	
	three f1 = new three();

	f1.print_while();
	f1.print_for();
	f1.print_while();
	
	two f2 = new two();
	f2.print_while();
	 
	
	

}}
