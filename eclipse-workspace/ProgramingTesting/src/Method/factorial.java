package Method;
import java.util.*;


public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n; int fact = 0;
Scanner sc = new Scanner(System.in);
System.out.println("enter your no.");
n = sc.nextInt();

fact = factcal(n);
System.out.prinln(fact);

	}
	

static int factcal(int x)
{
	int fact =1;
	if(x==0)
		return fact;
	for(int i =1; i<=x; i++)
	{
		fact =fact*i;
	}
	return fact;
}}



	


