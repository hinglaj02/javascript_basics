 class one
{
	public void print_while()
	{ 
		System.out.println("while");
		
		}
	}
	class two extends one
	{
		public void print_for()
		{
			System.out.println("for");
			
		}
	}
	class hello
	{
		public static void main(String args[])
		{
			two f = new two();
			f.print_while();
			f.print_for();
			f.print_while();
		}
		}
	