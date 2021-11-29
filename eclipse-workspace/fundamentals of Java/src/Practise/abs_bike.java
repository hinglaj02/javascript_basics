package Practise;

abstract class Bike
{
abstract void run();	
	}

class Honda extends Bike
{
	public void run()
	{
		System.out.println("Drive Safe");
		
	}
	}

public class abs_bike {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Bike h = new Honda();
h.run();


	}

}
