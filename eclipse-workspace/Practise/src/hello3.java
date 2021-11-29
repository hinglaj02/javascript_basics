


public class hello1
{

    int s1 = 10;

    public void printName(){

        System.out.println(s1);

    }

}

class hello2 extends hello3
{

    int s1 = 20;

    public void printname(){

        System.out.println(s1);

    }
    
    public class hello3

    public static void main(String[] args){

        hello2 obj = new hello2();

        obj.printName();

    }

}