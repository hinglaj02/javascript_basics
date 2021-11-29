class Customer
{
	int age;
	String fullname;

	
	void insertRecord(int a, String n)
	{
		age = a;
		fullname = n;
		
	}
	void displayInformation()
	{
		System.out.println(age+""+fullname);
		
	}
	
	
	
}
class Customer1{
	public static void main(String args[])
	{
		
		Customer1 c2 = new Customer1();
		Customer1 c3 = new Customer1();
		
		c2.insertRecord("Hari",82);
		c3.insertRecord("Radha",80);
		
	

	}
	

	private void insertRecord(String string, int i) {
		// TODO Auto-generated method stub
		
	}
}