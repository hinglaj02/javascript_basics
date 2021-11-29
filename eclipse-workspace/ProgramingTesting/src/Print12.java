// MULTIPLE INHERITANCE VIA INTERFACE WITH SAME METHOD NAME


 interface print11
 {void print();}
 interface  print13{ void print();}
 
 
public class Print12 implements print11, print13 {
 public void print() { System.out.println("Hello");}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Print12 p = new Print12();
 p.print();
	}

}
