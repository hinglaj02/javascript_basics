
class Customer
{
	int age;
	String fullname;
	String text1;
	String text2;


		
	void insertRecord(int a, String n)
	{
		age = a;
		fullname = n;
		
	}
	void displayInformation()
	{
		System.out.println(age+"  "+fullname);}
	}

	class Customer1
	{
	public static void main(String args[])
	{
		Customer c1 =  new Customer();
		Customer c2 = new Customer();

		c1.insertRecord(12,"abc");
		c2.insertRecord(21,"abc");
		c1.displayInformation();
		c2.displayInformation();
		
		
		
	}

	}

	
	