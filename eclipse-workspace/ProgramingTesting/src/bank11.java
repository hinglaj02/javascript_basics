
abstract class bank2
{
	abstract int interest();
}

class sbi1 extends bank2{
	int interest()
	{
		return 11;
		
	}
}

class pnb1 extends bank2{
	int interest()
	{
		return 12;
		
	}
}
public class bank11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
bank2 b2 = new sbi1();
int i = b2.interest();
System.out.println("rate of interst is" +i);


	}

}
